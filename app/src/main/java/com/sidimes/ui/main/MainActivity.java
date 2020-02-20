package com.sidimes.ui.main;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import com.sidimes.R;
import com.sidimes.data.models.IbuHamil;
import com.sidimes.data.source.DataSource;
import com.sidimes.data.source.Repository;
import com.sidimes.data.source.local.datasource.StuntingDataSource;
import com.sidimes.data.source.local.LocalDatabase;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LocalDatabase database = Room.databaseBuilder(getApplicationContext(),
                LocalDatabase.class, "SiDimes.db")
                .build();

        DataSource ibuhamilLocalDataSource = new StuntingDataSource(database.ibuHamilDao());
        Repository ibuhamilRepository = new Repository(ibuhamilLocalDataSource, ibuhamilLocalDataSource);

        ibuhamilRepository.deleteAllItems();

        for (int i = 0; i < 10; i++) {
            IbuHamil item = new IbuHamil("aaa " + i);
            ibuhamilRepository.saveItem(item);
        }

        ibuhamilRepository.getItems(new DataSource.LoadItemsCallback<IbuHamil>() {
            @Override
            public void onItemsLoaded(List<IbuHamil> items) {
                Log.d("MYAPP", Arrays.toString(items.toArray()));
//                for (int i = 0; i < items.size(); i++) {
//                    Log.d("MYAPP", " ITEM : " + items.get(i).getId());
//                }
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

}
