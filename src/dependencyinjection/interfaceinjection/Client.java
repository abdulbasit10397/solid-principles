package dependencyinjection.interfaceinjection;

public class Client {
    Service service;

    //This is an example of constructor injection
    public Client(Service service) {
        this.service = service;
    }

    public void doSomething () {
        service.write("My Name is Abdul.");
    }
}
