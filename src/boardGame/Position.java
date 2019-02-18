package boardGame;

public class Position {
	private Integer row;
	private Integer column;
	
	//CONTRUCTOR
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//GETTERS AND SETTERS
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//METHODS
	
	public void setValues(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//TOSTRING
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
