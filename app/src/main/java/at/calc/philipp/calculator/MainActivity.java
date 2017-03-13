package at.calc.philipp.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputDividend;
    EditText inputDivisor;
    TextView outputResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDivisor = (EditText) findViewById(R.id.input_divisor);
        inputDividend = (EditText) findViewById(R.id.intput_dividend);
        outputResult = (TextView) findViewById(R.id.txtView_output);
    }


    public void divide(View view){
        String dividend = inputDividend.getText().toString();
        String divisor = inputDivisor.getText().toString();

        if (dividend.equals("") || divisor.equals("")) {
            outputResult.setText("Please enter a valid value");
        }
        else if(dividend.equals("0")){
            outputResult.setText("Can't divide through null");
        }else{

            double dividendNumber = Double.parseDouble(dividend);
            double divisorNumber = Double.parseDouble(divisor);

            String result = String.valueOf((dividendNumber/divisorNumber));
            outputResult.setText(result);
        }

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }
}
