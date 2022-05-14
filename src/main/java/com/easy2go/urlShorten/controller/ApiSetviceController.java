package com.easy2go.urlShorten.controller;

import com.easy2go.urlShorten.service.IApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

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
    @NonNull
    private IApiService apiService;

    @GetMapping("/get")
    public String urlGet() {
        return "1";
    }

    @PostMapping("/generate")
    public String urlGenerate(@ApiParam(name = "urlLong", value = "长url", required = true)
                              @RequestParam(value = "urlLong") String urlLong) {
        return apiService.generate(urlLong);
    }

    @GetMapping("/{shortUrl}")
    public void redirect(HttpServletResponse response,
                         @PathVariable(name = "shortUrl", value = "shortUrl", required = false) String shorturl) {
        try {
            if (StringUtils.equals(shorturl, "ZGFiMT")) {
                response.sendRedirect("http://www.baidu.com");
            }
        } catch (Exception e) {
            // dosomething
        }
    }
}
