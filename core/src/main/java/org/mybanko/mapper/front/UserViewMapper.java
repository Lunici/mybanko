package org.mybanko.mapper.front;

import org.mapstruct.Mapper;
import org.mybanko.model.User.User;
import org.mybanko.model.User.UserView;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserViewMapper {
    UserView toView(User user);

    User toDomain(UserView userView);
}
