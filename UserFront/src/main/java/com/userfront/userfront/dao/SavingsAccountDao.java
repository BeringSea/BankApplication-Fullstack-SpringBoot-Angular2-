package com.userfront.userfront.dao;

import com.userfront.userfront.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 3/14/19.
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}
