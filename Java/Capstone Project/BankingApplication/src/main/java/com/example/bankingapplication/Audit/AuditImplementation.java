package com.example.bankingapplication.Audit;

import com.example.bankingapplication.Entity.Users;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.Optional;


public class AuditImplementation implements AuditorAware<Integer> {

    @Override
    public Optional<Integer> getCurrentAuditor() {

        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();


        //if this user is not authenticated or is anonymous then return null for audition entry
        if (authentication == null ||
                !authentication.isAuthenticated()
                || authentication instanceof AnonymousAuthenticationToken
        )
        {
            return Optional.empty();
        }


        Users userPrincipal = (Users) authentication.getPrincipal();



        return Optional.ofNullable(userPrincipal.getId());
    }

}
