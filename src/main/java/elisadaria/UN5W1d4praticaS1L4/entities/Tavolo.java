package elisadaria.UN5W1d4praticaS1L4.entities;

import elisadaria.UN5W1d4praticaS1L4.enums.StateOfTavolo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tavolo {
    private int numero;
    private double coperto;
    private int maxCoperti;
    private StateOfTavolo statoTavolo;

    public Tavolo(double coperto) {
        this.coperto = coperto;
    }
}
