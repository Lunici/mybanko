package org.mybanko.mapper.database;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mybanko.model.User.User;
import org.mybanko.model.User.UserEntity;
import org.mybanko.model.User.UserView;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserEntityMapper {
    User toDomain(UserEntity user);

    UserEntity toEntity(User user);
}
