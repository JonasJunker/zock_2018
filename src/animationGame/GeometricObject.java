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
	
	public GeometricObject(double s){this(s, s);}
	
	public GeometricObject(){this(10);}
	
	public GeometricObject(Vertex pos){this(10,10,pos);}
	
	
	
	// Methoden
	
	public String toString(){
		return "width="+width+", height="+height+", pos= "+pos;
	}
	
	
	public double circumference(){
		return 2*(height+width);
	}      
	
	public double area(){
		return height*width;
	}
	
	public boolean contains(Vertex v) {
		return v.x >= pos.x && v.x <= pos.x+width
		&& v.y >= pos.y && v.y <= pos.y+height;
	}
	
	public boolean isLarger(GeometricObject that){
		return this.area() > that.area();
	}
	
	public Vertex getPos(){return pos;}
	
	public double getHeight(){return height;}
	
	public double getWidth(){return width;}
	
	public void moveTo(double x, double y){
		moveTo(new Vertex(x,y));
		}
	
	public void moveTo(Vertex that){
		this.pos=that;
		}
	   
    public void moveTo(){
    	pos=new Vertex(0,0);
     }
    
    public boolean equals(Object thatObject) {
    	if (thatObject instanceof GeometricObject) {
    	 GeometricObject that = (GeometricObject)thatObject;
    	 	return that.width==this.width
    			 && this.height==that.height
    			 && this.pos.equals(that.pos);
    		}	
    	 return false;
    	}
   }
