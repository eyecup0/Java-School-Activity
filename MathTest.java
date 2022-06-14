public class MathTest  {
    
    public static void main(String[] args)  {
        System.out.println("The square root of 30 is " + Math.sqrt(30));
       
       
        System.out.println("The sine of 100 is " + Math.sin(100));
        System.out.println("The cosine of 100 is " + Math.cos(100));
       
        System.out.println("The value of the floor 44.7 is " + Math.floor(44.7));
        System.out.println("The value of the ceiling 44.7 is " + Math.ceil(44.7));
        System.out.println("The value of the round 44.7 is " + Math.round(44.7));
        
      
        System.out.println("Larger of the character K and the integer 70: " + Math.max('K', 70));
        System.out.println("Smaller of the character K and the integer 70: " + Math.min('K', 70));
        
        
        System.out.println("Random number between 0 and 10: " + (int) (Math.random()*10));

        System.out.print("\n");
        System.out.println("End of Program");
        System.out.println("\n");
    }

}
