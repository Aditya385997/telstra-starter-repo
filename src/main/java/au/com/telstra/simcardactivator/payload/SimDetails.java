package au.com.telstra.simcardactivator.payload;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class SimDetails {

    private String iccid;

    private String customerEmail;


    public SimDetails() {
    }

    public SimDetails(String iccid, String customerEmail) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;

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

    @Override
    public String toString() {
        return "SimDetails{" +
                "iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\''+
                '}';
    }
}
