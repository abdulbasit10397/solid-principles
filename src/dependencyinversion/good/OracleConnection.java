package dependencyinversion.good;

public class OracleConnection implements DBConnectionInterface{
    public int connect() {
        return 2;
    }
}
