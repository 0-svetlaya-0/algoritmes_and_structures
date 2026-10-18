package pr6;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        this.topLeft     = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft=" + topLeft +
                ", bottomRight=" + bottomRight + "}";
    }

    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 10, 10, 2, 2);
        System.out.println("Начало: " + rect);

        if (rect.isSameSpeed()) {
            System.out.println("Скорости точек совпадают — можно двигать.");
        } else {
            System.out.println("ВНИМАНИЕ: скорости точек разные!");
            return;
        }

        rect.moveRight();
        System.out.println("После moveRight: " + rect);

        rect.moveDown();
        System.out.println("После moveDown:  " + rect);

        rect.moveLeft();
        System.out.println("После moveLeft:  " + rect);

        rect.moveUp();
        System.out.println("После moveUp:    " + rect);
    }
}