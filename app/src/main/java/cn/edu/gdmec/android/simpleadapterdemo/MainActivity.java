package cn.edu.gdmec.android.simpleadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> splist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splist = new ArrayList<Map<String,Object>>();

        listView = findViewById(R.id.listview);
        simpleAdapter = new SimpleAdapter(this,getData(),R.layout.item,new String[]{"imageView","textView"},new int[]{R.id.imageView,R.id.textView});
        listView.setAdapter(simpleAdapter);
    }

    private List<Map<String,Object>> getData() {

        for(int i = 0;i<20;i++){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("imageView",R.mipmap.ic_launcher);
            map.put("textView","Vic"+i);
            splist.add(map);
        }
        return splist;
    }
}
