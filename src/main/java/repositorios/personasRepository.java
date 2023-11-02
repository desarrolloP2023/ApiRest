package repositorios;

import modelos.personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personasRepository extends JpaRepository<personas,Integer>{
}
