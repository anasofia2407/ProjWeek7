package pt.up.fe.ldts.example5;

import pt.up.fe.ldts.example5.Position;

public abstract class Command {
    Position position;

    public Command(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract Position execute();
}
