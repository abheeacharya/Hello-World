import java.io.*;
import java.util.*;

class Matrix{
    int arr[][]; // Array variable for 2D array
    int r,c; // Variable to store row and column variable
    // Initialize row and colum variable and allot memory for array
    Matrix(int r, int c){
        this.r=r; 
        this.c=c;
        arr = new int[r][c];
    }
    // getMatrix method use to take 2D array from keyboard
    int[][] getMatrix()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Help to take input from keyboard
        
        // StringTokenizer is useful to accept the the single row as a string and then devide it into token, each tokens represents an array elements.
        StringTokenizer st; 
        for(int i=0; i<r; i++){
            String s = br.readLine(); // Accepting row value as a string
            st = new StringTokenizer(s, " "); // devide it as a token, after that each token represents an array token
            for(int j=0; j<c; j++){
                arr[i][j] = Integer.parseInt(st.nextToken()); // It will save this token on array
            }

        }
        return arr;
    }
    // getSum Method accept two array as argument and do sum of it and return it.
    int[][] getSum(int a[][], int b[][]){
        int temp[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
        
    }
    // displayMatrix is use to display the matrix.
    void displayMatrix(int res[][]){
        for(int i=0; i<r; i++ ){
            for(int j=0; j<c; j++){
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class MatrixSum {
    public static void main(String[] args) throws IOException{
        // Create two object for matrix class, since this two object contains two array.
        Matrix m1 = new Matrix(3,3);
        Matrix m2 = new Matrix(3,3);

        int x[][], y[][], z[][]; // Three array reference to save array object
        System.out.println("Please enter first matix : ");
        x = m1.getMatrix(); 
        System.out.println("Please enter second matrix : ");
        y = m2.getMatrix();
        z = m1.getSum(x, y); // Take two array and do the sum

        System.out.println("Display Matrix : ");
        m2.displayMatrix(z);

    }
}
