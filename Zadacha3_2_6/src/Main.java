// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            RobotConnectionManager connectionManager = new Connect();

            RobotConnection connection = connectionManager.getConnection();
            connection.moveRobotTo(2, 4);

            connection.close();
        } catch (RobotConnectionException ignored) {

        }
    }
}