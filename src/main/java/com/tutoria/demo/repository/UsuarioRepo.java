package com.tutoria.demo.repository;

import com.tutoria.demo.documents.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepo extends MongoRepository<Usuario,String> {
}
