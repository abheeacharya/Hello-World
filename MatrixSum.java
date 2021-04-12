import java.io.*;
import java.util.*;

class Matrix{
    int arr[][];
    int r,c;
    Matrix(int r, int c){
        this.r=r;
        this.c=c;
        arr = new int[r][c];
    }
    int[][] getMatrix()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for(int i=0; i<r; i++){
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<c; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        return arr;
    }
    int[][] getSum(int a[][], int b[][]){
        int temp[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
        
    }
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
        Matrix m1 = new Matrix(3,3);
        Matrix m2 = new Matrix(3,3);

        int x[][], y[][], z[][];
        System.out.println("Please enter first matix : ");
        x = m1.getMatrix();
        System.out.println("Please enter second matrix : ");
        y = m2.getMatrix();
        z = m1.getSum(x, y);

        System.out.println("Display Matrix : ");
        m2.displayMatrix(z);

    }
}
