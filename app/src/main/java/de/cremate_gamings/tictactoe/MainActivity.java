package de.cremate_gamings.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    private boolean played = false;
    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    /**
     * Init some Buttons and add an EventListener
     */
    private void init() {
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};

        for (final Button button : buttons) {
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (playCount <= 8) {
                        if (button.getText() == "") {
                            button.setText(whichPlayer());

                        } else {

                        }
                    }else{
                        gameOver();
                    }
                }
            });
        }
    }

    /**
     * GameOver
     * Set the buttons Invisible and show the winner and restart the game
     */
    private void gameOver() {
        for(Button button : buttons){

            button.setVisibility(View.INVISIBLE);
        }
    }


    /**
     * Give the Player (X or Y) back which is set to the button
     * @return
     */
    public String whichPlayer() {
        playCount++;
        if (playCount % 2 == 0) {
            return "x";
        } else {
            return "y";
        }
    }


}
