package org.mybanko.service.userservice;

import org.mybanko.model.User.UserView;

public interface UserService {
    UserView getUserView(int id);
}
