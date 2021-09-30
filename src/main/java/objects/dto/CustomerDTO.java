package objects.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import objects.models.Name;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    int customerId;

    Name customerName;
}
