package controllers;
import models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UsuarioControllers {
    @RequestMapping(value= "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        return usuario;
    }

    @RequestMapping(value= "usuario32")
    public Usuario modificar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        return usuario;
    }
    @RequestMapping(value= "usuario322")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        return usuario;
    }
    @RequestMapping(value= "usuario332")
    public Usuario buscar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        return usuario;
    }
}