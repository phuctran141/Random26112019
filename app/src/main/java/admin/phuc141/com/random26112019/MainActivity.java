package admin.phuc141.com.random26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        0.1*5=0.5;
//        0.2*5=1
//        0.9*5=4.5
//        random từ 0 -->5

        double random = Math.random() * 5;
        // Làm tròn giá trị
        double number1 = Math.round(random);
        Log.d("BBB",String.valueOf(number1));
//        Làm tròn lên
        double number2 =Math.ceil(random);
//        Làm tròn xuống
        double number3= Math.floor(random);
        Log.d("BBB",String.valueOf(random));
        Log.d("BBB",String.valueOf(number1));
        Log.d("BBB",String.valueOf(number2));
        Log.d("BBB",String.valueOf(number3));
        int a=4;
        int b=5;
        int ketqua=Math.max(a,b);//tương tự hàm min
        Log.d("BBB",String.valueOf(ketqua));

    }
}
