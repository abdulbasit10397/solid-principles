package dependencyinjection.constructorinjection;
import dependencyinjection.ExampleService;

public class Client {
    ExampleService service;

    //This is an example of constructor injection
    public Client(ExampleService service) {
        this.service = service;
    }

    public void printAsComment () {
        System.out.println(service.format("My Name is Abdul."));
    }
}
