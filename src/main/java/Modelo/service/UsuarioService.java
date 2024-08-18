package Modelo.service;


import Modelo.model.Usuario;
import Modelo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioService  implements ImpService {

    private final UsuarioRepository userRepository;

    public UsuarioService(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Usuario findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario userToCreate) {
        if(userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("O usuário já existe");
        }else{
        return userRepository.save(userToCreate);
        }
    }
}

