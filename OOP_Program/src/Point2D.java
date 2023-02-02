
public class Point2D {
	private float x;
	private float y;
	
	public Point2D(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
		x = 0;
		y = 0;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY() {
		float[] result = new float[2];
		result[0] = this.x;
		result[1] = this.y;
		return result;
	}
	
	public String toString() {
		return "("+getX()+","+getY()+")";
	}

}
