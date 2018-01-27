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
public class ForUser {
    private String UserEmail;
    private String UserName1;
    private String UserName2;
    private String UserMail;
    private String UserIntrest;
    private String UserRelation;
    private String UserJoin;
    private String UserHobby;
   // private String UserPhoto;

    public ForUser() {
    }

    public ForUser(String name1, String name2, String e_mail, String intrest, String relation, String join, String hobby /*, String photo*/) {
        this.UserName1 = name1;
        this.UserName2 = name2;
        this.UserMail= e_mail;
        this.UserIntrest = intrest;
        this.UserRelation = relation;
        this.UserJoin = join;
        this.UserHobby= hobby;
        //this.UserPhoto = photo;
    }
public String getUserName1(){
        return UserName1;
}
public void setUserName1(String name1){
    this.UserName1= name1;
}
public String getUserName2(){
    return UserName2;
}
public void setUserName2(String name2){
    this.UserName2=name2;
}
public String getUserMail(){
    return UserMail;
}
public void setUserMail(String e_mail){
    this.UserMail=e_mail;
}
    /**
     * @return the Intrest
     */
    public String getUserIntrest() {
        return UserIntrest;
    }

    /**
     * @param intrest the user to set
     */
    public void setUserIntrest(String intrest) {
        this.UserIntrest = intrest;
    }

    /**
     * @return the name
     */
    public String getUserRelation() {
        return UserRelation;
    }

    /**
     * @param relation the name to set
     */
    public void setUserRelation(String relation) {
        this.UserRelation = relation;
    }

    /**
     * @return the contactNo
     */
    public String getUserJoin() {
        return UserJoin;
    }

    /**
     * @param join the UserJoin to set
     */
    public void setUserJoin(String join) {
        this.UserJoin = join;
    }

    /**
     * @return the hobby
     */
    public String getUserHobby() {
        return UserHobby;
    }

    /**
     * @param hobby
     */
    public void setUserHobby(String hobby) {
        this.UserHobby = hobby;
    }

    /**
     * @return the photo
     */
   
   // public String getUserPhoto() {
    //    return UserPhoto;
    }

    /**
     * @param photo the photo to set
     */
   // public void setUserPhoto(String photo) {
   //     this.UserPhoto= photo;
    // } }

