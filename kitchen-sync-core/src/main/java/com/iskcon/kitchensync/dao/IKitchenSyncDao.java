package com.iskcon.kitchensync.dao;

import java.util.List;

import com.iskcon.kitchensync.model.Devotee;

public interface IKitchenSyncDao {
    List<Devotee> getAllDevotees();
    
    void save(Devotee devotee);
}
