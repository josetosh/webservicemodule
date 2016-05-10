/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Objects;

/**
 *
 * @author jnjeru
 */
public class CustomerAccount {
    
    int id;
    String fName;
    String lName;
    boolean acctStatus;
    String meterNo;

    public CustomerAccount() {
    }      

    public String getMeterNo() {
        return meterNo;
    }

    public CustomerAccount(int id, String fName, String lName, boolean acctStatus, String meterNo) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.acctStatus = acctStatus;
        this.meterNo = meterNo;
    }
    
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(boolean acctStatus) {
        this.acctStatus = acctStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.fName);
        hash = 23 * hash + Objects.hashCode(this.lName);
        hash = 23 * hash + (this.acctStatus ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.meterNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CustomerAccount other = (CustomerAccount) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (this.acctStatus != other.acctStatus) {
            return false;
        }
        if (!Objects.equals(this.meterNo, other.meterNo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", acctStatus=" + acctStatus + ", meterNo=" + meterNo + '}';
    }
          
}
