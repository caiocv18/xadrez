package br.caiocv18.chess.pieces;

import br.caiocv18.boardgame.Board;
import br.caiocv18.chess.ChessPiece;
import br.caiocv18.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}