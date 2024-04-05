package elisadaria.UN5W1d4praticaS1L4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name="pizzas")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza extends MenuElement{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private double price;
    private double kiloCal;
    private List<Topping>toppings;

    public Pizza(String margherita, double v, int i, List<Topping> margheritaToppings) {
        super();
    }
}
