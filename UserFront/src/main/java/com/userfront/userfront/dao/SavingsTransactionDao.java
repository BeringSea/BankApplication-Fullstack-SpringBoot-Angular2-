package com.userfront.userfront.dao;

import com.userfront.userfront.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author David Mojicevic on 3/20/19.
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
