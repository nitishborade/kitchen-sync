package com.iskcon.kitchensync.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.iskcon.kitchensync.dao.IKitchenSyncDao;

public class KitchenSyncLookUp {

    private static KitchenSyncLookUp instance;
    private static ClassPathXmlApplicationContext applicationContext = null;
    public static final String KITCHEN_SYNC_DAO = "kitchenSyncDAO";
    public static final String CONFIG_FILE = "kitchen-sync-core-config.xml";

    private String[] springPath = new String[] { CONFIG_FILE };

    private KitchenSyncLookUp() {
        initialize();
    }

    private void initialize() {
        try {
            applicationContext = new ClassPathXmlApplicationContext(springPath);
            applicationContext.start();
            return;
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static final synchronized KitchenSyncLookUp getInstance() {
        if (instance == null) {
            instance = new KitchenSyncLookUp();
        }
        return instance;
    }

    public <T> T getBean(String name, Class<T> clazz) {
        try {
            return applicationContext.getBean(name, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public IKitchenSyncDao getKitchenSyncDao() {
        try {
            return getBean(KITCHEN_SYNC_DAO, IKitchenSyncDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
