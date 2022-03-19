package com.example.library.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class JpaAuditingConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
       var  username= SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
       return Optional.of(username);
    }
}
