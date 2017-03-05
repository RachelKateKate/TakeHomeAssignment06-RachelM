package rachelmiller.takehomeassignment06_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText subTotalBox;
    EditText taxBox;
    EditText tipBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subTotalBox = (EditText) findViewById(R.id.subtotal);
        taxBox = (EditText) findViewById(R.id.tax);
        tipBox = (EditText) findViewById(R.id.tip);
     }

    public void calculateTotal (View view)
    {
        Intent msIntent = new Intent (this, SecondActivity.class);
        msIntent.putExtra("TITLE_STRING", "Your reciept");
        String subTotal = subTotalBox.getText().toString();
        double userSubTotal = (double)Integer.parseInt(subTotal);
        String tax = taxBox.getText().toString();
        double taxPercent = (double)Integer.parseInt(tax);
        String tip = tipBox.getText().toString();
        double tipPercent = (double)Integer.parseInt(tip);
        double total = userSubTotal+(userSubTotal*taxPercent) + (userSubTotal*tipPercent);
        startActivity(msIntent);
    }
}
