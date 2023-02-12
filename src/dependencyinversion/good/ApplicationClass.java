package dependencyinversion.good;

public class ApplicationClass {
    public static void main (String[] args) {

        /* Now, as the DatabaseConnector class is dependent on DBConnectionInterface,
           So, it can work for all classes that implements that interface. */

        DatabaseConnector databaseConnector = new DatabaseConnector(new MySqlConnection());
        databaseConnector = new DatabaseConnector(new OracleConnection());
    }
}
