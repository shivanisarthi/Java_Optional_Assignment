package com.knoldus;
import java.util.List;
import java.util.Optional;


public class ClassRoom {

    public String roomId;
    private Optional<List<Student>> studentList;

    public ClassRoom(String roomId, Optional<List<Student>> studentList) {
        this.roomId = roomId;
        this.studentList = studentList;
    }

    public ClassRoom() {
    }

    public String getRoomId() {
        return roomId;
    }

    @Override
    public String toString() {
        return "ClassRoom [roomID=" + roomId + ", studentList=" + studentList + "]";
    }



    public Optional<List<Student>> getStudentList()
    {
        return studentList;
    }



}
