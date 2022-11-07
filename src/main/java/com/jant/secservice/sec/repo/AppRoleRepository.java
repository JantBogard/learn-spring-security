package com.jant.secservice.sec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jant.secservice.sec.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String rolename);
}
