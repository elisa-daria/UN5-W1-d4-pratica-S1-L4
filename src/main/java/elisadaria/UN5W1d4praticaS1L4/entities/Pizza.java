package elisadaria.UN5W1d4praticaS1L4.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza extends MenuElement{
    private String name;
    private double price;
    private double kiloCal;
    private List<Topping>toppings;
}
