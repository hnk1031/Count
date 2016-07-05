package hono.app.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //変数宣言
    TextView textView;
    TextView textView2;
    TextView textView3;
    int count;
    int count2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //変数の初期化
        textView =(TextView)findViewById(R.id.textView);
        textView2 =(TextView)findViewById(R.id.textView2);
        textView3 =(TextView)findViewById(R.id.textView3);
        count =0;
        count2 =0;
    }

    //addボタンを押した時の処理
    public void add(View v){
        count++;
        textView.setText(count+"回ボタンが押されました！");
    }

    //minusボタンを押した時の処理
    public void minus(View v){
        count--;
        textView.setText(count+"回ボタンが押されました！");
    }

    //add2ボタンを押した時の処理
    public void  add2(View v){
        count2++;
        textView2.setText(count2+"回ボタンが押されました！");
    }

    //allボタンを押した時の処理
    public void all(View v){
        count= count+count2;
        textView3.setText("合計は"+count+"回です！");
    }

}
