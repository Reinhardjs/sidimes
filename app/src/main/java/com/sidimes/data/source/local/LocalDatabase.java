package com.sidimes.data.source.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.sidimes.data.models.IbuHamil;
import com.sidimes.data.source.local.dao.IbuHamilDao;

@Database(entities = {IbuHamil.class}, version = 1, exportSchema = false)
public abstract class LocalDatabase extends RoomDatabase {

    private static LocalDatabase INSTANCE;

    public abstract IbuHamilDao ibuHamilDao();

//    private static final Object sLock = new Object();
//
//    public static LocalDatabase getInstance(Context context) {
//        synchronized (sLock) {
//            if (INSTANCE == null) {
//                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
//                        LocalDatabase.class, "SiDimes.db")
//                        .build();
//            }
//
//            return INSTANCE;
//        }
//    }

}