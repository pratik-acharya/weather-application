package tech.pratikacharya.weatherapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.pratikacharya.weatherapp.domain.User;

/**
 * Created by Pratik Acharya on 4/25/2017.
 */
public interface UserRepository extends MongoRepository<User,String> {
    public User findByUsername(String username);
}
