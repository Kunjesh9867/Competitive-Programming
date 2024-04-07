import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        String[] vowels  = {"a", "e" ,"i", "o", "u"};
        for (int i = 0; i < cases; i++) {
            int wordLength =sc.nextInt();
            String word = sc.next();


            boolean easy = true;


            for (int j = 0; j < wordLength; j++) {
//                System.out.println(word.charAt(j));
                int occurence = 0;
                if(!(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u')){
                    occurence++;


                    int end = j;
                    if(end+4 > wordLength){
                        end = wordLength;
                    }
                    else{
                        end = end+4;
                    }


                    for (int k = j+1; k < end; k++) {
//                        System.out.println(word.charAt(k));
                        if(!(word.charAt(k) == 'a' || word.charAt(k) == 'e' || word.charAt(k) == 'i' || word.charAt(k) == 'o' || word.charAt(k) == 'u')){
                            occurence++;
                        }
                    }
                    if(occurence == 4){
                        easy = false;
                        break;
                    }
                }

            }
            

            if(easy){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }

        }
    }
}


// TCS Examination: 1006
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            // Dragon
            int dragonDSA = sc.nextInt();
            int dragonTOC = sc.nextInt();
            int dragonDM = sc.nextInt();

            // Sloth
            int slothDSA = sc.nextInt();
            int slothTOC = sc.nextInt();
            int slothDM = sc.nextInt();


            int dragontotal = dragonDSA + dragonTOC + dragonDM;
            int slothtotal = slothDSA + slothTOC + slothDM;

            if(dragontotal != slothtotal){
                System.out.println((dragontotal > slothtotal) ? "DRAGON" : "SLOTH" );
            }
            else if(dragonDSA != slothDSA){
                System.out.println((dragonDSA > slothDSA) ? "DRAGON" : "SLOTH");
            }
            else if(dragonTOC != slothTOC){
                System.out.println((dragonTOC > slothTOC) ? "DRAGON" : "SLOTH");
            }
            else{
                System.out.println("TIE");
            }
        }
        sc.close();
    }
}


// 