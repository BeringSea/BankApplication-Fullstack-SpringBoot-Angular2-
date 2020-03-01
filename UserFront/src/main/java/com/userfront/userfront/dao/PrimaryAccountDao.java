package com.userfront.userfront.dao;

import com.userfront.userfront.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 3/14/19.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}
