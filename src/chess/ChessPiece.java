package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece {
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
	
	//METHODS
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
