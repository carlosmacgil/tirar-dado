package net.ausiasmarch.control.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.ausiasmarch.control.model.Dado;


@CrossOrigin(origins = "*")  // Permitir solicitudes desde cualquier origen
@RestController
@RequestMapping("/api")
public class tirardado {

    @PostMapping("/tirardado")
    public ResponseEntity<Integer> dado() {
        // Crear una instancia de Dado y obtener un número aleatorio
        int resultado = new Dado().getDado();

        // Retornar el número aleatorio con una respuesta HTTP 200
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
