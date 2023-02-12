package dependencyinjection.interfaceinjection;

public class ApplicationClass {
    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // the injection via constructor injection
    }
}
