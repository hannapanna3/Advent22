import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

class ElvesCarriesCalories {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        //read list, when a row is "empty" add previos info to list a
        //repeat BUT this time check if current info is larger than previous, 
        //if yes then add to list a, otherwise continue

       try {//läser filen
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNext()) {
            String line = myReader.nextLine();

            if (line.equals("")) {
                numbers.add(null);
            } else {
                Integer data = Integer.parseInt(line);
                numbers.add(data);
            }
           
        }
        myReader.close();//bös som hantera inläsning av filen
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
        
            

        /*numbers.add(1000);
        numbers.add(2000);
        numbers.add(3000);
        numbers.add(null);
        numbers.add(4000);
        numbers.add(null);
        numbers.add(5000);
        numbers.add(6000);
        numbers.add( null);
        numbers.add(7000);
        numbers.add(8000);
        numbers.add(9000);
        numbers.add(null );
        numbers.add(10000);
        System.out.println(numbers);*/

        //elves = 0;
        int elfCal = 0;
        int elfCalB = 0;
        int elfCalC = 0;
        int greatestElf = 0;

        for (int i = 0; i < numbers.size()-1; i++){

            if(numbers.get(i) == null){
                if(elfCal > greatestElf){
                    greatestElf = (elfCal);
                   
                    elfCal = 0;
                }

                else{
                    elfCal = 0;
                    }
                
            }
            else if(numbers.get(i) != null){
                elfCal += (numbers.get(i));
                //System.out.println("elfcal: " + elfCal);
            } 
            if(numbers.get(i) == null){
                if(elfCalB > greatestElf){
                    greatestElf += (elfCalB);
                   
                    elfCalB = 0;
                }
                
                else{
                    elfCalB = 0;
                    }
                
            }
            else if(numbers.get(i) != null){
                elfCal += (numbers.get(i));
                //System.out.println("elfcal: " + elfCal);
            } 
            if(numbers.get(i) == null){
                if(elfCalC > greatestElf){
                    greatestElf += (elfCalC);
                   
                    elfCalC = 0;
                }
                
                else{
                    elfCalC = 0;
                    }
                
            }
            else if(numbers.get(i) != null){
                elfCal += (numbers.get(i));
                //System.out.println("elfcal: " + elfCal);
            } 
            }
            

            System.out.println("final: " + greatestElf);
        }
    }

    
