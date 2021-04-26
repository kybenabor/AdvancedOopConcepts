package Assignment;

public class Triangle extends GeometricFigure {
    Triangle(int height, int width, String type){
        super(height, width, type);
    }

   
    	public double getArea() {
        return (super.getHeight() * super.getWidth())/2;
    }

        public String toString() {
        return "A " + super.getType() + " with a height of " + super.getHeight() + ", with a width of " + super.getWidth() + ",and has an area of " + this.getArea();
    }
}
