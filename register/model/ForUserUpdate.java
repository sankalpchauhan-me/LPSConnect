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
public class ForUserUpdate {
    private String UserEmail;
    private String UserIntrest;
    private String UserRelation;
    private String UserJoin;
    private String UserHobby;
   // private String UserPhoto;

    public ForUserUpdate() {
    }

    public ForUserUpdate(String email, String intrest, String relation, String join, String hobby /*, String photo*/) {
        this.UserEmail= email;
        this.UserIntrest = intrest;
        this.UserRelation = relation;
        this.UserJoin = join;
        this.UserHobby= hobby;
        //this.UserPhoto = photo;
    }
public String getUserEmail(){
    return UserEmail;
}
public void setUserEmail(String email){
    this.UserEmail=email;
}
    
     
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
}
