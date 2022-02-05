package com.bilgeadam.newcourseapp.controller;

import com.bilgeadam.newcourseapp.entity.Course;
import com.bilgeadam.newcourseapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/course/{courseId}")
    public Course getCourse(long id)
    {
        Course course = null;
        Optional<Course> courseDB = courseRepository.findById(id);
        if(courseDB.isPresent())
        {
            course = courseDB.get();
        }
        return course;
    }

@GetMapping("/courses")
public List<Course> getCourses()
{
    return courseRepository.findAll();
}

@PostMapping("/course")
public Course saveCourse(@RequestBody Course course)
{
    return (Course) courseRepository.save(course);
}

}