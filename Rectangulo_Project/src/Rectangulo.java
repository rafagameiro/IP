/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Rectangulo {
	
	private double ybot;
	private double ytop;
	private double xleft;
	private double xright;
	public static final double DEFAULT_VALUE = 0.5;
	
	public Rectangulo(){
		xleft = - DEFAULT_VALUE;
		xright = DEFAULT_VALUE;
		ybot = - DEFAULT_VALUE;
		ytop = DEFAULT_VALUE;
		
	}
		
	public Rectangulo(double left,double right,double bot,double top){
		ybot = bot;
		ytop = top;
		xleft = left;
		xright = right;
		
	}
	
	public Rectangulo(double left, double top, double length){
		xleft = left;
		ytop = top;
		xright = length + left;
		ybot = top - length;
		//Pre: length > 0
	}
	
	public double getTop(){
		return ytop;
	}
	public double getBot(){
		return ybot;
	}
	public double getLeft(){
		return xleft;
	}
	public double getRight(){
		return xright;
	}
	public double getYCenter(){
		return (this.getTop() + this.getBot())/2;//Caso as variaveis sejam int basta fazer a operação usando o segundo valor em real (2.0)
	}
	public double getXCenter(){
		return (this.getRight() + this.getLeft())/2;
	}
	
	public double getWidth(){
		return this.getTop() - this.getBot();
	}
	public double getHeight(){
		return this.getRight() - this.getLeft();
	}
	public double GetArea(){
		return this.getWidth()*this.getHeight();
	}
	public double GetPerimetre(){
		return 2*this.getHeight() + 2*this.getWidth();
	}	
	public void Translate(double dx, double dy){
	    xleft += dx; //it's the same as : xleft = xleft + dx;
	    xright = xright + dx;
	    ybot = ybot + dy;
	    ytop = ytop + dy;
	}
	public boolean IsThere(double x, double y){
		return xleft <= x && x <= xright && ybot <= y && y <= ytop;
	}
	public boolean rectInRect(Rectangulo r){
		//return ytop >= r.getTop() && ybot <= r.getBot() && xleft <= r.getLeft() && xright >= r.getRight(); 
		return this.GetArea() >= r.GetArea();// talvez assim tb funcione...
		//Pre: r!= null
	}
	public void turn(){
		double cx = this.getXCenter();
		double cy = this.getYCenter();
		double halfWidth = this.getWidth() / 2;
		double halfHeight = this.getHeight() / 2;
		ytop = cy + halfHeight;
		ybot = cy - halfHeight;
		xright = cx + halfWidth;
		xleft = cx - halfWidth;
	}

}