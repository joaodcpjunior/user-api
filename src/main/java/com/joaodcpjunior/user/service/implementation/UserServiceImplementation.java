package com.joaodcpjunior.user.service.implementation;

import com.joaodcpjunior.user.model.User;
import com.joaodcpjunior.user.repository.UserRepository;
import com.joaodcpjunior.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        log.info("Saving new user: {}", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Collection<User> list() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        log.info("Fetching user by id: {}", id);
        return userRepository.getById(id);
    }

    @Override
    public User update(User user) {
        log.info("Updating user: {}", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deliting user by id : {}", id);
        userRepository.deleteById(id);
        return TRUE;
    }
}
