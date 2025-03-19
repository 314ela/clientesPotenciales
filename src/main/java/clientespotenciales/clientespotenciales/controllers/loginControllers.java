package clientespotenciales.clientespotenciales.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginControllers {
    
    @GetMapping("/login/forgot") 
    public String loginContrasena() {
        return "/login/contrasena";
    }
    
    @GetMapping("/login/create")
    public String loginRegistro() {
        return "/login/registro";
    }
}