/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class Presensi implements Presence {

    /**
     * Set Presence Time
     * @param id
     */
    @Override
    public void presenceMasuk(int id){
        Date time = Calendar.getInstance().getTime();
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        presensi[id][0] = format.format(time);
        presensi[id][1] = (time.getHours() < 7 ? "Tepat waktu" : "Terlambat");
    }

    /**
     * Set Home Time
     * @param id
     */
    @Override
    public void presencePulang(int id){
        Date time = Calendar.getInstance().getTime();
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        presensi[id][2] = format.format(time);
        presensi[id][3] = (time.getHours() > 7 && time.getHours() < 16 ? "Pulang cepat" : "On Schedule");
    }
    
    /**
     * Get Presence Time
     * @param id
     * @return
     */
    @Override
    public String getMasuk(int id){
        return presensi[id][0];
    }

    /**
     * Get Remarks Presence
     * @param id
     * @return
     */
    @Override
    public String getRemarksMasuk(int id){
        return presensi[id][1];
    }

    /**
     * Get Home Time
     * @param id
     * @return
     */
    @Override
    public String getPulang(int id){
        return presensi[id][2];
    }
    
    /**
     * Get Remarks Home
     * @param id
     * @return string
     */
    @Override
    public String getRemarksPulang(int id){
        return presensi[id][3];
    }
}
