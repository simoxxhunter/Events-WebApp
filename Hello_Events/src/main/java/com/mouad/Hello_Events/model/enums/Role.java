package com.mouad.Hello_Events.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,USER,DIRECTEUR;

    @Override
    public String getAuthority() {
        return "";
    }
}
