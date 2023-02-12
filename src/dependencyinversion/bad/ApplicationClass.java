package dependencyinversion.bad;

public class ApplicationClass {
    public static void main (String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector(new MySqlConnection());
    }
}
