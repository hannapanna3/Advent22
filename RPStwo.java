import java.io.File;
import java.io.Reader;
import java.util.*;
class RPStwo {
    
    public static void main(String[] args) {

        ArrayList<String> outcome = new ArrayList<String>();
        
        int points = 0;

        try {//läser filen
            File myObj = new File("input2.txt");
            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String line = myReader.nextLine();

            if(line.equals("A Y")){
            points += 4;
            }
       
            else if(line.equals("A X")){
                points += 3;
            }

            else if(line.equals("A Z")){
                points += 8;
            }

            else if(line.equals("B X")){
                points += 1;
            }
            else if(line.equals("B Y")){
                points += 5;
            }

            else if(line.equals("B Z")){
                points += 9;
            }

            else if(line.equals("C X")){
                points += 2;
            }
            else if(line.equals("C Y")){
                points += 6;
            }

            else if(line.equals("C Z")){
                points += 7;
            }


            }


        

        
         }catch(Exception e){
            System.out.println(e.getMessage());
                
            }
       System.out.println("points: "+ points);
    }
}
