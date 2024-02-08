import java.util.regex.Pattern;

public class Connect implements RobotConnectionManager {
    public RobotConnection getConnection() throws RobotConnectionException {
        RobotConnection robotConnection = null;

        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = new Robot();
            } catch (RobotConnectionException e) {
                if (robotConnection != null) {
                    robotConnection.close();

                    if (i == 2) {
                        throw new RobotConnectionException("3 неудачных попытки подключиться установить соединение");
                    }
                }
            }
        }

        return robotConnection;
    }

}
