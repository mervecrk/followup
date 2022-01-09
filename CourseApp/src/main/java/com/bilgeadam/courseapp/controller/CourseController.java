package com.bilgeadam.courseapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class CourseController {

    public String getCourses()
    {
        return "All courses";
    }


}
