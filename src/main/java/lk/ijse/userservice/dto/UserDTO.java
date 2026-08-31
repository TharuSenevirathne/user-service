package lk.ijse.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    @NotBlank(message = "Username is required !!")
    private String username;

    @NotBlank(message = "Email is required !!")
    @Email
    private String email;

    @NotBlank(message = "Password is required !!")
    private String password;
}
