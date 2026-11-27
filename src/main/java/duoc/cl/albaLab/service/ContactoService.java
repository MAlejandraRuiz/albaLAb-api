package duoc.cl.albaLab.service;

import duoc.cl.albaLab.model.Contacto;
import duoc.cl.albaLab.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository repository;

    public List<Contacto> obtenerTodos() {
        return repository.findAll();
    }

    public Contacto obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Contacto guardar(Contacto contacto) {
        return repository.save(contacto);
    }

    public Contacto actualizar(Long id, Contacto datos) {
        return repository.findById(id).map(existente -> {
            existente.setNombre(datos.getNombre());
            existente.setEmail(datos.getEmail());
            existente.setTelefono(datos.getTelefono());
            existente.setAsunto(datos.getAsunto());
            existente.setMensaje(datos.getMensaje());
            existente.setEstado(datos.getEstado());
            return repository.save(existente);
        }).orElse(null);
    }

    public boolean eliminar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
