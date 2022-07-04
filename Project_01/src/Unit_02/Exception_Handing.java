package Unit_02;

public class Exception_Handing{
	public static void main(String args[]){
		
		one obj = new one();
		one.manualException();
	}
}
class one{

	private static void check_index(int i) throws Myexception{
		if( i<0 || i>5){
			throw new Myexception();
		}
		System.out.println("valid index");
		return;
	}

	static void manualException(){

		try{
			int arr[]= {1,2,3,4,5,6};
			check_index(6);
		}
		catch(Myexception e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
@SuppressWarnings("serial")
class Myexception extends Exception{
	public String getMessage(){
		return "manual exception index out of bond";
	}
}