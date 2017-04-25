package tech.pratikacharya.weatherapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Pratik Acharya on 4/25/2017.
 */
@Document(collection = "favorites")
public class Favorite {
    @Id
    private String  id;
    private User user;
    private String address;
    private String placeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Favorite{");
        sb.append("id='").append(id).append('\'');
        sb.append(", user=").append(user);
        sb.append(", address='").append(address).append('\'');
        sb.append(", placeId='").append(placeId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
