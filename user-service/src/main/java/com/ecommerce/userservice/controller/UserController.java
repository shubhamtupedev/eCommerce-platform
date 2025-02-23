package com.ecommerce.userservice.controller;


import com.ecommerce.commonlib.dto.ResponseDto;
import com.ecommerce.commonlib.dto.UserRequestDto;
import com.ecommerce.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register")
    public ResponseEntity<ResponseDto<?>> register(@RequestBody @Valid UserRequestDto userRequestDto) {
return userService.
    }
}
