package com.niyonsaba.expensetrackerapi.services;

import com.niyonsaba.expensetrackerapi.domain.User;
import com.niyonsaba.expensetrackerapi.domain.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
