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
class User2 {
    private int sales_id;
    private int product_id;
    private String sales_date;
    private int quantity;
    private int total;
    User2(int c, int cn, String ad ,int mn,int t){
        sales_id=c;
        product_id=cn;
        sales_date=ad;
        quantity=mn;
        total=t;
    }
    int getsales_id(){
        return sales_id;
    }
    int getproduct_id(){
        return product_id;
    }
    String getsales_date(){
        return sales_date;
    }
    int getquantity(){
        return quantity;
    }
    int getTotal(){
        return total;
    }
}
