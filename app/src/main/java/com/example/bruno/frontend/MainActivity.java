package com.example.bruno.frontend;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import java.lang.String;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    // first method opening app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

    }

    // authentication method
    public void login(View view){

        setContentView(R.layout.function_screen);
    }

    // set the information_screen to the screen
    public void information(View view){

        setContentView(R.layout.information_screen);

        RadioButton male_radio = (RadioButton) findViewById(R.id.sex_male_radio);
        RadioButton female_radio = (RadioButton) findViewById(R.id.sex_female_radio);

        if (male_radio.isActivated())
            female_radio.setActivated(false);

        if (female_radio.isActivated())
            male_radio.setActivated(false);
    }

    //set the request_screen to the screen
    public void request(View view) {

        setContentView(R.layout.request_screen);
    }

    // set the offer_screen to the screen
    public void host(View view) {

        setContentView(R.layout.offer_screen);
    }

    // there is no screen to oneClick
    public void oneClick(View view) {
        // show a message that will be available soon
        AlertDialog.Builder message = new AlertDialog.Builder(this);
        message.setTitle("Atenção!");
        message.setMessage("Esta funcionalidade estará disponível em breve");
        message.setPositiveButton("OK", null);
        message.setCancelable(true);
        message.create().show();
    }

    //set about_screen to the screen
    public void about(View view) {
        setContentView(R.layout.about_screen);

        ListView list = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter;
        ArrayList<String> myString;
        String[] items = {"Bruno Lopes", "bacon", "banana", "orange", "tomator", "ghost"};
        myString = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, myString);
        list.setAdapter(adapter);

    }

    // this method changes the behavior of the back button when it's pressed
    // returning to the previous activity
    @Override
    public void onBackPressed()
    {
        // actually, this just redirect to the function_screen
        setContentView(R.layout.function_screen);
    }


}
