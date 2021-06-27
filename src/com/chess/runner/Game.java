package com.chess.runner;

import com.chess.board.Board;
import com.chess.piece.*;

public class Game {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.printBoard();
        PieceColor color = PieceColor.DARK;
        Movable pawn = new Pawn(color);
        Queen queen = new Queen(color);
        printPiece(pawn);
        printPiece(queen);

    }
    public static void printPiece(Movable piece){
        piece.getValidMoves(null);
    }
}
