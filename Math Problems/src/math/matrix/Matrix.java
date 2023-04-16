package math.matrix;

import java.util.Scanner;

public class Matrix {
    
    // Attribute
    private int rows, column;
    private int[][] array;

    private Scanner input = new Scanner(System.in);

    // Constructor
    public Matrix(){}
    public Matrix(int rows, int column){

        this.rows = rows;
        this.column = column;
        array = new int[rows][column];
    }

    // Setter
    public void setRows(int rows) {
        
        this.rows = rows;
    }
    public void setColumn(int column) {
        
        this.column = column;
    }
    public void setArray(int[][] array) {
        
        this.array = array;
    }

    // Getter
    public int getRows() {
       
        return rows;
    }
    public int getColumn() {
        
        return column;
    }
    public int[][] getArray() {
        
        return array;
    }

    // Assign
    public void assign(){

        System.out.println("Enter the matrix elements !");
        for(int i = 0; i < this.rows; i++){

            for(int j = 0; j < this.column; j++){

                array[i][j] = input.nextInt();
            }
        }
        input.nextLine();
        
        System.out.println("");
    }

    // Operation 1
    public Matrix add(Matrix matrix){

        Matrix result = new Matrix(rows, column);
        
        if(this.rows != matrix.getRows() || this.column != matrix.getColumn()){

            System.out.println("Two matrix must have same length of rows and column !");
        }
        else{

            for(int i = 0; i < rows; i++){

                for(int j = 0; j < column; j++){
    
                    result.array[i][j] = this.array[i][j] + matrix.array[i][j];                
                }
            }
        }

        return result;
    }
    public Matrix sub(Matrix matrix){

        Matrix result = new Matrix(rows, column);
        
        if(this.rows != matrix.getRows() || this.column != matrix.getColumn()){

            System.out.println("Two matrix must have same length of rows and column !");
        }
        else{

            for(int i = 0; i < rows; i++){

                for(int j = 0; j < column; j++){
    
                    result.array[i][j] = this.array[i][j] - matrix.array[i][j];                
                }
            }
        }

        return result;
    }

    // Operation 2
    public Matrix mutiple(Matrix matrix){

        // If a * b, then result rows will be same with a 
        // and result column will be same with b

        Matrix result = new Matrix(matrix.getRows(), matrix.getColumn());
        
        int buffer;

        if(this.column != matrix.getRows()){

            System.out.println("Matrix a column is not equals to matrix b rows");
        }
        else{

            for(int i = 0; i < this.rows; i++){

                for(int j = 0; j < matrix.getColumn(); j++){

                    buffer = 0;

                    for(int k = 0; k < this.column; k++){

                        buffer = buffer + this.array[i][k] * matrix.array[k][j];
                    }
                    result.array[i][j] = buffer;
                }
            }
        }   

        return result;
    }

    //
    public Matrix transpose(){

        Matrix result = new Matrix(rows, column);

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < column; j++){

                result.array[i][j] = this.array[j][i];                
            }
        }        
        return result;
    }

    // Print
    public void print(){

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){

                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
