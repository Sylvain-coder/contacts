package la.sy.contacts.contacts;

import la.sy.contacts.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface ContactMapper extends GenericMapper<ContactDto,Contact> {
}
