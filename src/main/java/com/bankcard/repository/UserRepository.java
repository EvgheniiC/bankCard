package com.bankcard.repository;

import com.bankcard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * findByLogin - find user by login.
     *
     * @param login - user login.
     * @return - return user.
     */
    User findByLogin(String login);

}