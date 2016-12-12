package singleton;
public class testProCon {

	public static void main(String[] args) {
		Configuration test= Configuration.getInstance();
		test.setConnection(5);
		test.setPortNumber(7);
		System.out.println(test.getConnection());
		
		Configuration test1= Configuration.getInstance();
		Configuration test2= Configuration.getInstance();
		test1.setUrl("https//");;
		test1.setTimeout(4);
		
		System.out.println(test1.getConnection());
		System.out.println(test1.getPortNumber());
		System.out.println(test1.getUrl());
		System.out.println(test1.getTimeout());
		
		
		//Calling second test
		System.out.println(test2.getConnection());
		System.out.println(test2.getPortNumber());
		System.out.println(test2.getUrl());
		System.out.println(test2.getTimeout());

	}

}
