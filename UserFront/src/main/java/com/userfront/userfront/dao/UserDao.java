package com.userfront.userfront.dao;

import com.userfront.userfront.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author David Mojicevic on 2/25/19.
 */
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
