package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Subjects {


    static Student student1 =
            new Student("Shivani Sarthi", 1,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");
    static    Student student2 =
            new Student("Sakshi Mittal", 2,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"xyz");
    static Student student3 =
            new Student("Nitin Mishra", 3,  Optional.of(Arrays.asList("Devops", "Testing", "AI/ML")),"abc");
    static Student student4 =
            new Student("Mohit Saxena", 4,  Optional.of(Arrays.asList("Docker", "SBT", "Maven")),"pqr");
    static Student student5 =
            new Student("Kiran jeet kaur", 5,  Optional.of(Arrays.asList("Devops", "Rust", "AI/ML")),"mno");
    static Student student6 =
            new Student("Mansi Pujari", 6, Optional.of(Arrays.asList("Docker", "SBT", "Maven")),"pqr");
    static Student student7 =
            new Student("Kapil", 7, Optional.empty(),"pqr");




    public static List<Student> StudentList()
    {

        List<Student> st=new ArrayList<Student>();
        st.add(student1);
        st.add(student2);
        st.add(student3);
        st.add(student4);
        st.add(student5);
        st.add(student6);
        st.add(student7);

        return st;
    }


    public static List<ClassRoom> ClassList()

    {

        ClassRoom c1 = new ClassRoom("xyz",  Optional.of(Arrays.asList(student1, student2)));
        ClassRoom c2 = new ClassRoom("abc",  Optional.of(Arrays.asList(student3, student4)));
        ClassRoom c3 = new ClassRoom("pqr",  Optional.of(Arrays.asList(student5, student6)));
        ClassRoom c4 = new ClassRoom("mno",  Optional.empty());



        List<ClassRoom> c = new ArrayList<ClassRoom>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        return c;
    }


}
