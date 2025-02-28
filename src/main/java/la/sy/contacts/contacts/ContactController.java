package la.sy.contacts.contacts;

import la.sy.contacts.generic.GenericController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacts")
public class ContactController extends GenericController<ContactDto, ContactService> {
    public ContactController(ContactService service) {
        super(service);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @Override
    public ResponseEntity<Page<ContactDto>> findAll(Pageable pageable) {
        return super.findAll(pageable);
    }

    @PreAuthorize("isAuthenticated()")
    @Override
    public ResponseEntity<ContactDto> getById(long id) {
        return super.getById(id);
    }

    @PreAuthorize("isAuthenticated()")
    @Override
    public ResponseEntity<ContactDto> saveOrUpdate(ContactDto dto) {
        return super.saveOrUpdate(dto);
    }

    @PreAuthorize("isAuthenticated()")
    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }
}
