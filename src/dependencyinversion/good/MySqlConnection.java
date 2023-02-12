package dependencyinversion.good;

public class MySqlConnection implements DBConnectionInterface{
    public int connect() {
        return 1;
    }
}
