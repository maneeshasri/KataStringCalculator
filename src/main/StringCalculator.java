package src.main;
public class StringCalculator extends InputStringCalculator {




    public static int add(String input) {
        InputStringCalculator calculator = new InputStringCalculator(input);
        return calculator.add();
    }

    public StringCalculator(String input){
        super(input);


    }



    public static void main(String[] args){

        StringCalculator.add("2,3");
    }

}