package com.sidimes.data.source;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

import java.util.List;

import static androidx.core.util.Preconditions.checkNotNull;

public class Repository<T> implements DataSource<T> {

    private final DataSource mItemsLocalDataSource;
    private final DataSource mItemsRemoteDataSource;


    // Prevent direct instantiation.
    @SuppressLint("RestrictedApi")
    public Repository(@NonNull DataSource itemsRemoteDataSource, @NonNull DataSource itemsLocalDataSource) {
        mItemsRemoteDataSource = checkNotNull(itemsRemoteDataSource);
        mItemsLocalDataSource = checkNotNull(itemsLocalDataSource);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void getItems(@NonNull final LoadItemsCallback callback) {
        checkNotNull(callback);

        // Query the local storage if available. If not, query the network.
        mItemsLocalDataSource.getItems(new LoadItemsCallback<T>() {
            @Override
            public void onItemsLoaded(List<T> tasks) {
                callback.onItemsLoaded(tasks);
            }

            @Override
            public void onDataNotAvailable() {
                // getTasksFromRemoteDataSource(callback);
            }
        });
    }

    @Override
    public void getItem(@NonNull String itemId, @NonNull GetItemCallback callback) {

    }

    @SuppressLint("RestrictedApi")
    @Override
    public void saveItem(@NonNull T item) {
        checkNotNull(item);
        mItemsLocalDataSource.saveItem(item);
    }

    @Override
    public void deleteAllItems() {

    }

    @Override
    public void deleteItem(@NonNull String itemId) {

    }

}