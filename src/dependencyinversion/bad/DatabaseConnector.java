package dependencyinversion.bad;

/* In this following example, let's say that we are migrating to an Oracle database then
   along with adding a new class i.e. OracleConnection, we have to modify DatabaseConnector
   class also because this class is dependent on a concrete low level class i.e. MySqlConnection.
   This breaks the Dependency Inversion Principle and also breaks the open-close principle.
*/
public class DatabaseConnector {
    private MySqlConnection dbConnection;

    public DatabaseConnector(MySqlConnection dbConnection) {
        this.dbConnection = dbConnection;
        this.dbConnection.connect();
    }
}
