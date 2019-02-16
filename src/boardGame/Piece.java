package boardGame;

public class Piece {
	protected Position position;
	private Board board;
	
	//CONSTRUCTOR
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//GETTERS AND SETTERS
	protected Board getBoard() {
		return board;
	} 	
	
}
