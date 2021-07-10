package optional.opt;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){

        Student student = StudentDataBase.studentSupplier.get();
        //Student student = null;
        if(student!=null){
            return  student.getName();
        }else{
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){
    	//Optional<Student> student = Optional.empty();
    	//Optional<Student> student = Optional.of(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){
            return  student.map(Student::getName); // don't get confused this with streams map method. Both are different.
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
    	
    	// getStudentName().length();
    	//getStudentNameOptional().ifPresent(data->System.out.println(data));

        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get());
        }else{
            System.out.println("Name is returned as empty.");
        }
    }
    // Avoid null pointer Ex and unnecessary null checks
    
    /*	Null checks are not required.
    	No more NullPointerException at run-time.
    	We can develop clean and neat APIs.
    	No more Boiler plate code  */
}
