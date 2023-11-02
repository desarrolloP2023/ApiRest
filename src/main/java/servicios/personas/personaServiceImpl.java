package servicios.personas;

import modelos.personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorios.personasRepository;

@Service
public class personaServiceImpl implements personaService {
@Autowired
private personasRepository personaRepository;
    @Override
    public personas savePersona(personas personas) {
        return personaRepository.save(personas);
    }
}
