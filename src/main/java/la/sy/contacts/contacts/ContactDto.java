package la.sy.contacts.contacts;

import la.sy.contacts.generic.BaseDto;
import la.sy.contacts.utilisateurs.Utilisateur;
import lombok.Data;
import lombok.Value;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link Contact}
 */
@Value
public class ContactDto extends BaseDto implements Serializable {
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
