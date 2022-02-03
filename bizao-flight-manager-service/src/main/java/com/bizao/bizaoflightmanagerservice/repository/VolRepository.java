package com.bizao.bizaoflightmanagerservice.repository;
import com.bizao.bizaoflightmanagerservice.model.Vol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol, String>{
}
