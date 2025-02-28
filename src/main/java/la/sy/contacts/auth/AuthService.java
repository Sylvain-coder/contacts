package la.sy.contacts.auth;


import la.sy.contacts.utilisateurs.Role;
import la.sy.contacts.utilisateurs.Utilisateur;
import la.sy.contacts.utilisateurs.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager manager;
    private final AuthMapper mapper;
    private final UtilisateurRepository repository;
    private final PasswordEncoder encoder;

    public AuthResponse login(Credentials credentials) {
        Authentication auth = manager.authenticate(new UsernamePasswordAuthenticationToken(credentials.email(),credentials.password(), List.of()));
        if (auth.isAuthenticated()) {
            Utilisateur principal = (Utilisateur) auth.getPrincipal();
            return mapper.toResponse(principal);
        }
        throw new SecurityException("Invalid Credentials");
    }

    public void register(RegisterDto user) {
        repository.save(
                mapper.toUser(
                        user.setPassword(encoder.encode(user.getPassword()))
                ).setRole(Role.PUBLIC)
        );
    }
}
