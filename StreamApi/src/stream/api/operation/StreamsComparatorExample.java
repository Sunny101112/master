package stream.api.operation;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import stream.st.Student;
import stream.st.StudentDataBase;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

       return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
    		  // .sorted((o1,o2)->o2.getName().compareTo(o1.getName()))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by NAME");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA");
         sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA Higher to Lower");
        sortStudentsByGpaReversed().forEach(System.out::println);

    }
}
