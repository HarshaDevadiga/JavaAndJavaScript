package javaPrograms;

public  class AddNumbers {
    int num1;
    int num2;

    int sum = num1 + num2;


    public static void main(String[] args) {

        AddNumbers num = new AddNumbers();
        num.num1 = 5;
        num.num2 = 10;
        num.sum = num.num1 + num.num2;
        System.out.println("The sum of " + num.num1 + " and " + num.num2 + " is: " + num.sum);

    }
}
