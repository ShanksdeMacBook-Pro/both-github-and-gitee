package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shanks
 * @date 2020-10-15
 */
@RestController
public class HealthController {

    @GetMapping(value = {"/", ""})
    public String healthyCheck() {
        return "OK";
    }

    @GetMapping(value = {"/gitee", "/github"})
    public String push() {
        return "Push origin branch both GitHub and Gitee";
    }
}