package clientespotenciales.clientespotenciales.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class clientesControllers {
    @GetMapping("/Listado/agregar") 
    public String listadoAgregar() {
        return "/clientes_potenciales/agregar";
    }
    @GetMapping("/Listado/editar")
    public String listadoEditar() {
        return "/clientes_potenciales/editar";
    }
    @GetMapping("/Listado/eliminar")
    public String listadoEliminar() {
        return "/clientes_potenciales/eliminar";
    }
    @GetMapping("/Listado")
    public String listado() {
        return "/clientes_potenciales/listado";
    }
}