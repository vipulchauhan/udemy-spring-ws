package io.vnc.mvc.dto;

public class Course {

	private Long courseCode;
	private String courseName;
	private String semester;

	public Long getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Long courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", semester=" + semester + "]";
	}

}
