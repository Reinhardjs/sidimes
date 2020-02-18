package com.sidimes.data.source.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.sidimes.data.pojo.IbuHamil;

import java.util.List;

@Dao
public interface IbuHamilDao {

    @Query("SELECT * FROM ibuhamil")
    List<IbuHamil> getItems();

    @Query("SELECT * FROM ibuhamil WHERE entryid = :id")
    IbuHamil getIbuHamilById(String id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertItem(IbuHamil item);

    @Update
    int updateIbuHamil(IbuHamil item);

    @Query("DELETE FROM ibuhamil WHERE entryid = :id")
    int deleteTaskById(String id);

    @Query("DELETE FROM ibuhamil")
    void deleteTasks();

}
