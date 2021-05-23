package br.caiocv18.chess;

import br.caiocv18.boardgame.BoardException;

public class ChessException extends BoardException{
    public ChessException(String msg){
        super(msg);
    }
}