package lk.ac.kln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberone = 0;
    int numbertwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected  void addNumbers(View view){
        final EditText firstinput = findViewById(R.id.editText3);
        final EditText secondinput = findViewById(R.id.editText4);

        numberone = Integer.parseInt(firstinput.getText().toString());
        numbertwo = Integer.parseInt(secondinput.getText().toString());

        final TextView result = findViewById(R.id.text);

        int sum = numberone + numbertwo;


        result.setText("Answer is: " + sum);



    }
}
