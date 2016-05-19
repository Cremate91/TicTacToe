package de.cremate_gamings.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Tic Tac Toe Game
 * ---
 *
 * Code by cremate-gamings
 * First android-app
 *
 * @author Andreas Burger
 */


public class MainActivity extends AppCompatActivity {


    private int playCount = 0;
    private float progress = 0;
    private int MAXPLAYCOUNT = 9;


    private Button button1;

    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



}
