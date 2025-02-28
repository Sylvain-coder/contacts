package la.sy.contacts.utilisateurs;

import la.sy.contacts.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UtilisateurMapper extends GenericMapper<UtilisateurDto,Utilisateur> {
}
