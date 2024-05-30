package ChessLayer;

import BoardLayer.BoardException;
import BoardLayer.Position;

public class ChessPosition{
    private char column;
    private int line;

    public int getLine() {
        return line;
    }
    public char getColumn() {
        return column;
    }
    public ChessPosition(char column, int line) {
        if(column < 'a' || column > 'h' || line > 8 || line < 1){
            throw new BoardException("Error instantiating Chess Position, valid values are from a1 to 8h");
        }
        this.column = column;
        this.line = line;
    }
    public Position toPosition(){
        return new Position(8 - line, column - 'a' );

    }
    public ChessPosition  fromPosition(Position position){
        char column = (char) (position.getColumn() - 'a');
        int line = 8 - position.getLine();
        return new ChessPosition(column, line);
    }

    @Override
    public String toString() {
        return column + "" + line;
    }
}
