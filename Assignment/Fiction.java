package Assignment;

public class Fiction extends Book {

    
    public Fiction(String title) {
        super(title);
        setPrice();
    }

   
    public void setPrice() {
        price=24.99;

    }

    public String toString() {
        System.out.println("!!Fiction Book!!");
        return "Title:"+ getTitle()+"\nPrice:$"+ getPrice()+"\n";
    }
    

}