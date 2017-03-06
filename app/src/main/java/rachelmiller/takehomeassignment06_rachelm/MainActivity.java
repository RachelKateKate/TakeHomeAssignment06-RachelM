package rachelmiller.takehomeassignment06_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText subtotal; //declare variables from the xml text fields
    private EditText tax;
    private EditText tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subtotal = (EditText) findViewById(R.id.subtotal); //initialize the variables above with their xml Edit View @android ids
        tax = (EditText) findViewById(R.id.tax);
        tip = (EditText) findViewById(R.id.tip);

        setTitle("Tip Calculator"); // change the name from "TakeHomeAssignment06-RachelM to "Tip Calculator"

    }

    public void calculateTotal(View view) { // create method for calculating the total
        double userAmount = Double.parseDouble(subtotal.getText().toString()); //store info in new variables
        double taxPercent = Double.parseDouble(tax.getText().toString());
        double tipPercent = Double.parseDouble(tip.getText().toString());
        String receipt = "Subtotal: $" + userAmount + "\n" + "Tax: $" + // create the print out for the string reciept, uses all the info(strings/words) and the math
                (taxPercent * userAmount) + "\n" + "Tip; $" + (tipPercent * userAmount)
                + "\n" + "Total: $" + (userAmount + (taxPercent * userAmount) + (tipPercent * userAmount));


        Intent msIntent = new Intent(this, SecondActivity.class); // create the intent that sends over the info to the 2nd activity
        msIntent.putExtra(Keys.RECEIPT, receipt);
        msIntent.putExtra("TITLE_STRING", "Your reciept");
        startActivity(msIntent);
    }

}
