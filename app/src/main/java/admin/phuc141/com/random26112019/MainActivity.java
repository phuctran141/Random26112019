package admin.phuc141.com.random26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//RelativeLayout relativeLayout;
    EditText mEdtMin,mEdtMax;
    Button mBtnRandom;
    TextView mTvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        relativeLayout=findViewById(R.id.relaytiveLayout);
//        relativeLayout.setBackgroundColor(Color.rgb(100,100,100));
        mEdtMin = findViewById(R.id.edtMin);
        mEdtMax = findViewById(R.id.edtMax);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvResult = findViewById(R.id.txtResult);
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textMin=mEdtMin.getText().toString().trim();
                String textMax=mEdtMax.getText().toString().trim();
                Log.d("BBB",textMin);
                Log.d("BBB",textMax);
                if(textMax.isEmpty() | textMin.isEmpty()){
                    Toast.makeText(MainActivity.this,"ban vui long nhập dữ liệu",Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer sMin=Integer.valueOf(textMin);
                Integer sMax=Integer.valueOf(textMax);
                Random random = new Random();
                int value = random.nextInt(sMax-sMin+1)+sMin;
                mTvResult.setText(String.valueOf(value));
            }
        });
//        0.1*5=0.5;
//        0.2*5=1
//        0.9*5=4.5
//        random từ 0 -->5

//        double random = Math.random() * 5;
        // Làm tròn giá trị
//        double number1 = Math.round(random);
//        Log.d("BBB",String.valueOf(number1));
//        Làm tròn lên
//        double number2 =Math.ceil(random);
//        Làm tròn xuống
//        double number3= Math.floor(random);
//        Log.d("BBB",String.valueOf(random));
//        Log.d("BBB",String.valueOf(number1));
//        Log.d("BBB",String.valueOf(number2));
//        Log.d("BBB",String.valueOf(number3));
//        int a=4;
//        int b=5;
//        int ketqua=Math.max(a,b);//tương tự hàm min
//        Log.d("BBB",String.valueOf(ketqua));
//        Random 5 -->10;
        //int numberRandom=random1.nextInt(6)+5;
//        Random random1=new Random();
//        int numberRandom=random1.nextInt();
//        Log.d("BBB",String.valueOf(numberRandom));
//     Random 5 - 303
//        Random random1=new Random();
//        int numberRandom=random1.nextInt(303 - 5 + 1) + 5;
//        Log.d("BBB",String.valueOf(numberRandom));
//        Random color





    }
}
