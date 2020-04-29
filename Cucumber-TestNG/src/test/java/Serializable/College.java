package Serializable;

import java.io.Serializable;
import java.util.List;

public class College implements Serializable{

	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	@Override
	public String toString() {
		return "College [students=" + students + "]";
	}
	
}
