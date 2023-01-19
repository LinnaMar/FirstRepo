package APIs;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Order {

    private int id;
    private int petId;
    private String shipDate;
    private int quantity;
    private String status;
    private boolean complete;


}

