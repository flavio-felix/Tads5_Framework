package br.ifms.edu.frame1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.ifms.edu.frame1.model.User;
import br.ifms.edu.frame1.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/listar")
    public String getUser(){
        return "Usuario localizado";
    }

    private UserService userService;

    @GetMapping("/")
    public ModelAndView listarTodos(){
        ModelAndView mv = new ModelAndView("listarTodos");
        List<User> users = this.userService.getUsers();
        
        mv.addObject("usersList", users);
        return mv;
    }
}


