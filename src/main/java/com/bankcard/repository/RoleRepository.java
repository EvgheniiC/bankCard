package com.bankcard.repository;

import com.bankcard.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    /**
     * findByNmae - finds role by name.
     *
     * @param name - role name.
     * @return - returns role.
     */
    Role findByName(String name);

}