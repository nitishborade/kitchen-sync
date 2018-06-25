package com.iskcon.kitchensync.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iskcon.kitchensync.util.DevoteeType;

@Document(collection = "devotee")
public class Devotee {
    @Id
    private String id;

    private String name;

    private String email;
    
    private DevoteeType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DevoteeType getType() {
        return type;
    }

    public void setType(DevoteeType type) {
        this.type = type;
    }

}
