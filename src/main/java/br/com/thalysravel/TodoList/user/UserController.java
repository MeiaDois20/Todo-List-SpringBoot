package br.com.thalysravel.TodoList.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/get")
    public String getUser() {
        return "Ola API";
    }

    @PostMapping("/post")
    public void createUser(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }
}
