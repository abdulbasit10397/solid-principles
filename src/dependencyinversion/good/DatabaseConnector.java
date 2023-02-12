package dependencyinversion.good;

public class DatabaseConnector {
    DBConnectionInterface dbConnectionInterface;

    public DatabaseConnector(DBConnectionInterface dbConnectionInterface) {
        this.dbConnectionInterface = dbConnectionInterface;
        this.dbConnectionInterface.connect();
    }
}
