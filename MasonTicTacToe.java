//Mason Ringbom 
//26 November 2019
//Final Project
//MasonTicTacToe.java
import java.io.*;
import java.util.*;

public class MasonTicTacToe {

public static void main (String[] args)throws IOException {
 TicTacToeMethods Game = new TicTacToeMethods();
 Game.instructionsFile("readMe.txt");
boolean close = false;//making while loop run
 
while(close == false){ //runs while nobody has won or a tie
 Game.arrayUpdate();//fills a spot and updates board
   if( Game.winCheck() == true){//checks for a win
       Game.gameOverWin();//if win is true sends winner game over message
       close = true;//ends while loop 
       }//close if
   if( Game.drawCheck() == true){//checks for a draw
       Game.gameOverDraw();//if draw is true sends draw game over message
       close = true;//ends while loop
       }//close if
       
}//close while

}//close main method 

}//close class

/*
fundamentals print            X
fundamentals scanner          X
decision structure if,if else X
Decision strucutre switch     X
while Loop                    X
Add read me file              X
Rand num generator            X
Methods of 3 types            X
Array                         X
non-driver class              X
Commented                     X
*/