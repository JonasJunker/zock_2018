
public class Main {

	public static void main(String[] args) {
		   SimpleOval s1 = new SimpleOval(45,53);
		   SimpleOval s2 = new SimpleOval(45,53);
		   Square sq1 = new Square(5,new Vertex(50,50));
		   Square sq2 = new Square(5,new Vertex(50,50)); 
		   System.out.println(s1.equals(s2));
		   System.out.println(s1);
		   System.out.println(sq1.equals(sq2));
		   System.out.println(sq1);
		   
		
	}

}
