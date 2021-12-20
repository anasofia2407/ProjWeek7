package pt.up.fe.ldts.example5;

import pt.up.fe.ldts.example5.Command;
import pt.up.fe.ldts.example5.Position;

public class F extends Command {
    public F(Position position) {
        super(position);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setRow(getPosition().getRow() - 1);
        if (getPosition().getDirection() == 'S') getPosition().setRow(getPosition().getRow() + 1);
        if (getPosition().getDirection() == 'W') getPosition().setColumn(getPosition().getColumn() - 1);
        if (getPosition().getDirection() == 'E') getPosition().setColumn(getPosition().getColumn() + 1);
        return getPosition();
    }
}
