package com.sidimes.data.source;

import androidx.annotation.NonNull;

import java.util.List;

public interface DataSource<T> {

    interface LoadItemsCallback<X> {

        void onItemsLoaded(List<X> items);

        void onDataNotAvailable();
    }

    interface GetItemCallback<X> {

        void onItemLoaded(X item);

        void onDataNotAvailable();
    }

    void getItems(@NonNull LoadItemsCallback callback);

    void getItem(@NonNull String itemId, @NonNull GetItemCallback callback);

    void saveItem(@NonNull T task);

    void deleteAllItems();

    void deleteItem(@NonNull String itemId);
}