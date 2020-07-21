package JavaConcept;

public class Student implements Comparable<Student>{

	private String studentname;
	private int studentage;
	
	
	public Student(String studentname, int studentage) {
		super();
		this.studentname = studentname;
		this.studentage = studentage;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	
	
	@Override
	public int compareTo(Student o) {
		
		//System.out.println(o.getStudentage());
		//System.out.println(this.studentage-o.getStudentage());
		
		//return this.studentage-o.getStudentage();
		   String StudentName = o.getStudentname();
		  

		   //ascending order
		   return this.studentname.compareTo(StudentName);
		
	}
	
	//sort by age
	/*@Override
	public int compareTo(Student o) {
		int b=this.studentage;
		int a=o.getStudentage();
		
		   return b>a?1:b<a?-1:0;
		
	}*/
	
	@Override
	public String toString() {
        return "[studentname= "+ studentname +" ,studentage= "+studentage+"]";
    }
	
	
	
}
