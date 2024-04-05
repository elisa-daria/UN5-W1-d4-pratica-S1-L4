package elisadaria.UN5W1d4praticaS1L4.entities;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//attenzione!
@ToString
public class Menu {
    private List <Pizza> pizzas;
    private List <Drink> drinks;
    private List <Topping> toppings;
    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinks.forEach(System.out::println);
        System.out.println();

    }

}
