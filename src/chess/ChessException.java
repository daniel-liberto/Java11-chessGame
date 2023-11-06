package src.chess;

import src.boardgame.BoardException;

public class ChessException extends BoardException {
  private static final long serialUID = 1L;
  public ChessException(String msg){
    super(msg);
  }
}
