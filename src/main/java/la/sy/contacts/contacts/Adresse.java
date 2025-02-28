package la.sy.contacts.contacts;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Embeddable
public class Adresse {
    @Column(nullable = false)
    private String ville;
    @Column(nullable = false)
    private String cp;
}
