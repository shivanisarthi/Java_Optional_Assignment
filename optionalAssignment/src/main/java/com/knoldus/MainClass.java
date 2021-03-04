package com.knoldus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Driver class.
 */
public class MainClass {
  /**
   * Main method.
   *
   * @param args string argument
   */
  public static void main(final String[] args) {

    //1.students associated with a room that have no subjects associated.
    List<Student> s = Subjects.StudentList().stream()
            .filter(y -> !y.getRoomId().isEmpty())
            .filter(obj -> !obj.getSubject().isPresent())
            .collect(Collectors.toList());

    List<String> names = new ArrayList<String>();

    for (Student t : s) {

      names.add(t.getName());

    }
    System.out.println(names);

    //2.subjects of students associated with a room that has roomID "xyz".
    List<List<Student>> y = Subjects.ClassList().stream()
                .filter(z -> z.getRoomId().equals("xyz"))
            .map(k -> k.getStudentList().get()).collect(Collectors.toList());

    List<List<String>> p = y.get(0).stream().map(a -> a.getSubject()
            .get()).collect(Collectors.toList());

    Set<String> set = p.stream()
            .flatMap(Collection::stream).collect(Collectors.toSet());

    System.out.println(set);

    //3.  print "hello Student" if a room has students associated.
    List<ClassRoom> d = Subjects.ClassList().stream()
                .filter(q -> q.getStudentList().isPresent())
                .collect(Collectors.toList());

    d.forEach(f -> System.out.println(f.getRoomId() + " Hello Student"));

  }
}