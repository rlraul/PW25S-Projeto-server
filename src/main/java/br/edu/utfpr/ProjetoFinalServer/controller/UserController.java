package br.edu.utfpr.ProjetoFinalServer.controller;

import br.edu.utfpr.ProjetoFinalServer.model.User;
import br.edu.utfpr.ProjetoFinalServer.service.UserService;
import br.edu.utfpr.ProjetoFinalServer.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    GenericResponse createUser(@Valid @RequestBody User user) {
        userService.save(user);
        return new GenericResponse("Registro salvo.");
    }

}
