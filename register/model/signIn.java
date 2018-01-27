/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package register.model;

/**
 *
 * @author Sankalp
 */
public class signIn {
    public  String SignInEmail;
    public String SignInPass;
    
    public signIn(){
        
    }
    public  signIn(String Email, String Pass){
    this.SignInEmail= Email;
    this.SignInPass= Pass;
    }
    
    public String getSignInEmail(){
        return SignInEmail;
        //autocorrect add return statement nice!
    }
    
    /*Has to change method type to void as to avoid return statement again
    as i don't want that*/
    
    public void setSignInEmail(String Email){
        this.SignInEmail= Email; 
//@paramater Email auto corrected
    }
    
    public String getSignInPass(){
        return SignInPass ;
        
    }
    
    public void setSignInPass(String Pass){
        this.SignInPass= Pass;
    }
        
}
