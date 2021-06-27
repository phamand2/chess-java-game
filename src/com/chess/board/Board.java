package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColor;

public class Board {
    private static final Integer BOARD_LENGTH = 8;

    Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];

    // Constructor
    public Board(){
        for(int i = 0; i < boardSquares.length; i++){
            int column = 0;
            // If the position is even then it will be light square otherwise dark
            SquareColor currentColor = (i % 2 == 0) ? SquareColor.LIGHT : SquareColor.DARK;
            // Loop through the enums A-H and get the value for each
            for(File file : File.values()){
                // Create a square with the currentColor and the location (letter and rank)
                Square newSquare = new Square(currentColor, new Location (file, BOARD_LENGTH - i));
                // Reassign the array based of the index and column of the newSquare
                boardSquares[i][column] = newSquare;
                // Alternate the color of the inner loop
                currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;
                column++;
            }
        }
    }

    public void printBoard(){
        for(var row : boardSquares){
            for(var square : row){
                System.out.print(square);
            }
            System.out.println();
        }
    }


}
