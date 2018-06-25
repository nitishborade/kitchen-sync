package com.iskcon.kitchensync.core;

import com.iskcon.kitchensync.config.KitchenSyncLookUp;
import com.iskcon.kitchensync.dao.IKitchenSyncDao;
import com.iskcon.kitchensync.model.Devotee;
import com.iskcon.kitchensync.util.DevoteeType;

public class KitchenSyncApp {

    public static void main(String[] args) {
        
        try {
            IKitchenSyncDao dao = KitchenSyncLookUp.getInstance().getKitchenSyncDao();
            
            Devotee d = new Devotee();
            d.setName("Toshan1");
            d.setEmail("toshan1@gmail.com");
            d.setType(DevoteeType.RESIDENT);
            
            dao.save(d);
            
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
            e.printStackTrace(); 
        }
    }

}
