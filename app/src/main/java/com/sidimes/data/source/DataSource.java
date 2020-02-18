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

    void getItems(@NonNull LoadItemsCallback<T> callback);

    void getItem(@NonNull String itemId, @NonNull GetItemCallback<T> callback);

    void saveItem(@NonNull T item);

    void deleteAllItems();

    void deleteItem(@NonNull String itemId);
}