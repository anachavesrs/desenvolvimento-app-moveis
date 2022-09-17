package br.com.up.listadepresentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import br.com.up.listadepresentes.models.Gift;
import br.com.up.listadepresentes.repositories.GiftRepository;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAddGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fabAddGift = findViewById(R.id.fab_add_gift);


        ArrayList<Gift> gifts =
                GiftRepository.getInstance().getAll();

        fabAddGift.setOnClickListener
                (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                   getApplicationContext(),
                        AddGiftActivity.class
                );

                startActivity(intent);
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Gift> gifts =
                GiftRepository.getInstance().getAll();

        if(gifts.size() > 0){
            
        }
    }
}