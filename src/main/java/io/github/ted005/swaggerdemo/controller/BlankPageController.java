package io.github.ted005.swaggerdemo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BlankPageController implements ErrorController {

    private static final String ERROR = "/error";

    @Override
    public String getErrorPath() {
        return ERROR;
    }

    @RequestMapping
    public String error() {
        return "errorPage";
    }

}
