package com.cenfotec.clasedos.service;

import com.cenfotec.clasedos.model.Usuario;
import com.cenfotec.clasedos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

   public UsuarioService(@Autowired UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
   }

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarTodos(){
       return usuarioRepository.findAll();
    }

    public Usuario buscarPorMail(String mail){
       return usuarioRepository.findByEmail(mail);
    }


}