package Systems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
abstract class User {
    protected static int loggedIn;
    protected static String[] users = {"Raharjo", "Rachman", "Sinta", "Sari"};
    
    public static int getLogin(){
        return loggedIn;
    }
    public static String getUser(){
        return users[loggedIn];
    }
    public abstract boolean setLogin(String id);
    public abstract boolean setLogin(int id);
    
    
}
