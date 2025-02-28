package la.sy.contacts.contacts;

import la.sy.contacts.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacts")
public class ContactController extends GenericController<ContactDto, ContactService> {
    public ContactController(ContactService service) {
        super(service);
    }
}
