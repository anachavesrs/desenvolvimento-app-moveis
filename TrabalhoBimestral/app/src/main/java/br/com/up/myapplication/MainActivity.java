package br.com.up.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutFone;
    private TextInputLayout inputLayoutMsg;

    private TextInputEditText inputEditTextFone;
    private TextInputEditText inputEditTextMsg;

    private Button buttonEnviarMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutFone = findViewById(R.id.inputLayoutFone);
        inputLayoutMsg = findViewById(R.id.inputLayoutMsg);

        inputEditTextFone = findViewById(R.id.inputEditTextFone);
        inputEditTextMsg = findViewById(R.id.inputEditTextMsg);

        buttonEnviarMsg = findViewById(R.id.buttonEnviarMsg);


        buttonEnviarMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numFone = inputEditTextFone.getText().toString();
                String msg = inputEditTextMsg.getText().toString();

                Uri webpage = Uri.parse("https://wa.me/"+numFone+"?text="+msg);
                Intent webIntent = new Intent(Intent.ACTION_VIEW , webpage);
                startActivity(webIntent);
            }
        });


    }
}