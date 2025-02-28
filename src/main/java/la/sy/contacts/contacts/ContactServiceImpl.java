package la.sy.contacts.contacts;

import la.sy.contacts.generic.GenericServiceImpl;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@ToString
public class ContactServiceImpl extends GenericServiceImpl<
        Contact,
        ContactDto,
        ContactRepository,
        ContactMapper
        > implements ContactService {
    public ContactServiceImpl(ContactRepository repository, ContactMapper mapper) {
        super(repository, mapper);
    }
}
