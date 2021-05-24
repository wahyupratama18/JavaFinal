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
public class Terlambat extends Late {

    /**
     *
     * @param id
     * @return late[id]
     */
    @Override
    public int getKeterlambatan(int id){
        return keterlambatan[id];
    }
    
}
