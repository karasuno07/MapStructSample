package objects.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
public class Order {

    Customer customer;

    Address billingAddress;

}
