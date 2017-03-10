package at.calc.philipp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputDividend;
    EditText inputDivisor;
    TextView outputResult;
    TextView labelResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setResultVisibility(boolean visibel) {
        if (visibel) {
            outputResult.setVisibility(View.VISIBLE);
            labelResult.setVisibility(View.VISIBLE);
        } else {
            outputResult.setVisibility(View.INVISIBLE);
            labelResult.setVisibility(View.INVISIBLE);
        }
    }

    public void divide(View view){
        String dividend = inputDividend.getText().toString();
        String divisor = inputDivisor.getText().toString();

        if(dividend == "" || divisor == ""){

        }


        setResultVisibility(true);
    }

    public void sendErrorMessage(String msg){

    }
}
