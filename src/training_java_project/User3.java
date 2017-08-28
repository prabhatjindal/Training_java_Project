/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_java_project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Prabhat
 */
class User3 {
    private final int stock_id;
    private final int product_id;
    private final int quantity;
    User3(int si, int pi, int q){
        stock_id=si;
        product_id=pi;
        quantity=q;
    }
    int getstock_id(){
        return stock_id;
    }
    int getproduct_id(){
        return product_id;
    }
    int getquantity(){
        return quantity;
    }
}
