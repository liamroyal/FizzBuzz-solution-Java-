
public class Main {

    public static void main(String[] args) {
        
        for(int i = 1; i < 101; i++) {
            
            //First as other cases can trigger on FizzBuzz number
            if(i % 3 == 0 && i % 5 == 0) { //FizzBuzz case
                
                System.out.println("FizzBuzz");
                
            } else if(i % 3 == 0) { //Fizz case
                
                System.out.println("Fizz");
                
            } else if(i % 5 == 0) { //Buzz case
                
                System.out.println("Buzz");
                
            } else System.out.println(i); //Else print number (1 - 100)
        }

    }

}




