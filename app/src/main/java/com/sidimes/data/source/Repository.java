package com.sidimes.data.source;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

import com.sidimes.data.pojo.BasePojo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static androidx.core.util.Preconditions.checkNotNull;

public class Repository<T> implements DataSource<T> {

    private static Repository INSTANCE = null;

    private final DataSource mItemsLocalDataSource;
    private final DataSource mItemsRemoteDataSource;

    /**
     * This variable has package local visibility so it can be accessed from tests.
     */
    Map<String, T> mCachedTasks;

    /**
     * Marks the cache as invalid, to force an update the next time data is requested. This variable
     * has package local visibility so it can be accessed from tests.
     */
    boolean mCacheIsDirty = false;

    // Prevent direct instantiation.
    @SuppressLint("RestrictedApi")
    private Repository(@NonNull DataSource itemsRemoteDataSource, @NonNull DataSource itemsLocalDataSource) {
        mItemsRemoteDataSource = checkNotNull(itemsRemoteDataSource);
        mItemsLocalDataSource = checkNotNull(itemsLocalDataSource);
    }

    public static Repository getInstance(DataSource remoteDataSource, DataSource localDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new Repository(remoteDataSource, localDataSource);
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void getItems(@NonNull final LoadItemsCallback callback) {
        checkNotNull(callback);

        // Respond immediately with cache if available and not dirty
        if (mCachedTasks != null && !mCacheIsDirty) {
            callback.onItemsLoaded(new ArrayList<>(mCachedTasks.values()));
            return;
        }

        if (mCacheIsDirty) {
            // If the cache is dirty we need to fetch new data from the network.
            // getTasksFromRemoteDataSource(callback);
        } else {
            // Query the local storage if available. If not, query the network.
            mItemsLocalDataSource.getItems(new LoadItemsCallback<T>() {
                @Override
                public void onItemsLoaded(List<T> tasks) {
                    refreshCache(tasks);
                    callback.onItemsLoaded(new ArrayList<>(mCachedTasks.values()));
                }

                @Override
                public void onDataNotAvailable() {
                    // getTasksFromRemoteDataSource(callback);
                }
            });
        }
    }

    @Override
    public void getItem(@NonNull String itemId, @NonNull GetItemCallback callback) {

    }

    @Override
    public void saveItem(@NonNull T task) {

    }

    @Override
    public void deleteAllItems() {

    }

    @Override
    public void deleteItem(@NonNull String itemId) {

    }

    private void refreshCache(List<T> items) {
        if (mCachedTasks == null) {
            mCachedTasks = new LinkedHashMap<>();
        }
        mCachedTasks.clear();
        for (T item : items) {
            mCachedTasks.put(((BasePojo) item).getId(), item);
        }
        mCacheIsDirty = false;
    }
}
