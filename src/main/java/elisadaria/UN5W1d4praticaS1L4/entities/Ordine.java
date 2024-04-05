package elisadaria.UN5W1d4praticaS1L4.entities;

import elisadaria.UN5W1d4praticaS1L4.enums.StateOfOrdine;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ordine {
        private int nOrdine;
        private StateOfOrdine statoOrdine;
        private int nCoperti;
        private String oraAcquisizione;
        private double importoTotale;
        private Tavolo tavolo;
        private List<MenuElement>items;

    }

