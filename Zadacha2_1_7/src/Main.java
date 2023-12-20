public class Main {
public static void main(String[] args) {
        Robot robot = new Robot(5, 0, Direction.UP);
        moveRobot(robot, -2, -1);
        }

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public static class Robot {
    int X;
    int Y;
    Direction dir;

    public Robot(int X, int Y, Direction dir) {
        this.X = X;
        this.Y = Y;
        this.dir = dir;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return dir;
    }

    public int getX() {
        // текущая координата X
        return X;
    }

    public int getY() {
        // текущая координата Y
        return Y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        if (dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.UP;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        if (dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch(dir) {
            case UP   : Y++; break;
            case DOWN : Y--; break;
            case LEFT : X--; break;
            case RIGHT: X++; break;
        }
    }
}


    public static void moveRobot(Robot robot, int toX, int toY) {

        int dirX = robot.getX();
        int dirY = robot.getY();

        System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());

        if (dirY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (dirY != toY) {
                robot.stepForward();
                System.out.println("dirY >= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                dirY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (dirY != toY) {
                robot.stepForward();
                System.out.println("dirY <= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                dirY++;
            }
        }
        if (dirX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (dirX != toX) {
                robot.stepForward();
                System.out.println("dirX >= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                dirX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (dirX != toX) {
                robot.stepForward();
                System.out.println("dirX <= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                dirX++;
            }
        }

    }

}