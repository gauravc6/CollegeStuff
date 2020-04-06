package com.somecoolname.sheetviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button retrieveButton;
    TextView resultView;

    // This API key and sheet ID is restricted and will not work for you.
    final private static String GOOGLE_API_KEY = "AIzaSyCOWsUy_0l42GzXT2YfmahpPfTCk7XlAr4";
    final private static String SPREADSHEET_ID = "1h58fqNa4dHoajRwlbK36NwgZaWJydxDDtIHxuyTnjEQ";

    HttpTransport transport = AndroidHttp.newCompatibleTransport();
    JsonFactory factory = JacksonFactory.getDefaultInstance();
    final Sheets sheetsService = new Sheets.Builder(transport, factory, null).setApplicationName("SheetsApp").build();

    String range = "Sheet1";
    String receivedData = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = findViewById(R.id.resView);

        retrieveButton = findViewById(R.id.retrieve_button);
        retrieveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            final ValueRange result = sheetsService.spreadsheets().values().get(SPREADSHEET_ID, range).setKey(GOOGLE_API_KEY).execute();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    for (List<Object> objectList: result.getValues()) {
                                        for (Object o: objectList) {
                                            receivedData += o.toString() + "\t\t\t";
                                        }
                                        receivedData += "\n\n";
                                    }
                                    Toast.makeText(MainActivity.this, "Data Fetched!",Toast.LENGTH_LONG).show();
                                    resultView.setText(receivedData);
                                }
                            });
                            Log.d("API", "Data Fetched: " + result.getRange());
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this,"Couldn't fetch sheet data!",Toast.LENGTH_LONG).show();
                            Log.d("API", "Fetching failed: " + e.getLocalizedMessage());
                        }
                    }
                }.start();
            }
        });

    }
}
