package com.sidimes.data.source.local.dao;

import androidx.room.Dao;

import com.sidimes.data.models.IbuHamil;

import java.util.List;

@Dao
public interface BaseDao<T> {

    List<T> getItems();

    IbuHamil getItemById(String id);

    void insertItem(T item);

    int updateItem(T item);

    int deleteItemById(String id);

    void deleteItems();

}