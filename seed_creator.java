import java.util.Random;

public class seed_creator {

public static void main (String[] arg){
//System.out.println("seed: " + seed_generator());
   // System.out.println("seed length: " + seed_length_counter());
   String SEED_GEN=seed_generator();
    System.out.println("seed is:" +seed_corrector(seed_length_counter(SEED_GEN), SEED_GEN));

}
public static String seed_generator(){
    Random random = new Random();
    //creats a random obj to generate a random number later
            return String.valueOf(random.nextLong());
            //returns a random long value 
}

public static byte seed_length_counter (String Seed){
    return (byte)Seed.length();
    //returns the length of the randomly generated long
}


public static String seed_corrector(byte seed_length, String seed ){
    StringBuilder New_Seed = new StringBuilder(seed);
    //converts string to a string builder for later use

if (Long.parseLong(seed) > 0) {
    //checks to see if the seed is positive or negative
    if(seed_length<19){
        //checks if a positive long number has the max digits
        for (int i = 0; i < 19-seed_length; i++) {
            //loops the amount of times the digit is off from max when number is positive
            New_Seed=New_Seed.insert(0, 0);
            //inserts 0 to the farthest left digit
        }
        
        

        return New_Seed.toString();
        //returns the edited new seed
    }
}
            else { if(seed_length<20){
  for (int i = 0; i < 20-seed_length; i++) {
    //loops the amount of times the digit is off from max when number is positive
            New_Seed.insert(1, 0).toString();
            //inserts 0 to the farthest left to the right of the negative sign
        }
            return New_Seed.toString();
            //returns the new seed
        }

        }
return New_Seed.toString();
//returns the same image as no editing is required
}}