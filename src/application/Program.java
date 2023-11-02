package src.application;

import src.boardgame.Board;
import src.boardgame.Position;
import src.chess.ChessMatch;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());
  }
}
