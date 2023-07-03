package au.com.telstra.simcardactivator.payload;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SimDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String iccid;

    private String customerEmail;

    private boolean active;
    public SimDetails() {
    }

    public SimDetails(String iccid, String customerEmail,boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setActive(boolean active)
    {
        this.active = active;
    }
    public boolean getActive()
    {
        return active;
    }

    @Override
    public String toString() {
        return "SimDetails{" +
                "iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", active= '"+active+'\''+
                '}';
    }
}
