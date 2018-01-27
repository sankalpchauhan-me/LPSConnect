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
public class ForRegistry {
     

    public String regName1;
    public String regName2;
    public String RegMail;
    private String RegPass;
    private String RegPassConfirm;

    public ForRegistry() {
    }

    public ForRegistry(String Name1, String Name2, String Mail, String pass, String passConfirm) {
        this.regName1= Name1;
        this.regName2 = Name2;
        this.RegMail =Mail;
        this.RegPass=pass;
        this.RegPassConfirm =passConfirm;
    }

    /**
     * @return the id it is automatically added so I have to check about this on the net to know what it means
     */
    public String getregName1() {
        return regName1;
        //autocorrect add return statement nice!
    }

    /**
     * @param Name1 the Name to set (Now this is UNEXPECTED I had added my comment and the software corrected my own comment IMPOSSIBLE Must ASK??)
     */
    /*Has to change method type to void as to avoid return statement again
    as i don't want that*/
    public void setregName1(String Name1) {
        this.regName1 = Name1;
    }

    /**
     * @return the name
     */
    public String getregName2() {
        return regName2;
    }

    /**
     * @param Name2 the name to set
     */
    public void setregName2(String Name2) {
        this.regName2 =Name2;
    }

    /**
     * @return the E_MAil
     */
    public String getRegMail() {
        return RegMail;
    }

    /**
     * @param Mail the E_Mail to set
     */
    public void setRegMail(String Mail) {
        this.RegMail = Mail;
    }

    /**
     * @return the password
     */
    public String getRegPass() {
        return RegPass ;
    }

    /**
     * @param pass the password to set
     */
    public void setRegPass(String pass) {
        this.RegPass = pass;
    }

    /**
     * @return the password
     */
    public String getRegPassConfirm() {
        return RegPassConfirm;
    }

    /**
     * @param passConfirm the password to set
     */
    public void setRegPassConfirm(String passConfirm) {
        this.RegPassConfirm = passConfirm;
    }
}

