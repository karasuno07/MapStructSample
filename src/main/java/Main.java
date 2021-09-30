import objects.dto.OrderDTO;
import objects.entities.Address;
import objects.entities.Customer;
import objects.entities.Order;
import objects.mappers.OrderMapper;
import objects.models.Name;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, new Name("John", "Doe"));
        Address address = new Address(1, "Street", "City");
        Order order = new Order(customer, address);

        System.out.println(order);

        OrderDTO dto = OrderMapper.INSTANCE.orderToOrderDto(order);

        System.out.println(dto);

    }
}
