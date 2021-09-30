package objects.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
public class OrderDTO {

    CustomerDTO customer;

    String customerFirstName;

    String customerLastName;

    String street;

    String city;
}
