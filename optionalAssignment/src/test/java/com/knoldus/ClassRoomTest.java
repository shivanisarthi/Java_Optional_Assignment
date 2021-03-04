package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    static Student student1 =
            new Student("Shivani Sarthi", 1,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");
    static    Student student2 =
            new Student("Sakshi Mittal", 2,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");

    ClassRoom c1 = new ClassRoom("xyz",  Optional.of(Arrays.asList(student1, student2)));


    @Test
    void getRoomId() {
        assert(c1.getRoomId().equals("xyz"));
    }

    @Test
    void testToString() {
        assert(c1.toString().equals("ClassRoom [roomID=xyz, studentList=Optional[[Student [name=Shivani Sarthi, rollNumber=1, subject=Optional[[Devops, Rust, AI/ML]]], Student [name=Sakshi Mittal, rollNumber=2, subject=Optional[[Devops, Rust, AI/ML]]]]]]"));
      }

    @Test
    void getStudentList() {
  assert(c1.getStudentList().isPresent());
    }
}