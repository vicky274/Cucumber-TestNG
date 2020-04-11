package APIResponse;

import java.util.List;

public class Author  {
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  private List<Address> list;
	 /* Author(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } */
	  
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	
	public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  } 
	 
	}
