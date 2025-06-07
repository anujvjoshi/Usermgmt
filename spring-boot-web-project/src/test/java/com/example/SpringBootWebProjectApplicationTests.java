import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.controller.LoginController;
import com.example.service.LoginService;
import com.example.model.User;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootWebProjectApplicationTests {

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginController loginController;

    @Test
    void contextLoads() {
    }

    @Test
    void testValidUserLogin() {
        User user = new User("user1", "password");
        ResponseEntity<String> response = loginController.loginUser(user.getUsername(), user.getPassword());
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).isEqualTo("Login successful");
    }

    @Test
    void testInvalidUserLogin() {
        User user = new User("user3", "password");
        ResponseEntity<String> response = loginController.loginUser(user.getUsername(), user.getPassword());
        assertThat(response.getStatusCodeValue()).isEqualTo(401);
        assertThat(response.getBody()).isEqualTo("Invalid credentials");
    }
}