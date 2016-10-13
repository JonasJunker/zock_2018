package animationGame;

public class Vertex {

// Attribute
	public double x;
	public double y;

// Konstruktor
	public Vertex(double x, double y){
		
		this.x=x;
		this.y=y;
		
		}
	

		
		

	
	public String toString() {return "("+x+", "+y+")" ;}
	
	public double length() {return Math.sqrt(x*x+y*y);}
	
	public Vertex skalarMult(double s){
		return new Vertex(x*s, y*s);}
	
	public void skalarMultMod(Vertex v){x=x*v.x; y=y*v.y;}
	
	public Vertex add(Vertex v){
		return new Vertex(v.x+x, v.y+y);}
	
	public void addMod(Vertex v){x=x+v.x; y=y+v.y;}
	
	public void setX(double x) {this.x = x;}
	
	public void setY(double y) {this.y = y;}
	
	public double getX() {return x;}
	
	public double getY() {return y;}
	
	public boolean equals(Object thatObject){
		if(thatObject instanceof Vertex){
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y==that.y;
		}
		return false;
		
		
	}
	
	
}