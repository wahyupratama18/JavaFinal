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
    
    /**
     *
     * @return
     */
    public int getCurrentUser(){
        return super.loggedIn;
    }
    
    /**
     *
     * @param input
     * @return
     */
    @Override
    public boolean setLogin(String input){
        try{
            int loggedIn = Integer.parseInt(input);
            return this.setLogin(loggedIn);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hanya dapat menerima masukan angka");
            return false;
        }
    }
    
    /**
     *
     * @param input
     * @return
     */
    @Override
    public boolean setLogin(int input){
        try{
            --input;
            String tryLogin = users[input];
            loggedIn = input;
            return true;
        } catch(NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Anda memasukkan ID negatif");
            return false;
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "ID Karyawan yang dimasukkan tidak tersedia");
            return false;
        } 
    }
}
