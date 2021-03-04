package com.knoldus;

import java.util.List;
import java.util.Optional;




    public class Student extends ClassRoom{
        private String name;
        private int rollNumber;
        private Optional<List<String>> subject;

        public Student(String name, int rollNumber, Optional<List<String>> subject, String roomId) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.subject = subject;
            this.roomId = roomId;
        }



        public String getName() {
            return name;
        }


        public Optional<List<String>> getSubject() {
            return subject;
        }


        @Override
        public String toString() {
            return "Student [name=" + name + ", rollNumber=" + rollNumber + ", subject=" + subject + "]";
        }

    }
