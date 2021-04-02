package com.sycamore.sycaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sycamore.sycaplayer.bean.PlayInfo;

/**
 * @author dingyx
 * @description: 选择播放页面
 * @date: 2021/4/2
 */
public class ChoosePlayActivity extends AppCompatActivity {

    private GridView mGridView;
    private PlayInfoAdapter mAdapter;

    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choose_play);

        mGridView = findViewById(R.id.gv_item);
        editText = findViewById(R.id.et);

        mAdapter = new PlayInfoAdapter(this,PlayInfo.getData());
        mGridView.setAdapter(mAdapter);

        mGridView.setOnItemClickListener((parent, view, position, id) -> editText.setText(PlayInfo.getData().get(position).getUrl()));

        findViewById(R.id.btn_sure).setOnClickListener(v -> {
            Intent intent = new Intent(ChoosePlayActivity.this, PlayerActivity.class);
            intent.putExtra("url", editText.getText().toString().trim());
            ChoosePlayActivity.this.startActivity(intent);
        });

    }


}
