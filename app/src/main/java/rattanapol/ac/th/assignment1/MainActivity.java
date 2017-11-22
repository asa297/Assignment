package rattanapol.ac.th.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner2);

        String[] arr = {"None", "Freshman", "Sophomore", "Junior", "Senior","Other"};
        String[] arr1 = {"None", "0.01 - 0.49", "0.50 - 0.99", "1.00 - 1.49", "1.50 - 1.99","2.00 - 2.49" , "2.50 - 2.99" , "3.00 - 3.49" , "3.5 up"};
        String[] arr2 = {"None", "Physics", "Chemistry", "Mathematics", "Biology"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arr);
        dropdown.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arr1);
        dropdown1.setAdapter(adapter1);

        final  EditText txtname = (EditText)findViewById(R.id.fnameET);
        final  EditText txtpass = (EditText)findViewById(R.id.passET);
        final  Spinner spinnerLevel = (Spinner)findViewById(R.id.spinner1);
        final  Spinner spinnerGPA = (Spinner)findViewById(R.id.spinner2);

        Button btn = (Button) findViewById(R.id.Bsubmit);


        final CheckBox button1 = (CheckBox) findViewById(R.id.button1);
        final CheckBox button2 = (CheckBox) findViewById(R.id.button2);
        final CheckBox button3 = (CheckBox) findViewById(R.id.button3);
        final CheckBox button4 = (CheckBox) findViewById(R.id.button4);
        final CheckBox Mbutton1 = (CheckBox) findViewById(R.id.Mbutton1);
        final CheckBox Mbutton2 = (CheckBox) findViewById(R.id.Mbutton2);
        final CheckBox Mbutton3 = (CheckBox) findViewById(R.id.Mbutton3);
        final CheckBox Mbutton4 = (CheckBox) findViewById(R.id.Mbutton4);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name =  txtname.getText().toString();
                String pass = txtpass.getText().toString();
                String hobbies = "";
                String majors = "";
                if(button1.isChecked()){
                    hobbies= hobbies + "Surfing  ";
                }
                if(button2.isChecked()){
                    hobbies= hobbies + "Running  ";
                }
                if(button3.isChecked()){
                    hobbies= hobbies +  "Biking ";
                }
                if(button4.isChecked()){
                    hobbies= hobbies +  "Paddling";
                }
                String ValueSpinnerLevel = spinnerLevel.getSelectedItem().toString();
                String ValueSpinnerGPA = spinnerGPA.getSelectedItem().toString();
                if(Mbutton1.isChecked()){
                    majors = majors + "Physics  ";
                }
                if(Mbutton2.isChecked()){
                    majors = majors + "Chemistry  ";
                }
                if(Mbutton3.isChecked()){
                    majors = majors +  "Mathematics  ";
                }
                if(Mbutton4.isChecked()){
                    majors = majors +  "Biology";
                }

                Intent i = new Intent(MainActivity.this, Activity2.class);
                Bundle extras = new Bundle();
                extras.putString("name", name);
                extras.putString("pass", pass);
                extras.putString("hobbies", hobbies);
                extras.putString("spinnerLevel",ValueSpinnerLevel);
                extras.putString("spinnerGPA",ValueSpinnerGPA);
                extras.putString("majors",majors);
                i.putExtras(extras);
                startActivity(i);

            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
