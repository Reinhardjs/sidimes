package com.sidimes.data.source.local;

import androidx.annotation.NonNull;

import com.sidimes.data.pojo.IbuHamil;
import com.sidimes.data.source.DataSource;
import com.sidimes.util.AppExecutors;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class IbuHamilDataSource implements DataSource<IbuHamil> {

    private LocalDatabase database;
    private static volatile IbuHamilDataSource INSTANCE;
    private AppExecutors mAppExecutors;

    public IbuHamilDataSource(@NonNull AppExecutors appExecutors, @NonNull LocalDatabase database) {
        mAppExecutors = appExecutors;
        this.database = database;
    }

    public static IbuHamilDataSource getInstance(@NonNull AppExecutors appExecutors, @NonNull LocalDatabase database) {
        if (INSTANCE == null) {
            synchronized (IbuHamilDataSource.class) {
                if (INSTANCE == null) {
                    INSTANCE = new IbuHamilDataSource(appExecutors, database);
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getItems(@NonNull final LoadItemsCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                final List<IbuHamil> tasks = database.ibuHamilDao().getItems();

                mAppExecutors.mainThread().execute(new Runnable() {
                    @Override
                    public void run() {
                            callback.onItemsLoaded(tasks);
                    }
                });
            }
        };

        mAppExecutors.diskIO().execute(runnable);
    }

    @Override
    public void getItem(@NonNull String taskId, @NonNull GetItemCallback callback) {

    }

    @Override
    public void saveItem(@NonNull final IbuHamil item) {
        checkNotNull(item);
        Runnable saveRunnable = new Runnable() {
            @Override
            public void run() {
                database.ibuHamilDao().insertItem(item);
            }
        };
        mAppExecutors.diskIO().execute(saveRunnable);
    }

    @Override
    public void deleteAllItems() {

    }

    @Override
    public void deleteItem(@NonNull String taskId) {

    }
}
