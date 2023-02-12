package dependencyinjection.setterinjection;

import dependencyinjection.ExampleService;

public class Client {
    ExampleService service;

    //This is an example of setter injection. It's almost same as constructor.
    public void setExampleService (ExampleService service) {
        this.service = service;
    }

    public void printAsComment () {
        System.out.println(service.format("My Name is Abdul."));
    }
}
