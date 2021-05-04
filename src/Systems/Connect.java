/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systems;

import Systems.User;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Connect extends User {
    
    @Override
    public int getLogin(){
        return loggedIn;
    }
    
    @Override
    public boolean setLogin(int id){
        if (users.length < id){
            JOptionPane.showMessageDialog(null, "Karyawan tidak tersedia");
            return false;
        }
        loggedIn = --id;
        return true;
    }
}
