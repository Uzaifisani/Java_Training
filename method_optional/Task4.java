package method_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User {
    String email;
    String name;

    User(String email, String name) {
        this.email = email;
        this.name = name;
    }
}

class UserService {
    static List<User> users = Arrays.asList(
        new User("john@example.com", "John"),
        new User("jane@example.com", "Jane")
    );

    public static Optional<User> getUserByEmail(String email) {
        return users.stream()
                    .filter(u -> u.email.equalsIgnoreCase(email))
                    .findFirst();
    }
}
public class Task4 {
    public static void main(String[] args) {
        String inputEmail = "john@example.com";

        Optional<User> userOpt = UserService.getUserByEmail(inputEmail);
        userOpt.ifPresentOrElse(
            user -> System.out.println("User found: " + user.name),
            () -> System.out.println("User not found")
        );
    }
}
