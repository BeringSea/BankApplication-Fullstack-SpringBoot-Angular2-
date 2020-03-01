package com.userfront.userfront.service;

import com.userfront.userfront.domain.User;
import com.userfront.userfront.domain.security.UserRole;

import java.util.List;
import java.util.Set;

/**
 * @author David Mojicevic on 2/25/19.
 */
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    User saveUser (User user);

    User createUser(User user, Set<UserRole> userRoles);

    List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);
}
