package tech.pratikacharya.weatherapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Pratik Acharya on 4/25/2017.
 */
public class Role {
    @Id
    private String id;

    private RoleType name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoleType getName() {
        return name;
    }

    public void setName(RoleType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Role{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
