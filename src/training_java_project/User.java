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
class User {
    private  int product_id;
    private  String product_name;
    private  String company_name;
    private  int rate;
    private  String mfg_date;
    private  String exp_date;
    User(int p,String pn,String cn,int rate,String md,String ed){
        this.product_id=p;
        product_name=pn;
        company_name=cn;
        this.rate=rate;
        mfg_date=md;
        exp_date=ed;
    }
     int getproduct_id(){
        return product_id;
    }
      String getproduct_name(){
        return product_name;
    }
       String getcompany_name(){
        return company_name;
    }
        int getrate(){
        return rate;
    }
         String getmfg_date(){
        return mfg_date;
    }
          String getexp_date(){
        return exp_date;
    }
}
