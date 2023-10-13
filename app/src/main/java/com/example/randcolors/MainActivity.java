package com.example.randcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button newColorButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.BLACK};

        newColorButton = (Button) findViewById(R.id.button);
        windowView = findViewById(R.id.windowViewId);

        newColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}