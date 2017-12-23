package com.csalgorithms.web.bootstrap;

import com.csalgorithms.web.model.User;
import com.csalgorithms.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    // Repositories
    private UserRepository userRepository;

    @Autowired
    public DevBootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initUsers();
    }

    /**
     * Initialize users
     */
    private void initUsers() {
        User joe = new User("Joe", "Smith");
        joe.setUsername("joe");
        joe.setPassword("12345");
        userRepository.save(joe);

        User james = new User("James", "Smith");
        james.setUsername("james");
        james.setPassword("12345");
        userRepository.save(james);
    }
}
