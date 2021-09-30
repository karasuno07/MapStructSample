package objects.entities;

import lombok.*;
import objects.models.Name;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
public class Customer {

    int id;

    Name name;
}
