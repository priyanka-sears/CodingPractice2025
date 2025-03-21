package java8examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*To find and print the maximum marks in the "Math" subject among a group of subjects for a list of students*/
public class StudentWithMaxMarks {
	public static void main(String args[]) {
		final Student st1 = new Student("priyanka", Arrays.asList(new Subject("1", "science", 60, 2),
				new Subject("2", "english", 60, 3), new Subject("3", "Math", 60, 10)));

		final Student st2 = new Student("pooja", Arrays.asList(new Subject("1", "science", 70, 6),
				new Subject("2", "english", 80, 5), new Subject("3", "Math", 90, 7)));

		final Student st3 = new Student("mona", Arrays.asList(new Subject("1", "science", 90, 8),
				new Subject("2", "english", 80, 1), new Subject("3", "Math", 60, 2)));
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);

		final Optional<Student> studentMaxMarkInMath = studentList.stream()
				.filter(std -> std.getSubjects().stream().anyMatch(sub -> sub.getSubject().equals("Math")))
				.max(Comparator.comparingInt(stu -> stu.subjects.stream().filter(sub -> sub.getSubject().equals("Math"))
						.findFirst().get().getMarks()));  // will check .getMarks based

		studentMaxMarkInMath.ifPresentOrElse(
				s -> System.out.println("Student having max mark in Math - " + s.getName()),
				() -> System.out.println("No student with Max mark"));

		
	}
}
