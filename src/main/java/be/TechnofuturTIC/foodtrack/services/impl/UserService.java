package be.TechnofuturTIC.foodtrack.services.impl;

import be.TechnofuturTIC.foodtrack.repositories.UserRepository;
import be.TechnofuturTIC.foodtrack.services.UserServiceInterface;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserServiceInterface {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return (UserDetails) repository.findByUsername(s);
    }
}