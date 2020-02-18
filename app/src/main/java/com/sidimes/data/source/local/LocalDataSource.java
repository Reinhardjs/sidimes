package com.sidimes.data.source.local;

import androidx.annotation.NonNull;

import com.sidimes.data.source.DataSource;
import com.sidimes.util.AppExecutors;

public class LocalDataSource implements DataSource {

    private static volatile LocalDataSource INSTANCE;
    private AppExecutors mAppExecutors;

    private LocalDataSource(@NonNull AppExecutors appExecutors) {
        mAppExecutors = appExecutors;
    }

    public static LocalDataSource getInstance(@NonNull AppExecutors appExecutors) {
        if (INSTANCE == null) {
            synchronized (LocalDataSource.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LocalDataSource(appExecutors);
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getItems(@NonNull LoadItemsCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                final List<IbuHamil> tasks = mTasksDao.getItems();
                mAppExecutors.mainThread().execute(new Runnable() {
                    @Override
                    public void run() {
//                        if (tasks.isEmpty()) {
//                            // This will be called if the table is new or just empty.
//                            callback.onDataNotAvailable();
//                        } else {
//                            callback.onTasksLoaded(tasks);
//                        }
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
    public void saveItem(@NonNull Object task) {

    }

    @Override
    public void deleteAllItems() {

    }

    @Override
    public void deleteItem(@NonNull String taskId) {

    }
}
