/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class IgnoreThisClass {
    
    
     public int evennum(int key, num, count){

   

   if (key <= num){

      

      key++;

      

      return evennum(key, num, count += 2);

   

   }

   else{

      

      return count;

      

   }

}
    
    
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        
        //Time complexity
        //1 + 1 + n + n + 1 + (n - 1) + 1 = 3 + 3n = O(n)
        //Ω(1)
        
        //Space
        //1 + 1 = O(1)
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i == 1)
                continue;
            if(i == 2 || i == 3 || i == 5)
                sum += i;
            else if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0))
                sum += i;
        }
        
        return sum; 
    }
    
    
}
