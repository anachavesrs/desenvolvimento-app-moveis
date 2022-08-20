package br.com.up.example.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.text_title);
        buttonAction = findViewById(R.id.button_action);

        messages.add("Comprar pizza para o prof");
        messages.add("Chamar o prof para o churras");
        messages.add("Chamar o prof para andar de kart");
        messages.add("Chamar o prof para o rodízio de pizza");
        messages.add("O prof vai trazer chocolate");



        View.OnClickListener listener = new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                textViewTitle.setText("Olá, mundo!");

                Random random = new Random();
                int index = random.nextInt(messages.size());
                String message = messages.get(index);
                textViewTitle.setText(message);
            }

        } ;
        buttonAction.setOnClickListener(listener);
    }
}