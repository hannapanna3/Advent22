
import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

class Rugsack {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        try {//läser filen
            File myObj = new File("input3.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
              String data = myReader.next();
              list.add(data);//läser rad för rad o lägger till innehållet från fil till "numbers"
              //System.out.println(data);
            }
            myReader.close();//bös som hantera inläsning av filen
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

            /*list.add("vJrwpWtwJgWrhcsFMMfFFhFp");
            list.add("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
            list.add("PmmdzqPrVvPwwTWBwg");
            list.add("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
            list.add("ttgJtRGJQctTZtZT");
            list.add("CrZsJsPPZsGzwwsLwLmpwMDw");*/

            int count = 0;
         
            for (String s : list) {
                
                
                

                final int mid = s.length() / 2; // Split string in half
                String[] parts = { s.substring(0, mid), s.substring(mid) };
                {

                    // System.out.println(parts[0]); // first part
                    // System.out.println(parts[1]); // second part

                    for (char c0 : parts[0].toCharArray()) {
                        boolean isfound = false;
                        for (char c1 : parts[1].toCharArray()) {
                            if (c0 == c1) { //check to find common char
                                // System.out.println("points" + (int)c0);

                                if (Character.isLowerCase(c0)) {
                                    count += (((int) c0) - 96); //get right point, example "p" = 112 -96
                                } else if (Character.isUpperCase(c0)) { //get right point, as by ASCII code
                                    count += (((int) c0) - 38);
                                }

                                isfound = true;
                                break;

                            }

                        }
                        if (isfound) {
                            break;
                        }

                    }

                }

            }
            System.out.println("final: " + count);

        }

    

    }

    