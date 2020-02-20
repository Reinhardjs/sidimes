package com.sidimes.data.source;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.sidimes.data.models.BaseModel;
import java.util.List;
import static androidx.core.util.Preconditions.checkNotNull;

public class Repository implements DataSource<BaseModel> {

    private final DataSource mRemoteDataSource;
    private final DataSource mLocalDataSource;

    // Prevent direct instantiation.
    @SuppressLint("RestrictedApi")
    public Repository(@NonNull DataSource itemsRemoteDataSource, @NonNull DataSource itemsLocalDataSource) {
        mRemoteDataSource = checkNotNull(itemsRemoteDataSource);
        mLocalDataSource = checkNotNull(itemsLocalDataSource);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void getItems(@NonNull final LoadItemsCallback callback) {
        checkNotNull(callback);

        // Query the local storage if available. If not, query the network.
        mLocalDataSource.getItems(new LoadItemsCallback<BaseModel>() {
            @Override
            public void onItemsLoaded(List<BaseModel> items) {
                callback.onItemsLoaded(items);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void getItem(@NonNull String itemId, @NonNull GetItemCallback callback) {
        mLocalDataSource.getItem(itemId, callback);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void saveItem(@NonNull BaseModel item) {
        checkNotNull(item);
        mLocalDataSource.saveItem(item);
    }

    @Override
    public void deleteAllItems() {
        mLocalDataSource.deleteAllItems();
    }

    @Override
    public void deleteItem(@NonNull String itemId) {
        mLocalDataSource.deleteItem(itemId);
    }

}