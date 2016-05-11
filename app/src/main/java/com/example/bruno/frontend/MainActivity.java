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

    public void information(View view){
        setContentView(R.layout.information_screen);
    }

    public void request(View view) {
        setContentView(R.layout.request_screen);
    }

    public void host(View view) {
        setContentView(R.layout.offer_screen);
    }

    public void oneClick(View view) {
        // show a message that will be available soon
        AlertDialog.Builder message = new AlertDialog.Builder(this);
        message.setTitle("Atenção!");
        message.setMessage("Esta funcionalidade estará disponível em breve");
        message.setPositiveButton("OK", null);
        message.setCancelable(true);
        message.create().show();
    }

    public void about(View view) {
        setContentView(R.layout.about_screen);
    }
}
