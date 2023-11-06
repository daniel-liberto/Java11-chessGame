package src.application;

import src.boardgame.Board;
import src.boardgame.Position;
import src.chess.ChessMatch;
import src.chess.ChessPiece;
import src.chess.ChessPosition;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    ChessMatch chessMatch = new ChessMatch();

    while(true){
      UI.printBoard(chessMatch.getPieces());
      System.out.print("\nSource: ");
      ChessPosition source = UI.readChessPosition(sc);
      System.out.print("\nTarget: ");
      ChessPosition target = UI.readChessPosition(sc);

      ChessPiece capturedPiece  = chessMatch.performChessMove(source, target);
    }
  }
}
