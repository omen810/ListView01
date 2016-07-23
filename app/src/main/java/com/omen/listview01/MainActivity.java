package com.omen.listview01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.omen.listview01.R.id.activity_main_lv;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private ArrayAdapter<Student> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*//        mAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
        mAdapter=new ArrayAdapter<String>(this,R.layout.list_cell);
        mListView=(ListView)findViewById(activity_main_lv);
        mListView.setAdapter(mAdapter);
        mAdapter.add("第一项");
        mAdapter.add("第二项");
        mAdapter.add("第三项");*/
        mAdapter = new ArrayAdapter<Student>(this, R.layout.list_cell);
        mListView = (ListView) findViewById(activity_main_lv);
        mListView.setAdapter(mAdapter);
        mAdapter.add(new Student("张三", "男", 20));
        mAdapter.add(new Student("李四", "女", 20));
        mAdapter.add(new Student("王五", "男", 22));

        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Student student = mAdapter.getItem(i);

        Toast.makeText(this, String.format("姓名：%s，性别：%s，年龄：%d",
                student.getName(), student.getSex(), student.getAge()), Toast.LENGTH_LONG).show();
    }
}
