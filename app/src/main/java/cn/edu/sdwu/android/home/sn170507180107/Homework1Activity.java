package cn.edu.sdwu.android.home.sn170507180107;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homework1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework1);
        //获取界组件
        Button button=(Button) findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        EditText editText1=(EditText)findViewById(R.id.et1);
        EditText editText2=(EditText)findViewById(R.id.et2);
        TextView textView=(TextView)findViewById(R.id.tv1);
//        String  content1=editText1.getText().toString();
//        int a=Integer.parseInt(content1);
//        String  content2=editText2.getText().toString();
//        int b=Integer.parseInt(content2);
        //调用XXXListener事件源的方法注册事件监听器
        //使用内部匿名类实现加法运算
        button2.setOnClickListener(new MyClickListener());
        button3.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1=(EditText)findViewById(R.id.et1);
                EditText editText2=(EditText)findViewById(R.id.et2);
                TextView textView=(TextView)findViewById(R.id.tv1);
                String  content1=editText1.getText().toString();
                String  content2=editText2.getText().toString();
                float a=Integer.valueOf(content1).intValue();
                float b=Integer.valueOf(content2).intValue();
                a=a+b;
                content1=String.valueOf(a);
                textView.setText(content1);
            }
        });
    }
    //实现监听类，该监听类是一个特殊的JAVA类，必须实现一个必须实现一个XXXListener接口
    //使用内部类实现减法运算
    class MyClickListener implements  View.OnClickListener{
        public void  onClick(View view){
            EditText editText1=(EditText)findViewById(R.id.et1);
            EditText editText2=(EditText)findViewById(R.id.et2);
            TextView textView=(TextView)findViewById(R.id.tv1);
            String  content1=editText1.getText().toString();
            String  content2=editText2.getText().toString();
            float a=Integer.valueOf(content1).intValue();
            float b=Integer.valueOf(content2).intValue();
            a=a-b;
            content1=String.valueOf(a);
            textView.setText(content1);
        }
    }
    public void onClick(View view){
        EditText editText1=(EditText)findViewById(R.id.et1);
        EditText editText2=(EditText)findViewById(R.id.et2);
        TextView textView=(TextView)findViewById(R.id.tv1);
        String  content1=editText1.getText().toString();
        String  content2=editText2.getText().toString();
        float a=Integer.valueOf(content1).intValue();
        float b=Integer.valueOf(content2).intValue();
        a=a*b;
        content1=String.valueOf(a);
        textView.setText(content1);
    }
    public void chufa(View view){
        EditText editText1=(EditText)findViewById(R.id.et1);
        EditText editText2=(EditText)findViewById(R.id.et2);
        TextView textView=(TextView)findViewById(R.id.tv1);
        String  content1=editText1.getText().toString();
        String  content2=editText2.getText().toString();
        float a=Integer.valueOf(content1).intValue();
        float b=Integer.valueOf(content2).intValue();
        if(b!=0){
            a=a/b;
            content1=String.valueOf(a);
            textView.setText(content1);
        }else{
            textView.setText("分母不能为0");
        }
    }

}
