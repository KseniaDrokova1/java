public class Robot implements RobotConnection {
    int xn = 5;
    int yn = 6;

    public void moveRobotTo(int x, int y) {
        try {
            xn = x;
            yn = y;
            System.out.println("Робот переместился в точку (" + xn + "," + yn + ")");
        } catch (RobotConnectionException e) {
            close();
        }
    }

    public void close() {
        try {
            System.out.println("Соединение разорвано");
        } catch (RobotConnectionException e) {

        }
    }

}
