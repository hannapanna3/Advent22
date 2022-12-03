
import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;
import java.util.ArrayList;

class RugsackTwo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        try {// läser filen
            File myObj = new File("input3.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data = myReader.next();
                list.add(data);// läser rad för rad o lägger till innehållet från fil till "numbers"
                // System.out.println(data);
            }
            myReader.close();// bös som hantera inläsning av filen
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        int count = 0;

        for (int i = 0; i < list.size(); i += 3) {
            String s1 = list.get(i);
            String s2 = list.get(i + 1);
            String s3 = list.get(i + 2);

            // final int mid = s1.length() / 2; // Split string in half
            // String[] parts = { s1,s2, s3 };

            // System.out.println(parts[0]); // first part
            // System.out.println(parts[1]); // second part
            boolean isfound = false;

            for (char c1 : s1.toCharArray()) {

                for (char c2 : s2.toCharArray()) {

                    for (char c3 : s3.toCharArray()) {

                        if (c1 == c2 && c2 == c3) { // check to find common char
                            // System.out.println("points" + (int)c0);

                            if (Character.isLowerCase(c1)) {
                                count += (((int) c1) - 96); // get right point, example "p" = 112 -96
                            } else if (Character.isUpperCase(c1)) { // get right point, as by ASCII code
                                count += (((int) c1) - 38);
                            }

                            isfound = true;
                            break;

                        }
                        if (isfound) {
                            break;
                        }
                        

                    }
                    if (isfound) {
                        break;
                    }

                }
                if (isfound) {
                    break;
                }

            }

        }
        System.out.println("final: " + count);
    }
}