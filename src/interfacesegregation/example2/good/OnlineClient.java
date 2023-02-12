package interfacesegregation.example2.good;

public class OnlineClient implements OnlineOrderInterface, OnlinePaymentInterface{
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void payOnline() {

    }
}
