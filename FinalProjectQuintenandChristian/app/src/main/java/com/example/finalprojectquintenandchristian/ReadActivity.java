package com.example.finalprojectquintenandchristian;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadActivity extends AppCompatActivity {
    private TextView finalResult;
    private Button button;
    private Button fUp;
    private Button fDown;
    private ScrollView scroll;
    public int i = 0;
    public float s;
    public String URL;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        setContentView(R.layout.activity_read);
        URL = intent.getStringExtra("bookURL");
        finalResult = findViewById(R.id.tv_result);
        scroll = findViewById(R.id.scrollView);
        button = findViewById(R.id.button);
        fUp = findViewById(R.id.up);
        fDown = findViewById(R.id.down);
        i=0;
        s = finalResult.getTextSize();
        AsyncTaskRunner myTask = new AsyncTaskRunner();
        myTask.execute( URL);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=50;
                scroll.setScrollY(i);
            }
        });

        fUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=1;
                finalResult.setTextSize(s);
            }
        });

        fDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s-=1;
                finalResult.setTextSize(s);
            }
        });

    }

    private class AsyncTaskRunner extends AsyncTask<String, String, String> {
        ProgressDialog progressDialog;
        @Override
        protected String doInBackground(String... strings) {
            return fetchItem(strings[0]);
        }

        protected String fetchItem( String str_url ) {
            try {
                // assemble the string and the search request
                StringBuilder response = new StringBuilder();
                URL url = new URL(str_url);

                // make the connection
                HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
                httpconn.setRequestMethod("GET");
                httpconn.connect();

                // did it do ok?
                if (httpconn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    BufferedReader input = new BufferedReader(
                            new InputStreamReader(httpconn.getInputStream()), 8192);
                    String strLine = null;
                    while ((strLine = input.readLine()) != null) {
                        // have more data
                        response.append(strLine);
                        response.append("\n");
                    }
                    input.close();
                    httpconn.disconnect();
                    return response.toString();
                }
            } catch (IOException e) {

                return e.getMessage();
            }
            return "";
        }
        @Override
        protected void onPostExecute(String result) {
            // execution of result of Long time consuming operation
            progressDialog.dismiss();
            finalResult.setText(result);

        }

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(ReadActivity.this,
                    "ProgressDialog",
                    "");
        }

        @Override
        protected void onProgressUpdate(String... text) {
            finalResult.setText(text[0]);

        }
    }
}