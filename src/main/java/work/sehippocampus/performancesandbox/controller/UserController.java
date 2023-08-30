package work.sehippocampus.performancesandbox.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.sehippocampus.performancesandbox.model.User;
import work.sehippocampus.performancesandbox.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api") // 共通のコンテキストパスを指定
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{username}") // ここで相対パスを指定
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}
