package elisadaria.UN5W1d4praticaS1L4.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Topping extends MenuElement {
    private String name;
    private double price;
    private double kiloCal;
}
