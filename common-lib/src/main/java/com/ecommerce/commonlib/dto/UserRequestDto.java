package com.ecommerce.commonlib.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class UserRequestDto {

    @NotEmpty(message = "Username cannot be empty.")
    @Pattern(regexp = "^[a-zA-Z0-9_]{3,16}$", message = "Username must be 3 to 16 characters long and can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_).")
    private String username;

    @NotEmpty(message = "Email address cannot be empty.")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Please enter a valid email address.")
    private String email;

    @NotEmpty(message = "Password cannot be empty.")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$", message = "Password must be 8 to 20 characters long and include at least one uppercase letter, one lowercase letter, one number, and one special character (@$!%*?&).")
    private String password;

    @NotEmpty(message = "First name cannot be empty.")
    @Pattern(regexp = "^[A-Za-z]{2,50}$", message = "First name must contain only letters (a-z, A-Z) and be between 2 and 50 characters long.")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty.")
    @Pattern(regexp = "^[A-Za-z]{2,50}$", message = "Last name must contain only letters (a-z, A-Z) and be between 2 and 50 characters long.")
    private String lastName;

    private boolean isActive;

    public UserRequestDto() {
    }

    public UserRequestDto(String email, String username, String firstName, String lastName, boolean isActive) {
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
