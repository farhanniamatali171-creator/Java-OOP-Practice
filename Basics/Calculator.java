public class Calculator {

    public int number1;
    public int number2;
    
    int sum(int number1,int number2){
        return number1+number2;
    }
        int sub(int number1,int number2){
        return number1-number2;
    }
        int mul(int number1,int number2){
        return number1*number2;
    }
        void div(double number1,double number2){
      
            if (number2==0) {
                System.out.println("Divided a number by zero is not Possible.");
                
            }
            else{
              
               System.out.println("Divide Result     :"+number1/number2);
        }
    }

    public static void main(String[] args) {
        Calculator c1= new Calculator();
        System.out.println("-----------------------------");
        System.out.println("Sum Result         :"+c1.sum(20,30));
        System.out.println("Subtraction Result :"+c1.sub(50,20));
        System.out.println("Multiply Result    :"+c1.mul(15,25));
        c1.div(20,100);
        System.out.println("-----------------------------");
        System.out.println("Try Divided number1 with zero");
        c1.div(20,0);
    }
}