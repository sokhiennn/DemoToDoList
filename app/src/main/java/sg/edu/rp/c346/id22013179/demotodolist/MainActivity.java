package sg.edu.rp.c346.id22013179.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        Calendar mDate = Calendar.getInstance();
        mDate.set(2020,8,1);

        Calendar HcDate = Calendar.getInstance();
        HcDate.set(2020,8,2);

        items.add(new ToDoItem("Go for movie",mDate));
        items.add(new ToDoItem("Go for haircut",HcDate));

        ArrayAdapter<ToDoItem> adapter = new ArrayAdapter<ToDoItem>(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(adapter);
    }

}