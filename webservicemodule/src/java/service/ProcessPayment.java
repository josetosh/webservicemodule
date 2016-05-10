/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import beans.Util;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author jnjeru
 */
@WebService(serviceName = "ProcessPayment")
@Stateless()
public class ProcessPayment {
    @EJB
    private Util util;

    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "processPayment")
    public String processCartPayment(@WebParam(name = "name") String name, @WebParam(name = "quantity") int quantity, @WebParam(name = "amount") double amount, @WebParam(name = "discount") double discount) {
        
        String lName = name;
        int lQuatity = quantity;
        double lAmount = amount;
        double lDiscount = discount;
        
        /*Here you can proceed to save the order to the database with a status like not yet paid and redirect the shopper to 
        some backend portal of a bank where he can enter the credit card datails and if payment successful update the earkier 
        order status to paid and then take him back to the shopping card and display some "payment successful page".*/             
        
        return "success";
    }

    /**
     * Web service operation
     * @param meterNumber
     * @return 
     */
    @WebMethod(operationName = "checkAccountAndDebt")
    public String checkAccountAndDebt(@WebParam(name = "meterNumber") String meterNumber) {
        
        StringBuilder rValue = new StringBuilder();
        boolean accStatus = false;
        double debtAmt = 0.00;
        
        /*String mNum = meterNumber;
        boolean acctStatus = false;
        double debt = 0.00;
        StringBuilder rValue = new StringBuilder();
        
        acctStatus = util.checkAccountStatus(mNum);
        debt = util.checkDebt(mNum);
        rValue.append(acctStatus);
        rValue.append(debt);
        return rValue.toString();*/
        
        accStatus = util.checkAccountStatus(meterNumber);
        debtAmt = util.checkDebt(meterNumber);
        
        rValue.append(accStatus);
        rValue.append("/");
        rValue.append(debtAmt);
        
        return rValue.toString();
    }
}
