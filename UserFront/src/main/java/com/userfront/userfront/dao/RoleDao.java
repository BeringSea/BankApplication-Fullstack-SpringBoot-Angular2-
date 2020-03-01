package com.userfront.userfront.dao;

import com.userfront.userfront.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 3/6/19.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}
