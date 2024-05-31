package BoardLayer;

public class Position {

    public int line;
    public int column;

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }
    public Position(){

    }

    public int getColumn() {
        return column;
    }
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setPosition(int line, int column){
        this.line = line;
        this.column = column;
    }

    public String toString() {
        return line + ", " + column;
    }

}
