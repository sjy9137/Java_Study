package inheritance2;

public class Example {
	public static void main(String[] args) {
		ChildProduct <Tv, String, String> product = new ChildProduct();
		
		product.setKind(new Tv());
		product.setModel("65ÀÎÄ¡");
		product.setCompany("LG");
		
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println(product.getCompany());
		
		
		Storage<Tv> sto = new StorageImpl<Tv>(100);
		sto.add(new Tv(), 0);
		Tv tv = sto.get(0);
		//System.out.println(sto.get(0));
		
	}
}
