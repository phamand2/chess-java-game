package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Pawn extends AbstractPiece implements Movable {


    public Pawn(PieceColor pieceColor) {
        // call the constructor for the super class
        super(pieceColor);
        this.name = "Pawn";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.getName() + "--> getValidMovies()");
        return null;
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName() + "--> makeMove()");
    }
}
