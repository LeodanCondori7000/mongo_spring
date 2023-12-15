package com.tutoria.demo.controller;

import com.tutoria.demo.documents.Usuario;
import com.tutoria.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping("/addUser")
    public Usuario addUser(@RequestBody Usuario usuario){
        return usuarioService.addUser(usuario);
    }
    @PostMapping("/product")
    public Usuario addProduct2User(@RequestBody Map<String,String> ids){
        String iduser = ids.get("idUser");
        String idproduct = ids.get("idProduct");
        return usuarioService.addProduct2User(iduser,idproduct);
    }
}
