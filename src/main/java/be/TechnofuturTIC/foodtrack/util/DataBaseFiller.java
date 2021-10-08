package be.TechnofuturTIC.foodtrack.util;

import be.TechnofuturTIC.foodtrack.models.entities.User;
import be.TechnofuturTIC.foodtrack.repositories.RoleRepository;
import be.TechnofuturTIC.foodtrack.repositories.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataBaseFiller implements InitializingBean {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;

    public DataBaseFiller(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.encoder = encoder;
    }


    @Override
    public void afterPropertiesSet() throws Exception{
        User toInsert = new User("admin2", encoder.encode("pass"));
        toInsert.getRoles().add(roleRepository.getById(1L));

        userRepository.save(toInsert);
    }
}
