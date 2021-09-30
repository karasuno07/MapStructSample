package objects.mappers;

import objects.dto.OrderDTO;
import objects.entities.Customer;
import objects.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = Customer.class)
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

//    @Mappings({
//            @Mapping(target = "customer",
//                    source = "customer"),
//            @Mapping(target = "street",
//                    source = "billingAddress.street"),
//            @Mapping(target = "city",
//                    source = "billingAddress.city")
//    })

    @Mappings({
            @Mapping(target = "customerFirstName",
                    source = "customer.name.firstName"),
            @Mapping(target = "customerLastName",
                    source = "customer.name.lastName"),
            @Mapping(target = "street",
                    source = "billingAddress.street"),
            @Mapping(target = "city",
                    source = "billingAddress.city")
    })
    OrderDTO orderToOrderDto(Order order);

//    @Mappings({
//            @Mapping(target = "billingAddress", source = "city"),
//            @Mapping(target = "customer", source = "customerFirstName")
//    })
//    Order OrderDtoToOrder(OrderDTO dto);

}
