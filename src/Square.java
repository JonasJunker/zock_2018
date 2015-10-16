
public class Square extends GeometricObject{
	

		public Square(double w, Vertex pos){
			super(w,w,pos);
		}
		
		public Square(double w, double x, double y){
			super(w,w,new Vertex(x,y));
		}
		@Override public double area(){return width*height;}

		public @Override String toString(){
			return "Square("+super.toString()+")";
		}
		
		public @Override boolean equals(Object that){
			return (that instanceof Square) && super.equals(that);
		}
	}



