package la.sy.contacts.utilisateurs;

import jakarta.persistence.*;
import la.sy.contacts.contacts.Contact;
import la.sy.contacts.generic.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Utilisateur extends BaseEntity {

    @Column(nullable = false)
    private String pseudo;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role = Role.PUBLIC;

    @ManyToMany
    private List<Contact> contacts;
}
