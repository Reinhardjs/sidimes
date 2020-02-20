package com.sidimes.data.source.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.sidimes.data.models.IbuHamil;

import java.util.List;

@Dao
public interface IbuHamilDao extends BaseDao<IbuHamil> {

    @Query("SELECT * FROM ibuhamil")
    List<IbuHamil> getItems();

    @Query("SELECT * FROM ibuhamil WHERE entryid = :id")
    IbuHamil getItemById(String id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertItem(IbuHamil item);

    @Update
    int updateItem(IbuHamil item);

    @Query("DELETE FROM ibuhamil WHERE entryid = :id")
    int deleteItemById(String id);

    @Query("DELETE FROM ibuhamil")
    void deleteItems();

}
