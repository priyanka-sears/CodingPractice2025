package java8examples;

public class Subject {
private String subjectId;
private String subject;
private int marks;
private int grade;

public Subject(String subjectId, String subject, int marks, int grade) {

	this.subjectId = subjectId;
	this.subject = subject;
	this.marks = marks;
	this.grade=grade;
}
public String getSubjectId() {
	return subjectId;
}
public void setSubjectId(String subjectId) {
	this.subjectId = subjectId;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}

}
