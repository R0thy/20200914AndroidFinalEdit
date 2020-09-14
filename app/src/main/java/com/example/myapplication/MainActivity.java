package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText playername;
    private Button button1;
    private TextView textview1 , tv_name , tv_winner , tv_player , tv_pc;
    private RadioGroup radioGroup;
    private RadioButton radioButton , radioButton2 , radioButton3;
    private String pss ;
    private int number;
    final int scissors = 0;
    final int stone = 1;
    final int paper = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playername=(EditText)findViewById(R.id.playername);
        button1=(Button)findViewById(R.id.button1);
        textview1=(TextView)findViewById(R.id.textview1);
        tv_name=(TextView)findViewById(R.id.tv_name);
        tv_winner=(TextView)findViewById(R.id.tv_winner);
        tv_player=(TextView)findViewById(R.id.tv_player);
        tv_pc=(TextView)findViewById(R.id.tv_pc);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioGroup.setOnCheckedChangeListener(rglistener);
    }
    private RadioGroup.OnCheckedChangeListener rglistener = new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            if(radioButton.isChecked()){
                pss = radioButton.getText().toString();
                number = 0;
            }
            if(radioButton2.isChecked()){
                pss = radioButton2.getText().toString();
                number = 1;
            }
            if(radioButton3.isChecked()){
                pss = radioButton3.getText().toString();
                number = 2;
            }

        }
    };
    public void onClick(View v){
        tv_name.setText("玩家姓名:" + playername.getText().toString());
        tv_player.setText("玩家方為:" + pss);
        Random ra = new Random();
        int pc = ra.nextInt(3-1+1);
        if (pc==0){
            tv_pc.setText("電腦方為:" + "剪刀");
            if (pc==number){
                tv_winner.setText("獲勝方為:雙方平手");
            if (pc<number && number==1){
                tv_winner.setText("獲勝方為:玩家獲勝");
            if (pc<number && number==2){
                tv_winner.setText("獲勝方為:電腦獲勝");
                }
            }
        }
        else if (pc==1){
            tv_pc.setText("電腦方為:" + "石頭");
            if (pc==number){
                tv_winner.setText("獲勝方為:雙方平手");
            if (pc<number){
                tv_winner.setText("獲勝方為:玩家獲勝");
            if (pc>number){
                tv_winner.setText("獲勝方為:電腦獲勝");
                        }
                    }
                }
            }
        else if (pc==2){
            tv_pc.setText("電腦方為:" + "布");
                if (pc==number){
                    tv_winner.setText("獲勝方為:雙方平手");
                if (pc>number && number==0){
                    tv_winner.setText("獲勝方為:玩家獲勝");
                if (pc>number && number==1){
                    tv_winner.setText("獲勝方為:電腦獲勝");
                        }
                    }
                }
            }

        }

    }
}
