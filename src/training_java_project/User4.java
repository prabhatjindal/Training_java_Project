/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_java_project;

/**
 *
 * @author Prabhat
 */
class User4 {
    private int bill_id;
    private int product_id;
    private String customer_name;
    private String date;
    private int quantity;
    private long total;
    User4(int bi, int pi, String cn, String d, int q, long t){
        bill_id=bi;
        product_id=pi;
        customer_name=cn;
        date=d;
        quantity=q;
        total=t;
    }
    int getbill_id()
    {
        return bill_id;
    }
    int getproduct_id()
    {
        return product_id;
    }
    String getcustomer_name()
    {
        return customer_name;
    }
    String getdate()
    {
        return date;
    }
    int getquantity(){
        return quantity;
    }
    long gettotal(){
        return total;
    }
}
