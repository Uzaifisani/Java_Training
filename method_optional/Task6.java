package method_optional;

import java.util.Optional;

public class Task6 {
    public static Optional<String> validateEmail(String email) {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            return Optional.of("Invalid email format");
        }
        return Optional.empty(); 
    }

    public static void main(String[] args) {
        String email = "test@domain.com";
        Optional<String> result = validateEmail(email);

        result.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Email is valid")
        );
    }
}
