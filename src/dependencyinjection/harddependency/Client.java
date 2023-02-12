package dependencyinjection.harddependency;

import dependencyinjection.ExampleService;

public class Client {
    ExampleService service;

    public Client() {
        service = new ExampleService();
    }

    public void printAsComment () {
        System.out.println(service.format("My Name is Abdul."));
    }
}
