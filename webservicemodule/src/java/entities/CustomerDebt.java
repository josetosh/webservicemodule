/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jnjeru
 */
public class CustomerDebt {
    
    int custId;
    Date dateRecorded;
    double DebtAmount;

    public CustomerDebt() {
    }

    public CustomerDebt(int custId, Date dateRecorded, double DebtAmount) {
        this.custId = custId;
        this.dateRecorded = dateRecorded;
        this.DebtAmount = DebtAmount;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Date getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(Date dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    public double getDebtAmount() {
        return DebtAmount;
    }

    public void setDebtAmount(double DebtAmount) {
        this.DebtAmount = DebtAmount;
    }     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.custId;
        hash = 29 * hash + Objects.hashCode(this.dateRecorded);
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
        final CustomerDebt other = (CustomerDebt) obj;
        if (this.custId != other.custId) {
            return false;
        }
        if (!Objects.equals(this.dateRecorded, other.dateRecorded)) {
            return false;
        }
        if (Double.doubleToLongBits(this.DebtAmount) != Double.doubleToLongBits(other.DebtAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomerDebt{" + "custId=" + custId + ", dateRecorded=" + dateRecorded + ", DebtAmount=" + DebtAmount + '}';
    }           
    
}
