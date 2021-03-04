package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SubjectsTest {
    Student student1 =
            new Student("Shivani Sarthi", 1,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");


    ClassRoom c1 = new ClassRoom("xyz",
            Optional.of(Arrays.asList(student1)));


    @Test
    void studentList() {
        assert (c1.getStudentList().isPresent());
    }

    @Test
    void classList() {
assert (c1.getStudentList().isPresent());
    }
}