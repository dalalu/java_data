package p669;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKing(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKing();
		String tvmodel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		
		
		product2.setKing(new Car());
		product2.setModel("스마트Tv");
		Car car = product2.getKing();
		String carmodel = product2.getModel();

	}

}
