package com.wflqz.dao;

import com.wflqz.model.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDao extends JpaRepository<SysRole, String> {
}
