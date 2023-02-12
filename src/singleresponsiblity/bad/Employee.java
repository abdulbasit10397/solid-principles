package singleresponsiblity.bad;

import java.util.Date;

public class Employee {
    private String id;
    private String name;
    private String address;
    private Date dateOfJoining;

    /*  This method doesn't come under the responsibility of the Employee class.
        It comes under the responsibility of HR department (class). Therefore,
        the following method shouldn't be in Employee class. This breaks
        Single Responsibility Principle  */
    public boolean isPromotionDueThisYear() {
        return false;
    }

    /* The following method also breaks SRP because this is the responsibility of the
        Finance department */
    public double calculateIncomeTaxForThisYear() {
        return 0.0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
