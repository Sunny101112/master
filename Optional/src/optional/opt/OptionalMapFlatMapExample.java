package optional.opt;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter(){

        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent()
                .filter(student -> student.getGpa()>=3.5);

        studentOptional.ifPresent(student -> System.out.println(student));

    }
    
    public static void optionalMap(){
        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();

        if(studentOptional.isPresent()){
            Optional<String> nameOptional= studentOptional.
                    map(Student::getName); 
            System.out.println("nameOptional : " + nameOptional);
        }
    }
    
    public static void optionalFlatMap(){
        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();
        if(studentOptional.isPresent()){
            Optional<Bike> bikeOptional= studentOptional
            		.filter(student->student.getGpa()>=3.5)
                     .flatMap(Student::getBike);
            
            System.out.println("bikeOptional : " + bikeOptional);
        }
      }

    public static void main(String[] args) {
        
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
