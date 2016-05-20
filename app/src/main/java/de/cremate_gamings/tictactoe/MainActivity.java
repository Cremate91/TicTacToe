package de.cremate_gamings.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

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
    TextView pfeil;
    TextView winner;
    TextView progressTV;
    ProgressBar progressBar;

    Button reset;
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
        pfeil = (TextView) findViewById(R.id.textView);
        winner = (TextView) findViewById(R.id.textView4);
        progressTV = (TextView) findViewById(R.id.textView6);

        reset = (Button) findViewById(R.id.button10);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

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
        if(playCount > 8){
            Log.d("hi", "test");
            winner.setText(R.string.no_winner);
        }else{
            //ToDo Brainlogic
            //Log.d("hi", "ttttt");

        }
        winner.setVisibility(View.VISIBLE);
        reset.setVisibility(View.VISIBLE);
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reset();
            }
        });
    }


    /**
     * Reset the Game and UI
     */
    private void reset() {
        playCount = 0;
        pfeil.setText(R.string.pfeil_left);
        winner.setVisibility(View.INVISIBLE);
        reset.setVisibility(View.INVISIBLE);

        for(Button button : buttons){
            button.setText("");
            button.setVisibility(View.VISIBLE);
        }
    }


    /**
     * Give the Player (X or Y) back which is set to the button
     * @return String with X or Y
     */
    public String whichPlayer() {
        playCount++;
        if (playCount % 2 == 1) {
            pfeil.setText(R.string.pfeil_right);
            return "x";
        } else {
            pfeil.setText(R.string.pfeil_left);
            return "y";
        }
    }


}
