package com.cursojava.curso.controllers;
import com.cursojava.curso.models.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UsuarioControllers {

    @RequestMapping(value="usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        return usuario;
    }
    @RequestMapping(value= "usuarios")
    public List<Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(243L);
        usuario.setNombre("lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("12312321");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("lucadsas");
        usuario2.setApellido("Moy22");
        usuario2.setEmail("lucas332moy@gmail.com");
        usuario2.setTelefono("1");

        Usuario usuario3 = new Usuario();
        usuario3.setId(546L);
        usuario3.setNombre("lucas333");
        usuario3.setApellido("Moy33");
        usuario3.setEmail("luca3333smoy@gmail.com");
        usuario3.setTelefono("12312321333333");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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