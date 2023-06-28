package org.mybanko.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    public UserDto findUserById(int id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return userMapper.toUserDto(userEntity);
    }
}
