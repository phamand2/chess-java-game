package com.chess.runner;

import com.chess.board.Board;
import com.chess.piece.AbstractPiece;
import com.chess.piece.Pawn;
import com.chess.piece.PieceColor;
import com.chess.piece.Queen;

public class Game {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.printBoard();
        PieceColor color = PieceColor.DARK;
        Pawn pawn = new Pawn(color);
        Queen queen = new Queen(color);
        printPiece(pawn);
        printPiece(queen);
    }
    public static void printPiece(AbstractPiece piece){
        System.out.println(piece.toString());
    }
}
