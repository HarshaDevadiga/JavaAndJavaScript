package javaPrograms;

public class EvenAndOdd {

    int num;

    EvenAndOdd(int num){
        this.num = num;

        if(num%2 == 0){

        System.out.println("The given number "+num +" is Even");
        } else{
            System.out.println("Given number is odd");
        }
    }

    public static void main(String[] args) {
        EvenAndOdd num = new EvenAndOdd(21);

        
    }
    
}
