package com.wflqz.dao;

import com.wflqz.model.SysDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDeptDao extends JpaRepository<SysDept, String> {

}
