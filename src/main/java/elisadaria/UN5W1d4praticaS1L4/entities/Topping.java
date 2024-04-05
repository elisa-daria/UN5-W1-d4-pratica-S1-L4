package elisadaria.UN5W1d4praticaS1L4.entities;

import jakarta.persistence.*;
import lombok.*;

//@Entity
//@Table(name = "toppings")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Topping extends MenuElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private double price;
    private double kiloCal;

    public Topping(String name, double price, double kiloCal) {
        super();
        this.name = name;
        this.price = price;
        this.kiloCal = kiloCal;
    }
}
