package be.TechnofuturTIC.foodtrack.util;

import be.TechnofuturTIC.foodtrack.model.entities.User;
import be.TechnofuturTIC.foodtrack.repositories.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseFiller implements InitializingBean {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder;

    public DatabaseFiller(UserRepository userRepository, BCryptPasswordEncoder encoder) {
        this.repository = userRepository;
        this.encoder = encoder;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        List<User> users = List.of(
                new User(),
                new User()
        );

        repository.saveAll(users);
    }
}
