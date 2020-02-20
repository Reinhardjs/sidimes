package com.sidimes.data.source.local;

import androidx.annotation.NonNull;
import com.sidimes.data.models.BaseModel;
import com.sidimes.data.source.DataSource;
import com.sidimes.data.source.local.dao.BaseDao;
import com.sidimes.util.AppExecutors;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class LocalDataSource implements DataSource<BaseModel> {

    private BaseDao localDao;

    public LocalDataSource(@NonNull BaseDao localDao) {
        this.localDao = localDao;
    }

    @Override
    public void getItems(@NonNull final LoadItemsCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final List items = localDao.getItems();

                AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        callback.onItemsLoaded(items);
                    }
                });
            }
        };

        AppExecutors.getInstance().diskIO().execute(runnable);
    }

    @Override
    public void getItem(@NonNull final String itemId, @NonNull final GetItemCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final Object item = localDao.getItemById(itemId);

                AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        callback.onItemLoaded(item);
                    }
                });
            }
        };

        AppExecutors.getInstance().diskIO().execute(runnable);
    }

    @Override
    public void saveItem(@NonNull final BaseModel item) {
        checkNotNull(item);
        Runnable saveRunnable = new Runnable() {
            @Override
            public void run() {
                localDao.insertItem(item);
            }
        };
        AppExecutors.getInstance().diskIO().execute(saveRunnable);
    }

    @Override
    public void deleteAllItems() {
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                localDao.deleteItems();
            }
        });
    }

    @Override
    public void deleteItem(@NonNull final String itemId) {
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                localDao.deleteItemById(itemId);
            }
        });
    }
}
