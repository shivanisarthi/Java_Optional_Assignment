package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1 =
        new Student("Shivani Sarthi", 1,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");

    @Test
    void getName() {
        assert (student1.getName().equals("Shivani Sarthi"));
    }

    @Test
    void getSubject() {
      assert (student1.getSubject().equals(Optional.of(Arrays.asList("Devops", "Rust", "AI/ML"))));


    }

    @Test
    void testToString() {
        Assert.assertEquals("Student [name=Shivani Sarthi, rollNumber=1, subject=Optional[[Devops, Rust, AI/ML]]]",student1.toString());
    }
}