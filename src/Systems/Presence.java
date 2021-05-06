/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systems;

/**
 *
 * @author User
 */
public interface Presence {

    /**
     * by Users
     */
    String[][] presensi = new String[4][4];
    
    void presenceMasuk(int id);
    void presencePulang(int id);
    String getMasuk(int id);
    String getRemarksMasuk(int id);
    String getPulang(int id);
    String getRemarksPulang(int id);
}
