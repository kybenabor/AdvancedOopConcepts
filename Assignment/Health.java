package Assignment;

public class Health extends Insurance {
    public Health() {
       
        super("Health");
    }

    public void setCost() {
        
        super.cost = 196;
    }

    public void display() {
       
       System.out.println(super.getType() + " insurance with monthly fee of $" + super.getCost());
    }
}
