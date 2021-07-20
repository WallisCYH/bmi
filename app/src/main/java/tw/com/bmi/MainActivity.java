package tw.com.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;  //用來顯示結果
    private EditText weight,height; //讓使用者輸入

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //將佈局檔載入

        result = findViewById(R.id.result); //定義佈局檔中的元件
        weight = findViewById(R.id.userweight);
        height = findViewById(R.id.userheight);

    }

    public void bmiClick(View view) { //讓要佈局檔呼叫的方法，權限一定要是public
        float userweight = Float.parseFloat(weight.getText().toString());
        float userhight = Float.parseFloat(height.getText().toString());
        float bmi = userweight / (userhight / 100) * (userhight / 100);

        result.setText("結果:"+bmi);
    }
}