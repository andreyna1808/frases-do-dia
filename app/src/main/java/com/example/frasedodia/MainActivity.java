package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Atributo
    String[] sentences = {
            "A vida é sofrimento, mas a gente não vê pq não tem UI",
            "Não tem nada mais permanente que uma solução temporária",
            "Nós não criamos as regras, só jogamos o jogo",
            "Tive várias chances de fazer merda e não desperdicei nenhuma",
            "Único momento que errei, foi quando pensei estar errado",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateSentence(View view) {
        TextView text = findViewById(R.id.textResult);
        int numberGeneric = new Random().nextInt(sentences.length);
        String sentence = sentences[numberGeneric];

        text.setText(sentence);
    }

    public void viewAll(View view) {
        TextView text = findViewById(R.id.textResult);
        String textResult = "";

        for (String sentence: sentences) {
            textResult += sentence + "\n" + "\n";
        }

        text.setText(textResult);
    }

    public void clearAll(View view) {
        TextView text = findViewById(R.id.textResult);
        text.setText("");
    }
}