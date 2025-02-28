package la.sy.contacts.auth;

import la.sy.contacts.utilisateurs.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(/*uses = {UtilisateurMapper.class}*/)
public interface AuthMapper {

    @Mapping(source = ".", target = "user")
    @Mapping(target = "token", expression = "java(la.sy.contacts.tools.JwtUtils.generateToken(user))")
    AuthResponse toResponse(Utilisateur user);

    Utilisateur toUser(RegisterDto dto);
}
