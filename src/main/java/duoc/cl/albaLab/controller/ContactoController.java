package duoc.cl.albaLab.controller;

import duoc.cl.albaLab.model.Contacto;
import duoc.cl.albaLab.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    @Autowired
    private ContactoService service;

    @GetMapping
    public ResponseEntity<List<Contacto>> listar() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacto> buscarPorId(@PathVariable Long id) {
        Contacto contacto = service.obtenerPorId(id);
        if (contacto != null) {
            return ResponseEntity.ok(contacto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Contacto> crear(@RequestBody Contacto contacto) {
        Contacto nuevo = service.guardar(contacto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contacto> actualizar(@PathVariable Long id, @RequestBody Contacto contacto) {
        Contacto actualizado = service.actualizar(id, contacto);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = service.eliminar(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
