package br.caiocv18.chess;

import br.caiocv18.boardgame.Board;
import br.caiocv18.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}