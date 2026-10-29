public class Main {
    public static void main(String[] args) {
        
        Addition add = new Addition(new Constant(8),new Constant(3));
        Multiplication mult = new Multiplication(new Constant(7),new Constant(4));
        Subtraction sub2 = new Subtraction(new Constant(0), new Constant(mult.evaluate()));
        Subtraction sub = new Subtraction(new Constant(add.evaluate()), new Constant(sub2.evaluate()));
        


        System.out.println("O resultado da expressão (8 + 3) - (- (7 * 4)) eh:\n");
        System.out.println(sub.evaluate());
        //(8 + 3) - (- (7 * 4))

    }
}