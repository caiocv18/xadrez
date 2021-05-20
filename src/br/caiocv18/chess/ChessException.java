package br.caiocv18.chess;

import br.caiocv18.boardgame.BoardException;

public class ChessException extends BoardException{
    private static final long serialVersionID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}