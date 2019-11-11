package com.example.implisitintens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText websiteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        websiteEditText = (EditText) findViewById(R.id.website_edittext);
    }

    public void openWebsite(View view) {
        String url = websiteEditText.getText().toString();

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);


        if (intent.resolveActivity(getPackageManager())!= null) {
            startActivity(intent);
        }else {
            Log.d("ImplisitInstent", "can't handle this intenst");
        }
    }
}
