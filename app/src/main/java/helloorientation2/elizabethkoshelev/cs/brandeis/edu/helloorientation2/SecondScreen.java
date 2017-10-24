package helloorientation2.elizabethkoshelev.cs.brandeis.edu.helloorientation2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);
    }

    public void goConversion(View view){
        EditText milesText = (EditText)findViewById(R.id.editBox);
        String miles = milesText.getText().toString();
        int finalMiles=Integer.parseInt(miles);
        double kilometers = finalMiles*1.609;
        TextView conversionResult =  (TextView) findViewById(R.id.answerBox);
        conversionResult.setText(" " + kilometers);
    }

    public void goClear(View view){
        TextView conversionResult =  (TextView) findViewById(R.id.answerBox);
        conversionResult.setText("");
        TextView clearEdit =  (TextView) findViewById(R.id.editBox);
        clearEdit.setText("");
    }

    public void goAbout(View view){
        TextView aboutBox =  (TextView) findViewById(R.id.aboutBox);
        String aboutText = String.valueOf(aboutBox.getText());
        if (aboutText.equals("")) {
            aboutBox.setText("A kilometer is 1000 meters. \nA mile is approximately 1.609 kilometers, or around 1609 meters. \nThe following equation was used: \nkilometers=miles*1.609");
        } else {
            aboutBox.setText("");
        }
    }

    public void goBack(View view){
       TextView answer = (TextView)findViewById(R.id.answerBox);
        String result = String.valueOf(answer.getText());
        Intent goBack= new Intent();
        goBack.putExtra("Result", result);
        setResult(RESULT_OK, goBack);
        finish();
    }
}
