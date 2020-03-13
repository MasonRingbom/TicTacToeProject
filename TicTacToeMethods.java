//Mason Ringbom 
//26 November 2019
//Final Project
//TicTacToeMethods,java 

import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.util.Random;


public class TicTacToeMethods{
//creating scanner
Scanner scan = new Scanner(System.in);
//creating rand 
Random rand = new Random();
//variables
public String[] board = {"dont use","1","2","3","4","5","6","7","8","9"};
int turn = 2;
//methods
public int turnUpdate (){


return turn;
}




public void arrayUpdate (){
  
  //print board
  System.out.println(" ");
  System.out.println(" " + board[1] + "|" + board[2] + "|" + board[3]);
  System.out.println("-------");
  System.out.println(" " + board[4] + "|" + board[5] + "|" + board[6]);
  System.out.println("-------");
  System.out.println(" " + board[7] + "|" + board[8] + "|" + board[9]);
  System.out.println(" ");

  
  int i; //taking in requested spot on board
 
  if(turnUpdate() % 2 == 0 ){
      System.out.print("Player X please enter a number on the board to replace with your mark: ");
      i = scan.nextInt();
      board[i] = "X";//replacing location with X
      turn++;
  }else{ //closing if staring else
      System.out.print("Player O please enter a number on the board to replace with your mark: ");
      i = scan.nextInt();
      board[i] = "O";//replacing location with O      
      turn++;
  }//close else
  

}//close array update


public boolean winCheck () {

boolean winner = false;
//horizontal win check
   if(board[1] == board[2] && board[1] == board[3]){
   winner = true;
   }//close if
   if(board[4] == board[5] && board[4] == board[6]){
   winner = true;
   }//close if
   if(board[7] == board[8] && board[7] == board[9]){
   winner = true;
   }//close if

//vertical win check 
   if(board[1] == board[4] && board[1] == board[7]){
   winner = true;
   }//close if 
   if(board[2] == board[5] && board[2] == board[8]){
   winner = true;
   }//close if
   if(board[3] == board[6] && board[3] == board[9]){
   winner = true;
   }//close if

//diaganol win check
   if(board[1] == board[5] && board[1] == board[9]){
   winner = true;
   }//close if 
   if(board[3] == board[5] && board[3] == board[7]){
   winner = true;
   }//close if

return winner;
}//close method win check


public boolean drawCheck(){
boolean draw = false;
//seeing if the board is full
   if(board[1] == "X" || board[1] == "O"){
   
      if(board[2] == "X" || board[2] == "O"){
      
         if(board[3] == "X" || board[3] == "O"){
         
            if(board[4] == "X" || board[4] == "O"){
            
               if(board[5] == "X" || board[5] == "O"){
               
                  if(board[6] == "X" || board[6] == "O"){
               
                     if(board[7] == "X" || board[7] == "O"){
            
                        if(board[8] == "X" || board[8] == "O"){
         
                           if(board[9] == "X" || board[9] == "O"){
                           
                              draw = true; 
                           }
                        } 
                     }     
                  }
               }
            }                     
         }
      }
   }//closing if
  



return draw; 
}//close method draw Check


public void gameOverWin (){
System.out.println("  CONGRATS WINNER!  ");
System.out.println("************************");
System.out.print("To play again re-run the program");

}//closing gameOverWin

public void gameOverDraw (){
System.out.println(" Its a draw better luck next time ");
System.out.println("************************");
System.out.print("To play again re-run the program");

}//closing gameOverDraw 

public void instructionsFile(String readMe) throws IOException {


int switchNum = rand.nextInt(3)+1;
switch(switchNum){
   case 1 :
   //no breaks will always run all the way through 3 to break so any rand num works
   case 2 :
   
   case 3 :

String fileName = "readMe.txt";//attaching string to txt
//making a file writer and printing info out
PrintWriter fileExport = new PrintWriter(fileName);
fileExport.println("This is my basic Tic-Tac-Toe game");
fileExport.println("First person to get three of the same");
fileExport.println("mark in a row wins! the game should give");
fileExport.println("enough details on what to do. It is very bare");
fileExport.println("bones and easily broken or manipulated. Have fun!");
fileExport.close();//closing print writer

   break;
   }//close switch 
return;
}//closing instructionsFile

}//closing class