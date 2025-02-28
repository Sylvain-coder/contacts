package la.sy.contacts.utilisateurs;

import la.sy.contacts.generic.GenericServiceImpl;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@ToString
public class UtilisateurServiceImpl extends GenericServiceImpl<
        Utilisateur,
        UtilisateurDto,
        UtilisateurRepository,
        UtilisateurMapper
        > implements UtilisateurService {
    public UtilisateurServiceImpl(UtilisateurRepository repository, UtilisateurMapper mapper) {
        super(repository, mapper);
    }
}
