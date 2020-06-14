package Customer;

public class CloneableInterface implements Cloneable{

	/**
	 * 
	 * As the name suggests, object cloning is a process of generating the exact copy of object with the different name.
	 */
		   private String dname;

		   public CloneableInterface(String dname) {
			this.dname = dname;
		   }

		   public String getName() {
			return dname;
		   }
		   // Overriding clone() method of Object class
		   public Object clone()throws CloneNotSupportedException{  
			return (CloneableInterface)super.clone();  
		   }
			
		   public static void main(String[] args) {
			CloneableInterface obj1 = new CloneableInterface("Tommy");
			try {
				CloneableInterface obj2 = (CloneableInterface) obj1.clone();
				System.out.println(obj2.getName());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		   }
		
}
