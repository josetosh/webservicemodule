/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.CustomerAccount;
import entities.CustomerDebt;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author jnjeru
 */
@Stateless
@LocalBean
public class Util {
    
    /*Here you have some means of accessing records from a database in a production scenario*/
    /*@PersistenceContext(unitName = "somepersistenceunithere")
    private EntityManager em;*/
    
    List<CustomerAccount> custList = new ArrayList<>();
    List<CustomerDebt> debtList = new ArrayList<>();
    
    @PostConstruct
    public void load(){
        custList.add(new CustomerAccount(1,"John","Doe",true,"JD001"));
        custList.add(new CustomerAccount(2,"Jane","Doe",true,"JD002"));
        custList.add(new CustomerAccount(3,"Kublai","Khan",false,"KK001"));
        custList.add(new CustomerAccount(4,"Wayne","Rooney",true,"WR001"));
        
        debtList.add(new CustomerDebt(1, new Date(), 50.45));
        debtList.add(new CustomerDebt(4, new Date(), 20.80));
    }

    public boolean checkAccountStatus(String meterNumber){
        /*Query a table that has customer accounts details*/
        boolean status = false;
        for(CustomerAccount cm : custList){
            if(cm.getMeterNo().equals(meterNumber)){
                status = cm.isAcctStatus();
                break;
            }
        }
        
        return status;
    }
    
    public double checkDebt(String meterNumber){
        /*Query a table that has customer debt details*/
        
        double debt = 0.00;
        int custId = 0;
        
        for(CustomerAccount cm : custList){
            if(cm.getMeterNo().equals(meterNumber)){
                custId = cm.getId();
                break;
            }
        }
        
        for (CustomerDebt cd : debtList){
            if(cd.getCustId() == custId){
                debt = cd.getDebtAmount();
                break;
            }
        }
        
        return debt;
    }
    
}
