package com.wflqz.dao;

import com.wflqz.model.SysFunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysFuncDao extends JpaRepository<SysFunc, String> {
}
