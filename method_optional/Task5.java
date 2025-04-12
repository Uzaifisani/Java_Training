package method_optional;

import java.util.Optional;

enum Role {
    ADMIN, USER, GUEST
}

public class Task5 {
    public static Optional<Role> parseRole(String input) {
        try {
            return Optional.of(Role.valueOf(input.toUpperCase()));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        String input = "admin";
        Optional<Role> role = parseRole(input);

        role.ifPresentOrElse(
            r -> System.out.println("Parsed Role: " + r),
            () -> System.out.println("Invalid role")
        );
    }
}

