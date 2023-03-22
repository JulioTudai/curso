package com.cursojava.curso.controllers;
import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UsuarioControllers {
    @Autowired
    private UsuarioDao usuarioDao;

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
        return usuarioDao.getUsuarios();
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