package elisadaria.UN5W1d4praticaS1L4;

import elisadaria.UN5W1d4praticaS1L4.entities.*;
import elisadaria.UN5W1d4praticaS1L4.enums.StateOfTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {
    @Bean
    public Topping mozzarella(){
        return new Topping("mozzarella",1.8,100);
    }
    @Bean
    public Topping prosciutto() {
        return new Topping("prosciutto", 1.5, 150);
    }
    @Bean
    public Topping pomodoro() {
        return new Topping("pomodoro", 1.3, 130);
    }
    @Bean
    public Topping salamino(){
        return new Topping("salaminio",2,250);
    }
    @Bean
    public Topping olive(){
        return new Topping("olive",0.8,220);
    }
    @Bean
    public Topping funghi(){
        return new Topping("funghi",0.6,80);
    }
    @Bean
    public Drink pepsi(){
        return new Drink("Pepsi",3,500);
    }
    @Bean
    public Drink radler(){
        return new Drink("Radler",4.5,400);
    }
    @Bean
    public Drink bici(){
        return  new Drink("Bici",5,600);
    }
    @Bean
    public Pizza margherita(){
        List<Topping>margherita_toppings=new ArrayList<>();
        margherita_toppings.add(mozzarella());
        margherita_toppings.add(pomodoro());
        return new Pizza("margherita",6.50,1000, margherita_toppings);
    }
    @Bean
    public Pizza diavola(){
        List<Topping>diavola_toppings=new ArrayList<>();
        diavola_toppings.add(salamino());
        diavola_toppings.add(olive());
        diavola_toppings.add(mozzarella());
        return new Pizza("diavola",7.50,1200, diavola_toppings);
    }
    @Bean
    public Pizza myFlavour(){
        List<Topping>my_flavour_toppings=new ArrayList<>();
        my_flavour_toppings.add(funghi());
        my_flavour_toppings.add(prosciutto());
        my_flavour_toppings.add(mozzarella());
        return new Pizza("my_flavour",7,1100, my_flavour_toppings);
    }


    @Bean
    public Menu menu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();
        pizzaList.add(diavola());
        pizzaList.add(margherita());
        pizzaList.add(myFlavour());
        drinkList.add(radler());
        drinkList.add(pepsi());
        drinkList.add(bici());
        toppingsList.add(prosciutto());
        toppingsList.add(pomodoro());
        toppingsList.add(mozzarella());
        toppingsList.add(funghi());
        toppingsList.add(olive());
        toppingsList.add(salamino());
        return new Menu(pizzaList,drinkList,toppingsList);
    }
    @Bean
    public Tavolo tavoloI(@Value("${coperto.price}") double coperto){
        return new Tavolo(1, coperto, 5, StateOfTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavoloII(@Value("${coperto.price}") double coperto){
        return new Tavolo(2, coperto, 3, StateOfTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavoloIII(@Value("${coperto.price}") double coperto){
        return new Tavolo(3, coperto, 6, StateOfTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavoloIV(@Value("${coperto.price}") double coperto){
        return new Tavolo(4, coperto, 10, StateOfTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavoloV(@Value("${coperto.price}") double coperto){
        return new Tavolo(5, coperto, 6, StateOfTavolo.LIBERO);
    }
}
