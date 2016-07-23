package com.example.sherin.calculate;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity  {
    Button p=(Button) findViewById(R.id.button);

    EditText editText =(EditText)findViewById(R.id.editText);
    EditText editText2 =(EditText)findViewById(R.id.editText2);
    EditText editText3 =(EditText)findViewById(R.id.editText3);


    public Button m;

    {
        m = (Button) findViewById(R.id.button2);
    }

    Button mu=(Button) findViewById(R.id.button3);
    Button d=(Button) findViewById(R.id.button4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
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


    public void click(View v){
       if(v.getId()==p.getId()){

           int a=Integer.valueOf(String.valueOf(editText.getText()));
           int b=Integer.valueOf(String.valueOf(editText2.getText()));
           int c=a+b;
           editText3.setText(String.valueOf(c));
       }
        else if(v.getId()==m.getId()){

            int a=Integer.valueOf(String.valueOf(editText.getText()));
            int b=Integer.valueOf(String.valueOf(editText2.getText()));
            int c=a-b;
            editText3.setText(String.valueOf(c));
        }
        if(v.getId()==mu.getId()){

            int a=Integer.valueOf(String.valueOf(editText.getText()));
            int b=Integer.valueOf(String.valueOf(editText2.getText()));
            int c=a+b;
            editText3.setText(String.valueOf(c));
        }
        else{

            int a=Integer.valueOf(String.valueOf(editText.getText()));
            int b=Integer.valueOf(String.valueOf(editText2.getText()));
            int c=a+b;
            editText3.setText(String.valueOf(c));
        }
       
    }

}
