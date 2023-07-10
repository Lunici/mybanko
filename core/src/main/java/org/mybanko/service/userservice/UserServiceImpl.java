package org.mybanko.service.userservice;

import org.mybanko.mapper.front.UserViewMapper;
import org.mybanko.model.User.User;
import org.mybanko.model.User.UserEntity;
import org.mybanko.mapper.database.UserEntityMapper;
import org.mybanko.repository.UserRepository;
import org.mybanko.model.User.UserView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserEntityMapper userEntityMapper;
    @Autowired
    UserViewMapper userViewMapper;

    @Override
    public UserView getUserView(int userId) {
        // search the user in DB
        Optional<UserEntity> userFound = userRepository.findById(userId);

        // if user not found, return null
        if (userFound.isEmpty()) {
            return null;
        }

        // get user entity
        UserEntity userEntity = userFound.get();

        // entity to domain
        User user = userEntityMapper.toDomain(userEntity);

        // do things

        // domain to view
        UserView userView = userViewMapper.toView(user);

        return userView;
    }
}
