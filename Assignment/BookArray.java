package Assignment;

public class BookArray {

    public static void main(String[] args) {
        
       
        Book bookArray[]={new Fiction("The Adventures of pinoochio"),
                            new Fiction("Aleph"),
                            new Fiction("Fahrenheit 51"),
                            new Fiction("The Man Who Planted Trees"),
                            new Fiction("Tales from Shakespeare"),
                            new NonFiction("Thick and Grow"),
                            new NonFiction("Nudge"),
                            new NonFiction("Thinking, Fast and Slow"),
                            new NonFiction("The Prince"),
                            new NonFiction("Agena 21")};

        
        for(int i=0;i<bookArray.length;i++)
        {
            
            System.out.println(bookArray[i].toString());
        }
    }

}