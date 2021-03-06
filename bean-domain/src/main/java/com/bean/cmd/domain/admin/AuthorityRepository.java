package com.bean.cmd.domain.admin;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hoon on 2016-01-30.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByAuthority(String authority);
}
