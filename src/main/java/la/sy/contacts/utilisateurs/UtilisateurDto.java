package la.sy.contacts.utilisateurs;


import la.sy.contacts.contacts.Adresse;
import la.sy.contacts.contacts.ContactDto;
import la.sy.contacts.generic.BaseDto;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Utilisateur}
 */
@Value
public class UtilisateurDto extends BaseDto implements Serializable {
    String pseudo;
    String email;
    String password;
    Role role;
    List<ContactDto> contacts;

    /**
     * DTO for {@link la.sy.contacts.contacts.Contact}
     */
    @Value
    public static class ContactDto implements Serializable {
        long id;
        String nom;
        String numero;
        AdresseDto adresse;

        /**
         * DTO for {@link Adresse}
         */
        @Value
        public static class AdresseDto implements Serializable {
            String ville;
            String cp;
        }
    }
}
