package com.example.bruno.frontend;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
