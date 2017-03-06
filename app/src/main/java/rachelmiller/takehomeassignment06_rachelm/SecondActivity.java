package rachelmiller.takehomeassignment06_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayReceipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Your Reciept");

        displayReceipt = (TextView) findViewById(R.id.displayReceipt);
        Intent mrIntent = getIntent();
        String receipt = mrIntent.getStringExtra(Keys.RECEIPT);
        String title = mrIntent.getStringExtra("TITLE_STRING");
        displayReceipt.setText(receipt);
        setTitle(title);
    }
}
