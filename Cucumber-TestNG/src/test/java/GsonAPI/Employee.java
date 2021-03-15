package GsonAPI;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee implements Serializable{

	/*{
		  "name": "mkyong",
		  "age": 35,
		  "position": [
		    "Founder",
		    "CTO",
		    "Writer"
		  ],
		  "skills": [
		    "java",
		    "python",
		    "node",
		    "kotlin"
		  ],
		  "salary": {
		    "2018": 14000,
		    "2012": 12000,
		    "2010": 10000
		  }
		}*/
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	List<String> position;
	List<String> skills;
	Map<String, Long> map = new HashMap<String, Long>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPosition() {
		return position;
	}
	public void setPosition(List<String> position) {
		this.position = position;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Map<String, Long> getMap() {
		return map;
	}
	public void setMap(Map<String, Long> map) {
		this.map = map;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", skills=" + skills + ", map="
				+ map + "]";
	}
}
