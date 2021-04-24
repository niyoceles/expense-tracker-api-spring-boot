package com.niyonsaba.expensetrackerapi.repositories;

import com.niyonsaba.expensetrackerapi.domain.User;
import com.niyonsaba.expensetrackerapi.domain.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailPassword(String email, String password);
    Integer getCountByEmail(String email);
    User findById(Integer userId);
}
