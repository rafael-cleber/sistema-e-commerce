package Modelo.controller;

import Modelo.model.Usuario;
import Modelo.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    public final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("/id")
    public ResponseEntity <Usuario> findById(@PathVariable Long id){
        var usuario = usuarioService.findById(id);
        return ResponseEntity.ok(usuario);
    }
    @PostMapping
    public ResponseEntity <Usuario> create(@RequestBody Usuario userToCreate){
        var userToCreated = usuarioService.create(userToCreate);
        return ResponseEntity.ok(userToCreated);
    }
}
