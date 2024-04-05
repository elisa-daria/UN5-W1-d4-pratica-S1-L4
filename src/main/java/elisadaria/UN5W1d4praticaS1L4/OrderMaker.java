package elisadaria.UN5W1d4praticaS1L4;

import elisadaria.UN5W1d4praticaS1L4.entities.MenuElement;
import elisadaria.UN5W1d4praticaS1L4.entities.Ordine;
import elisadaria.UN5W1d4praticaS1L4.entities.Tavolo;
import elisadaria.UN5W1d4praticaS1L4.enums.StateOfOrdine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class OrderMaker implements CommandLineRunner {
    public double calculateImportoTotale(List<MenuElement> orderedItems) {
        return orderedItems.stream()
                .mapToDouble(MenuElement::getPrice)
                .sum();
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("HEllo World from the runner");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Un5W1D4PraticaS1L4Application.class);
        Ordine orderI=new Ordine();
        Random rdm=new Random();
        Tavolo tI= (Tavolo) context.getBean("tavoloI");
        List <MenuElement>orderedItems=new ArrayList<>();
        orderedItems.add((MenuElement) context.getBean("margherita"));
        orderedItems.add((MenuElement) context.getBean("margherita"));
        orderedItems.add((MenuElement) context.getBean("diavola"));
        orderedItems.add((MenuElement) context.getBean("pepsi"));
        orderedItems.add((MenuElement) context.getBean("radler"));
        orderedItems.add((MenuElement) context.getBean("bici"));
        orderI.setNOrdine(rdm.nextInt(1,1125));
        orderI.setTavolo(tI);
        orderI.setNCoperti(3);
        orderI.setOraAcquisizione("13:00");
        orderI.setStatoOrdine(StateOfOrdine.SERVITO);
        orderI.setItems(orderedItems);
        double importoTot=orderedItems.stream().mapToDouble(item -> item.getPrice()).sum();
        orderI.setImportoTotale(importoTot);
        System.out.println("DETTAGIO ORDINE "+orderI.getNOrdine());
        System.out.println("AL TAVOLO "+tI.getNumero());
        System.out.println(orderI);

    }
}
