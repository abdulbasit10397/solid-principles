package interfacesegregation.example2.bad;

/* Here, this class only needs to implement acceptOnlineOrder() and payOnline() order but
   as RestaurantInterface is a 'fat' interface, so OnlineClient has to implement all methods
   even those which are of no use to this class. This breaks the interface segregation principle.
*/
public class OnlineClient implements RestaurantInterface {
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}
