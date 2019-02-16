package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
	Color color;
	
	//CONSTRUCTOR
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	//GETTERS AND SETTERS
	public Color getColor() {
		return color;
	}

}
