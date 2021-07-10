package stream.api.operation;

import static java.util.stream.Collectors.toList;

import java.util.List;

import stream.st.Student;
import stream.st.StudentDataBase;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){

        List<Student> filteredStudentList = StudentDataBase.getAllStudents()
                .stream()
                //.filter(f->f.getGpa()>=3.9)
                .filter(student -> student.getGpa()>=3.9)
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());

        return filteredStudentList;
    }

    public static void main(String[] args) {

        System.out.println("Filtered Students : " + filterStudents());

    }
}
