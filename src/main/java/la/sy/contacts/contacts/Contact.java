package la.sy.contacts.contacts;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import la.sy.contacts.generic.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Contact extends BaseEntity {

    @Column(nullable = false)
    private String nom;
    @Column(unique = true, nullable = false)
    private String numero;

    @Embedded
    private Adresse adresse;
}
