package au.com.telstra.simcardactivator.payload;

import javax.persistence.*;

@Entity
public class SimRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String iccid;

    @Column(nullable = false)
    private String customerEmail;
    @Column(nullable = false)
    private boolean active;

    public SimRecord() {
    }

    public SimRecord(long id, String iccid, String customerEmail, boolean active) {
        this.id = id;
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "SimRecord{" +
                "id=" + id +
                ", iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", active=" + active +
                '}';
    }
}
