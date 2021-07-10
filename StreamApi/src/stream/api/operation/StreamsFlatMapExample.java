package stream.api.operation;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import stream.st.Student;
import stream.st.StudentDataBase;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                //.count();
                .collect(toList());

        return studentActivities;
    }
    
    public static List<String> flattening(){
    
    String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
    
    List<String> listOfAllChars = Arrays.stream(dataArray)
                                .flatMap(x -> Arrays.stream(x))
                                .collect(Collectors.toList());
    System.out.println(listOfAllChars);
	return listOfAllChars;
    }


    public static void main(String[] args) {

        System.out.println("printStudentActivities : " + printStudentActivities());
        flattening();
    }
}

	/*  converts one type to another as like map method.
		Used in context of stream where each element in the stream represent multiple elements
		Stream<List>
		Stream<Array>
*/