package cn.edu.sdwu.android.home.sn170507180107;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_index);
        //Button button=(Button)findViewById(R.id.homework_btn1);
        //button.setOnClickListener(new MyClickListener());
    }
    public void homework1(View view) {
        Intent intent = new Intent(this, Homework1Activity.class);
        startActivity(intent);
    }
    public void homework2(View view) {
        Intent intent = new Intent(this, Homework2Activity.class);
        startActivity(intent);
    }
}
