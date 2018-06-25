package com.iskcon.kitchensync.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;

import com.iskcon.kitchensync.model.Devotee;

public class KitchenSyncDaoImpl implements IKitchenSyncDao {
    
    private MongoOperations mongo;
    
    public KitchenSyncDaoImpl(MongoOperations mongo) {
        this.mongo = mongo;
    }
    
    public List<Devotee> getAllDevotees() {
        List<Devotee> devotees = mongo.findAll(Devotee.class);
        return devotees;
    }
    
    public void save(Devotee devotee) {
        mongo.save(devotee);
    }

}
