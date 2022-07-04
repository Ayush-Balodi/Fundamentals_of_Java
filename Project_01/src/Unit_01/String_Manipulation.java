package Unit_01;

public class String_Manipulation {
	public static void main(String args[]) {
		
		ayush obj = new ayush();
		obj.manipulation();
	}
}

class ayush{
	
	void manipulation() {
		StringBuffer str = new StringBuffer("Hemlo ");
		str.append("Jamva Pirogrammer");
		System.out.println(str);
		
		str.insert(6,"Ayush ji ");
		System.out.println(str);
		
		str.replace(0, 6, "Namaste this is ");
		System.out.println(str);
		
		str.delete(0, 16);
		System.out.println(str);
		return;
	}
}