package com.example.cloud.busi.controller;


import com.example.cloud.busi.service.UserService;
import com.example.cloud.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

/*    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }*/

    @PostMapping
    public void create(@RequestBody User user) {
        userService.insert(user);
    }

    @GetMapping
    public User findById(@RequestParam("id") int id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody User user) {
        user.setId(id);
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
}
