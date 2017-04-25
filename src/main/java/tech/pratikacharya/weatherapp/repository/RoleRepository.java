package tech.pratikacharya.weatherapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.pratikacharya.weatherapp.domain.Role;

/**
 * Created by Pratik Acharya on 4/25/2017.
 */
public interface RoleRepository extends MongoRepository<Role,String>{
}
