package objects.mappers;

import objects.dto.CustomerDTO;
import objects.entities.Customer;
import objects.models.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = Name.class)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(target = "customerId", source = "id"),
            @Mapping(target = "customerName", source = "name"),
    })
    CustomerDTO customerToCustomerDTO(Customer customer);
}
