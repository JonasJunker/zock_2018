package animationGame;

public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;
	
	
	public GeometricObject(double height, double width, Vertex pos){
		
		this.height=height;
		this.width=width;
		this.pos=pos;
	
		
		
		if(height<0){
			this.height=-height;
			pos.y=pos.y-height;
		}
		
				
		if(width<0){
			this.width=-width;
			pos.x=pos.x-width;
		}
		
	}
	public GeometricObject(double height, double width){this(height, width, new Vertex(0,0));}
		
	
	
	public Vertex getPos(){return pos;}
	
	public double getHeight(){return height;}
	
	public double getWidth(){return width;}
	
	
	
}
