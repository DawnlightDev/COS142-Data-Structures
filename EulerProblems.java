import java.util.Scanner;

public class EulerProblems {


   public static void main(String [] args){
      
      try (Scanner input = new Scanner(System.in)) {
         //Euler 1
         System.out.print("What number do you want to use for E1? ");
         long n = input.nextInt();  //hiding Integer.parseInt() call
         long answer = euler1(n);
         System.out.println("Answer to E1: " + answer);
         
         //Euler 2
         System.out.print("What number do you want to use for E2? ");
         n = input.nextInt();
         answer = euler2(n);
         System.out.println("Answer to E2: " + answer);
         
         
         /*
         BigInteger a = new BigInteger("2");
         BigInteger b = new BigInteger("3");
         a.add(b)
         */
         System.out.print("What number do you want to check for prime? ");
         n = input.nextLong();      
         System.out.println(isPrime(n));

         //Euler 3 
         n = 600851475143l;
         System.out.print("The largest prime factor for " + n + " is: ");
         System.out.println(euler3(n));

         //Euler 5
         System.out.print("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is ");
         System.out.println(euler5(n));

         //Euler 6
         System.out.print("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is ");
         System.out.println(euler6(n));

         //Euler 7
         System.out.print("The 10,001 prime number is ");
         System.out.println(euler7(n));

         //Euler 9
         System.out.print("The product of abc is ");
         System.out.println(euler9(n));
      }
   }

   public static long euler1(long n) {
      long answer = 0;
      
      for(int i = 3 ; i < n ; i++ ) {
         //if the number is a multiple of 3 or 5, add it to answer
         if(i % 3 == 0 || i % 5 == 0) {
            answer = answer + i;
         }
      }
      
      return answer;
   
   }
   
   
   public static long euler2(long n) {
      long sumOfFibs = 0;
      
      int fib1 = 1;
      int fib2 = 2;
      //int fib3 = 2;
      
      while(fib2 <= n) {
         if(fib2 % 2 == 0) {
            sumOfFibs += fib2;  //same as sumOfFibs = sumOfFibs + 2
         }
         //adjust the fibs
         fib2 += fib1;
         fib1 = fib2 - fib1;
         //or
         fib1 = fib2;
         fib2 += fib1;
         //fib3 = fib1+fib2;
      }
      return sumOfFibs;
   }

   
   public static long euler3(long n) {
      long maxPrime = -1;

      while (n % 2 == 0) {
         maxPrime = 2;
         n /= 2;
      }

      for (int i = 3; i <= Math.sqrt(n); i += 2) {
         while (n % i == 0) {
            maxPrime = i;
            n = n / i;
         }
      }
      if (n > 2)
         maxPrime = n;

      return maxPrime;
}
   
   
   
   public static boolean isPrime(long n) {
   
      if(n % 2 == 0 && n != 2) {
         return false;
      }
      
      long currentNum = 3;
        
      while(currentNum <= Math.sqrt(n)) {
         if(n % currentNum == 0) {
            return false;
         }   
         currentNum += 2;
      }
      
      return true;
   }

   public static long euler5(long n) {
      long i=20;
      
      while ((i % 20!=0)||(i % 19!=0)||(i % 18!=0)||(i % 17!=0)||(i % 16!=0)||(i % 15!=0)||(i % 14!=0)||(i % 13!=0)||(i % 12!=0)||(i % 11!=0)||(i % 10!=0)||(i % 9!=0)||(i % 8!=0)||(i % 7!=0)||(i % 6!=0)||(i % 5!=0)||(i % 4!=0)||(i % 3!=0)||(i % 2!=0)||(i % 1!=0))
      {
         i++;
      }
      System.out.println(i);
      return i;
}

   private static final int N = 100;

   public static long euler6(long n) {
      int sum = 0;
      int sum2 = 0;
      for (int i = 1; i <= N; i++) {
         sum += i;
         sum2 += i * i;
      }
      System.out.println(sum * sum - sum2);
      return n;

   }

   public static long euler7(long n) {
      long i=0;
      long count=1;
      
      while (i<10001){
         count++;
         if (isPrime(count))
            i++;
      }
      
      System.out.println(count);
      return count;
   }

   public static long euler9(long n) {
      for (int a = 1; a < 1000; a++) {
         for (int b = a + 1; b < 1000; b++) {
            int c = 1000 - a - b;
            if (a * a + b * b == c * c) {
               System.out.println(a * b * c);
            }
         }
      }
         
      return n;
   }
   
}