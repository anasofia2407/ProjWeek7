package pt.up.fe.ldts.example5;

public class Turtle {
    private Position p;


    public Turtle(int row, int column, char direction) {
        this.p= new Position(row,column,direction);

    }

    public int getRow() {
        return p.getRow();
    }

    public int getColumn() {
        return p.getColumn();
    }
    public char getDirection(){return p.getDirection();}

    public void setP(Position p){this.p=p;}

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            setP(new L(p).execute());
        } else if (command == 'R') { // ROTATE RIGHT
            setP(new R(p).execute());
        } else if (command == 'F'){ // MOVE FORWARD
            setP(new F(p).execute());
        }
    }
}
