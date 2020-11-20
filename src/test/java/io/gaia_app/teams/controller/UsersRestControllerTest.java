package io.gaia_app.teams.controller;

import io.gaia_app.teams.User;
import io.gaia_app.teams.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UsersRestControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UsersRestController usersRestController;

    @Test
    void users_shouldReturnAllTeams() {
        usersRestController.users();

        verify(userService).findAll();
    }

    @Test
    void saveUser_shouldSaveTheUser() {
        var john = new User("john", null);
        usersRestController.saveUser(john);

        verify(userService).update(john);
    }
}
