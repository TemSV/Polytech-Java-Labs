package lab1;

public class Hero {
    Movement movement;

    Hero(Movement src) {
        this.movement = src;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void executeMovement() {
        movement.move();
    }


}
