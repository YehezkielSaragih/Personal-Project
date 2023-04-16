package math.matrix;

import java.util.Scanner;

public class App {

    public static void start(){

        System.out.println("=======================");
        System.out.println("   Matrix Calculator   ");
        System.out.println("=======================");
        System.out.println("");
    }

    public static void end(){

        System.out.println("=======================");
        System.out.println("       Thank You       ");
        System.out.println("=======================");
    }
    
    public static void main(String[] args) {
        
        start();

        // Making Matrix Rows and Column
        System.out.println("Making Matrix ! \n");
        
        Scanner input = new Scanner(System.in);

        // Matrix 1 Rows and Column
        System.out.println("Matrix 1");
        System.out.print("Matrix 1 rows      = ");
        int rows1 = input.nextInt();
        System.out.print("Matrix 1 column    = ");
        int column1 = input.nextInt();
        
        Matrix test1 = new Matrix(rows1,column1);
        
        // Assign 
        test1.assign();

        // Matrix 2 Rows and Column
        System.out.println("Matrix 2");
        System.out.print("Matrix 2 rows      = ");
        int rows2 = input.nextInt();
        System.out.print("Matrix 2 column    = ");
        int column2 = input.nextInt();
        
        Matrix test2 = new Matrix(rows2,column2);
        
        // Assign
        test2.assign();
        
        // Operator
        System.out.println("What operator do you want to use ?");
        System.out.println("(Add, Subtract, Mutiple, Transpose)");
        
        String operation = input.next();
        System.out.println("");
        
        // Print Matrix
        System.out.println("Matrix 1");
        test1.print();
        System.out.println("Matrix 2");
        test2.print();
        
        // Operator
        if(operation.equalsIgnoreCase("Add")){

            Matrix result = test1.add(test2);
            
            System.out.println("Add Result");
            result.print();
        }
        else if(operation.equalsIgnoreCase("Subtract")){

            Matrix result = test1.sub(test2);
            
            System.out.println("Subtract Result");
            result.print();
        }
        else if(operation.equalsIgnoreCase("Mutiple")){

            Matrix result = test1.mutiple(test2);
            
            System.out.println("Mutiple Result");
            result.print();
        }
        else if(operation.equalsIgnoreCase("Transpose")){

            Matrix result1 = test1.transpose();
            Matrix result2 = test2.transpose();
            
            System.out.println("Transpose Result 1");
            result1.print();
            System.out.println("Transpose Result 2");
            result2.print();
        }

        input.close();
        
        end();
    }
}      