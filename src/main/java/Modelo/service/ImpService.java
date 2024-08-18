package Modelo.service;

import Modelo.model.Usuario;

public interface ImpService {

    Usuario findById(long id);

    Usuario create(Usuario userToCreate);
}
