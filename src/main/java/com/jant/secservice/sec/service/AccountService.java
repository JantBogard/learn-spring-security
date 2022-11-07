package com.jant.secservice.sec.service;

import java.util.List;

import com.jant.secservice.sec.entities.AppRole;
import com.jant.secservice.sec.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
