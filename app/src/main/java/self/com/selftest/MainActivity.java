package self.com.selftest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    LinearLayoutManager recyclerLayoutManager;
    ArrayList<String> rowData;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        rowData=new ArrayList<>();
        rowData.add("1st row");
        rowData.add("2nd row");
        rowData.add("3rd row");
        rowData.add("4th row");
        rowData.add("5th row");
        rowData.add("6th row");
        rowData.add("7th row");
        rowData.add("8th row");
        rowData.add("9th row");
        rowData.add("10th row");
        recyclerLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerAdapter=new RecyclerAdapter(this,rowData);
        recyclerView.setAdapter(recyclerAdapter);

    }

}