package day16javadesignpattern;

public class TestConnection {

	public static void main(String[] args) {
//		Connection con = Connection.getConnection();
//		System.out.println(con);
//		Connection con1 =Connection.getConnection();
//		System.out.println(con1);
//		Connection con2 = Connection.getConnection();
//		System.out.println(con2);
		
		Car car = CarFactory.makeACar("Hyundai");
		System.out.println(car);
		Car car1 = CarFactory.makeACar("Toyota");
		System.out.println(car1);
	}
}
