/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_java_project;
import javax.swing.*;
/**
 *
 * @author Prabhat
 */
public class User1 {
    private int company_id;
    private String company_name;
    private String address;
    private long  mobile_no;
    User1(int c, String cn, String ad,long mn){
        company_id=c;
        company_name=cn;
        address=ad;
        mobile_no=mn;
    }
    int getcompany_id(){
        return company_id;
    }
    String getcompany_name(){
        return company_name;
    }
    String getaddress(){
        return address;
    }
    long getmobile_no(){
        return mobile_no;
    }
}
