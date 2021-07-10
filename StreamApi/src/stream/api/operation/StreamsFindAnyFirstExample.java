package stream.api.operation;

import java.util.Optional;
import stream.st.Student;
import stream.st.StudentDataBase;

//short circuit operation limit, findFirst, findAny, anyMatch, allMatch, noneMatch
public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findAny();// returns the first encountered element in the stream
    }

    public static Optional<Student> findFirst(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findFirst();// returns first element in the stream
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAny();
        if(findAnyStudent.isPresent()){
            System.out.println("Student is :" + findAnyStudent.get());
        }else{
            System.out.println("No Student Found");
        }

        Optional<Student> findFirst = findFirst();
        if(findFirst.isPresent()){
            System.out.println("Student is :" + findFirst.get());
        }else{
            System.out.println("No Student Found");
        }
        //it will make a lot of different during parallel stream
        // findFirst, findAny ----> return value
        // anyMatch, allMatch, noneMatch ---> return boolean
    }
}
