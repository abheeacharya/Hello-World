import java.io.*;

class Prime {
    // prime method use to check whether given value is prime or not
    static boolean prime(long n){
        boolean isPrime = true;
        for (int i=2; i<=n/2; i++){
            if (n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    // genrate method takes value max from user and show number of prime value
    // c varibale use to calculate the number
    static void generate(long max){
        int c=1, num=2;
        while(c<=max){
            if(prime(num))
            {
               System.out.println(num);
               ++c; 
            }
            ++num;
        }
    }
}
class PrimeGenerator{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many prime number you needed : ");
        long max = Integer.parseInt(br.readLine());

        Prime.generate(max);
    }
}
