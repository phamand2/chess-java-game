package com.chess.piece;

import com.chess.squares.Square;

public class AbstractPiece {
    protected String name;
    protected PieceColor pieceColor;
    protected Square currentSquare;

    // At construction time, each piece will have a color.
    public AbstractPiece(PieceColor pieceColor){
        this.pieceColor = pieceColor;
    }

    public String getName() {
        return name;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    @Override
    public String toString() {
        return "AbstractPiece{" +
                "name='" + name + '\'' +
                ", pieceColor=" + pieceColor +
                ", currentSquare=" + currentSquare +
                '}';
    }
}

