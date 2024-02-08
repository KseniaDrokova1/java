
public class Main {
    public static void main(String[] args) {

        try (RobotConnection connection = new Robot()) {
            RobotConnectionManager connectionManager = new Connect();
            connectionManager.getConnection();
            connection.moveRobotTo(2, 4);

        }
//        catch (RobotConnectionException ignored) {
//
//        }finally {
//            connection.close();
//        }
//    }
    }
}