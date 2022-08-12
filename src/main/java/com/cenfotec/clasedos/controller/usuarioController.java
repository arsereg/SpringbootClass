package com.cenfotec.clasedos.controller;


import com.cenfotec.clasedos.model.Usuario;
import com.cenfotec.clasedos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
;import java.util.List;

@RestController
@RequestMapping("/usuario")
public class usuarioController {

    private final UsuarioService usuarioService;

    public usuarioController(@Autowired UsuarioService pUsuarioService){
        this.usuarioService = pUsuarioService;

    }

    @GetMapping("/mail")
    public Usuario buscarPorMail(@RequestParam("email") String email){
        return usuarioService.buscarPorMail(email);
    }

    @GetMapping("/all")
    public List<Usuario> buscarTodo(){
        return usuarioService.buscarTodos();
    }

    @GetMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);

    }
}
