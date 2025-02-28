package la.sy.contacts.utilisateurs;

import la.sy.contacts.generic.GenericServiceImpl;
import lombok.ToString;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@ToString
public class UtilisateurServiceImpl extends GenericServiceImpl<
        Utilisateur,
        UtilisateurDto,
        UtilisateurRepository,
        UtilisateurMapper
        > implements UtilisateurService, UserDetailsService {
    public UtilisateurServiceImpl(UtilisateurRepository repository, UtilisateurMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Can't find user :" + email));
    }
}
