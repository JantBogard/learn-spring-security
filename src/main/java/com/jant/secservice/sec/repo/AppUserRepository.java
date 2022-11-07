package com.jant.secservice.sec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jant.secservice.sec.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
