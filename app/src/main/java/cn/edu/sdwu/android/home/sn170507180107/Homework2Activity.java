package cn.edu.sdwu.android.home.sn170507180107;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Homework2Activity extends AppCompatActivity {
    private ArrayList list;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework2);
        LinearLayout linearLayout=(LinearLayout) findViewById(R.id.ll);
        TextView textView=(TextView)findViewById(R.id.tv1);
        list=new ArrayList();
        int count=linearLayout.getChildCount();
        for(int i=0;i<count;i++){
            View view=linearLayout.getChildAt(i);
            if(view instanceof CheckBox){
                final CheckBox checkBox=(CheckBox)view;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            list.add(compoundButton);

                        }else {
                            list.remove(compoundButton);
                        }

                        String content="您选择了：";

                        for(int t=0;t<list.size();t++){

                            CheckBox checkBox1=(CheckBox)list.get(t);
                            String sel=checkBox1.getText().toString();

                            content+=sel+",";

                        }
                        content+="共"+list.size()+"项";
                        Toast.makeText(getApplicationContext(),content,Toast.LENGTH_SHORT).show();
                    }

                });

            }
        }
    }
}
