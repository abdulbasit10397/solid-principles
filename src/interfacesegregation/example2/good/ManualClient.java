package interfacesegregation.example2.good;

public class ManualClient implements ManualOrderInterface, ManualPaymentInterface{
    @Override
    public void walkInCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}
