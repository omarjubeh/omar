package com.example.omar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping(value="/")
    public String hello()
    {
        return "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ss_NUf1kCtU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
    }

}
