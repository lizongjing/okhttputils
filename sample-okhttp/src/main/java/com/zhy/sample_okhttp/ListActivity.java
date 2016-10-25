package com.zhy.sample_okhttp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.zhy.sample_okhttp.activity.GetActivity;

import java.util.ArrayList;

/**
 * Created by lizongjing on 2016/10/25.
 */
public class ListActivity extends Activity {

      private ListView lv_list;

      private ArrayList<String> mArrayList = new ArrayList<String>();

      @Override
      protected void onStart() {
            super.onStart();
      }


      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_list);
            initview();
      }

      private void initview(){
            lv_list = (ListView) findViewById(R.id.lv_list);
            lv_list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData()));

            lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(ListActivity.this,position+"",Toast.LENGTH_LONG).show();
                        if(position == 0){
                              Intent intent = new Intent(ListActivity.this, GetActivity.class);
                              startActivity(intent);
                        }else if(position == 1){

                        }else if(position == 2){

                        }else if(position == 3){

                        }else if(position == 4){

                        }
                  }
            });
      }
      private ArrayList<String> getData() {
            mArrayList.add("一般的get请求");
            mArrayList.add("一般的post请求");
            mArrayList.add("文件下载回调进程");
            mArrayList.add("图片加载");
            mArrayList.add("session保持");
            mArrayList.add("测试数据6");
            return mArrayList;
      }

      @Override
      protected void onStop() {
            super.onStop();
      }
}
