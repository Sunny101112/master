package functional.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import functional.consumer.Student;
import functional.consumer.StudentDataBase;
import functional.predicate.PredicateStudentExample;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {

		Map<String, Double> stuGradeMap = new HashMap<>();
		students.forEach(student -> {
			if (studentPredicate.test(student)) {
				stuGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return stuGradeMap;
	};

	public static void main(String[] args) {

		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));
	}

}
