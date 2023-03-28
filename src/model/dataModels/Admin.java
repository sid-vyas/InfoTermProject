/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.dataModels;

public class Admin {
    String userId;
    String name;
    
    //levelOfAccess can be "System", "Hospital" and "Community"  
    String levelOfAccess;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelOfAccess() {
        return levelOfAccess;
    }

    public void setLevelOfAccess(String levelOfAccess) {
        this.levelOfAccess = levelOfAccess;
    }
}