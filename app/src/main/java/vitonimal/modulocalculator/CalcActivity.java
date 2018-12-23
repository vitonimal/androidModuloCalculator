package vitonimal.modulocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {

    private EditText operandAInput;
    private EditText operandBInput;
    private EditText resultDisplay;
    private Button moduloSubmit;

    private View.OnClickListener moduloListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int operandA = Integer.valueOf(operandAInput.getText().toString());
            int operandB = Integer.valueOf(operandBInput.getText().toString());
            int moduloResult = operandA % operandB;

            resultDisplay = findViewById(R.id.resultDisplay);
            resultDisplay.setText(String.valueOf(moduloResult));
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        operandAInput = findViewById(R.id.operandAInput);
        operandBInput = findViewById(R.id.operandBInput);
        moduloSubmit = findViewById(R.id.moduloSubmit);

        moduloSubmit.setOnClickListener(moduloListener);

    }
}
