package functional.predicate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import functional.consumer.Student;
import functional.consumer.StudentDataBase;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    public static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    static Function<Integer, Predicate<Integer>> gradePredicate = toCompare -> number -> number > toCompare;
    static Function<Double, Predicate<Double>>  gpaPredicate = toCompare -> number -> number > toCompare;


    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        
		studentList.forEach((student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		}));

        studentList.stream()
                .filter(PredicateStudentExample.p1)
                .collect(Collectors.toList());

        boolean result = gradePredicate.apply(2).test(5) && gpaPredicate.apply(3.6).test(3.9);
        System.out.println("Result from Predicate : " + result);

    }
}
