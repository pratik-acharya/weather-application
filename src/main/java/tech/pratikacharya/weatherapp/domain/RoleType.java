package tech.pratikacharya.weatherapp.domain;

/**
 * Created by Pratik Acharya on 4/25/2017.
 */
public enum RoleType {
    USER("USER"),
    ADMIN("ADMIN");

    String role;
    private RoleType(String role){
        this.role =role;
    }

    public String getRole(){
        return  role;
    }
}
