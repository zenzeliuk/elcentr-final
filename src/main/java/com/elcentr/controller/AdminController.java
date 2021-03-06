package com.elcentr.controller;

import com.elcentr.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("admin")
@AllArgsConstructor
public class AdminController {

    private final UserService userService;

}
