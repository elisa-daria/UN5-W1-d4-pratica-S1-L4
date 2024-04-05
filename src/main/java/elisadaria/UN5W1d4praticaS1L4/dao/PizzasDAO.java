package elisadaria.UN5W1d4praticaS1L4.dao;

import elisadaria.UN5W1d4praticaS1L4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzasDAO extends JpaRepository<Pizza,Long> {

}
