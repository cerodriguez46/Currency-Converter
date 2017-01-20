package christopher.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText dollarField = (EditText)findViewById(R.id.dollarField);

        //convert dollarfield to string, and then parse with Double.parseDouble to convert to double
        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmount = dollarAmount * 0.65;

        Log.i("poundAmount", poundAmount.toString());

        Toast.makeText(getApplicationContext(),"£" + poundAmount.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
