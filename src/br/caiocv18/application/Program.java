package br.caiocv18.application;

import br.caiocv18.boardgame.Board;
import br.caiocv18.boardgame.Position;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Position pos = new Position(3, 5);
        System.out.println(pos);

        Board board = new Board(8,8);
    }
}