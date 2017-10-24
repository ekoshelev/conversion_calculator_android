//Elizabeth Koshelev
//10/6/2016
//Mobile Application Development HW1
package helloorientation2.elizabethkoshelev.cs.brandeis.edu.helloorientation2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goConversion(View view){
        Intent getConversionScreenIntent = new Intent(this, SecondScreen.class);
        final int result = 1;
        startActivityForResult(getConversionScreenIntent, result);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView result =  (TextView) findViewById(R.id.lastConversion);
        String resultSentBack = data.getStringExtra("Result");
        if (resultSentBack.equals("")){
            resultSentBack = "no";
        }
        result.setText("The last conversion was to " + resultSentBack + " kilometers.");
    }

}
