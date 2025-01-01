package serenityswag.authentication.actions;

public enum User {

    STANDARD_USER("standard_user", "secret_sauce", "a standard user"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce", "a standard user"),
    PROBLEM_USER("problem_user", "secret_sauce", "a standard user"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user", "secret_sauce", "a standard user"),
    ERROR_USER("error_user", "secret_sauce", "a standard user"),
    VISUAL_USER("visual_user", "secret_sauce", "a standard user");

    private final String username;
    private final String password;
    private final String description;

    User(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

}
