package la.sy.contacts.utilisateurs;

import la.sy.contacts.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController extends GenericController<UtilisateurDto,UtilisateurService> {
    public UtilisateurController(UtilisateurService service) {
        super(service);
    }
}
