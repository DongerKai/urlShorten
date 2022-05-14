package com.easy2go.urlShorten.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api controller
 *
 * @author DongerKai
 * @since 2022/5/14 14:13 ，1.0
 **/

@Api(tags = "接口")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ApiSetviceController {

    @GetMapping("/get")
    public String urlGenerate() {
        return "1";
    }
}
