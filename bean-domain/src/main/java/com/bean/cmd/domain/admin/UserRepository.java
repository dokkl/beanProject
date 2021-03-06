package com.bean.cmd.domain.admin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by hoon on 2016-01-18.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findByNick(String nick);
}
