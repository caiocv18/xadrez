package br.caiocv18.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.caiocv18.chess.ChessException;
import br.caiocv18.chess.ChessMatch;
import br.caiocv18.chess.ChessPiece;
import br.caiocv18.chess.ChessPosition;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		try {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		} catch (ChessException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
	}
}