package controladores;

import modelos.personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicios.personas.personaServiceImpl;

@RestController
@RequestMapping("api/people")
public class controladorUsuarios {
@Autowired
private personaServiceImpl personaService;

@PostMapping
@RequestMapping("/savePeople")
public personas savePeople(@RequestBody personas personas){
    return personaService.savePersona(personas);
}

}
