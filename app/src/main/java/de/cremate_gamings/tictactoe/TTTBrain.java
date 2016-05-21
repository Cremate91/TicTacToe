package de.cremate_gamings.tictactoe;

/**
 * TTTBrain is the logic of TicTacToe
 * 
 * Created by Andreas Burger on 21.05.2016.
 */
public class TTTBrain {
    
    private String[] fieldToPlay = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    public boolean fin = false;
    public String winner = "";

    /**
     * Insert in fieldToPlay 
     * @param field locates where to insert
     * @param value which value is to insert
     */
    public void insertPlayer(int field, String value){
        fieldToPlay[field] = value;
    }

    /**
     * Checks if Player X or Y has won
     */
    public void checkForWin(){
        //fieldToPlay 1, 2 and 3 have the same value
        if(fieldToPlay[0] == fieldToPlay[1] && fieldToPlay[0] == fieldToPlay[2]){
            fin = true;
            winner = fieldToPlay[0];
        }
        //fieldToPlay 4, 5 and 6 have the same value
        if(fieldToPlay[3] == fieldToPlay[4] && fieldToPlay[3] == fieldToPlay[5]){
            fin = true;
            winner = fieldToPlay[3];
        }
        //fieldToPlay 7, 8 and 9 have the same value
        if(fieldToPlay[6] == fieldToPlay[7] && fieldToPlay[6] == fieldToPlay[8]){
            fin = true;
            winner = fieldToPlay[6];
        }
        //fieldToPlay 1, 4 and 7 have the same value
        if(fieldToPlay[0] == fieldToPlay[3] && fieldToPlay[0] == fieldToPlay[6]){
            fin = true;
            winner = fieldToPlay[0];
        }
        //fieldToPlay 2, 5 and 8 have the same value
        if(fieldToPlay[1] == fieldToPlay[4] && fieldToPlay[1] == fieldToPlay[7]){
            fin = true;
            winner = fieldToPlay[1];
        }
        //fieldToPlay 3, 6 and 9 have the same value
        if(fieldToPlay[2] == fieldToPlay[5] && fieldToPlay[2] == fieldToPlay[8]){
            fin = true;
            winner = fieldToPlay[2];
        }
        //fieldToPlay 1, 5 and 9 have the same value
        if(fieldToPlay[0] == fieldToPlay[4] && fieldToPlay[0] == fieldToPlay[8]){
            fin = true;
            winner = fieldToPlay[0];
        }
        //fieldToPlay 7, 5 and 3 have the same value
        if(fieldToPlay[6] == fieldToPlay[4] && fieldToPlay[6] == fieldToPlay[2]){
            fin = true;
            winner = fieldToPlay[6];
        }
        
    }
}
