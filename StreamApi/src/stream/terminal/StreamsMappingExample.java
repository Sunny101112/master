package stream.terminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import stream.st.Student;
import stream.st.StudentDataBase;

public class StreamsMappingExample {

    public static void main(String[] args) {

       Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet())); // this avoids the additional map intermediate operation.
       
                //.collect(Collectors.mapping(Student::getName,toSet()));
       			//.map(s -> s.getName()).collect(Collectors.toSet());

        System.out.println("namesSet : " + namesSet);

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList())); // this avoids the additional map intermediate operation.
        		//.map(Student::getName).collect(toList());

        System.out.println("namesList : " + namesList);

    }

}
