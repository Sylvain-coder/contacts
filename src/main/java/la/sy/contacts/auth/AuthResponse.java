package la.sy.contacts.auth;

import la.sy.contacts.generic.BaseDto;
import la.sy.contacts.utilisateurs.Role;
import la.sy.contacts.utilisateurs.UtilisateurDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class AuthResponse {
    private UtilisateurDto user;
    private String token;

    @Value
    public static class UtilisateurDto extends BaseDto {
        String pseudo;
        String email;
        Role role;
    }
}
