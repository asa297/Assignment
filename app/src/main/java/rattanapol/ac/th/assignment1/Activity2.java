package rattanapol.ac.th.assignment1;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        String name = "",pass = "";String hobbies ="";String ValueSpinnerLevel="";
        String ValueSpinnerGPA = "";String Majors = "";

        TextView showName = (TextView)findViewById(R.id.textView1);
        TextView showpass = (TextView)findViewById(R.id.textView2);
        TextView showhobbies = (TextView)findViewById(R.id.textView3);
        TextView showLevel = (TextView)findViewById(R.id.textView4);
        TextView showGPA = (TextView)findViewById(R.id.textView5);
        TextView showMajors = (TextView)findViewById(R.id.textView6);

        if(extras !=null){
            name = (String)extras.getString("name");
            pass = (String)extras.getString("pass");
            hobbies = extras.getString("hobbies");
            ValueSpinnerLevel = extras.getString("spinnerLevel");
            ValueSpinnerGPA = extras.getString("spinnerGPA");
            Majors = extras.getString("majors");
        }

        showName.setText(name);
        showpass.setText(pass);
        showhobbies.setText(hobbies);
        showLevel.setText(ValueSpinnerLevel);
        showGPA.setText(ValueSpinnerGPA);
        showMajors.setText(Majors);
    }
}
