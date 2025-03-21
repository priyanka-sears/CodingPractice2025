package java8examples;

import java.util.List;

public class Student {
 String Name;
List<Subject> subjects;
public Student(String name, List<Subject> subjects) {
	super();
	Name = name;
	this.subjects = subjects;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}

}
