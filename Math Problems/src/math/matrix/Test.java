package math.matrix;

public class Test {
    
    public static void main(String[] args) {
        
        Matrix test1 = new Matrix(2,2);
        Matrix test2 = new Matrix(2,2);

        test1.assign();
        test2.assign();

        System.out.println("Matrix 1");
        test1.print();
        System.out.println("Matrix 2");
        test2.print();

        Matrix result = test1.mutiple(test2);

        System.out.println("Result");
        result.print();
    }
}
