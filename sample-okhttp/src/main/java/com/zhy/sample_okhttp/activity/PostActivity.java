package com.zhy.sample_okhttp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.sample_okhttp.R;

import okhttp3.Call;

/**
 * Created by lizongjing on 2016/10/25.
 */
public class PostActivity extends Activity {

      private EditText et_url,et_output;
      private Button bt_tijiao;

      private String url = "http://api.tuhu.test/Advertise/SelectApiConfigure";

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_post);
            initview();
      }

      private void initview(){
            et_url = (EditText) findViewById(R.id.et_url);
            et_output = (EditText) findViewById(R.id.et_output);
            bt_tijiao = (Button) findViewById(R.id.bt_tijiao);

            et_url.setText(url);

            bt_tijiao.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        OkHttpUtils
                                  .post()
                                  .url(et_url.getText().toString())
//                                  .addParams("username", "hyman")
//                                  .addParams("password", "123")
                                  .build()
                                  .execute(new StringCallback()
                                  {
                                        @Override
                                        public void onError(Call call, Exception e, int id) {

                                        }

                                        @Override
                                        public void onResponse(String response, int id) {
                                              et_output.setText(response);
                                        }
                                  });

                  }
            });

      }
}
