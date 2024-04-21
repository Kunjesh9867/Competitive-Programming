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


// Adjacent Sum Parity: 1013
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalNumbers = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < totalNumbers; j++) {
                int num = sc.nextInt();
                sum+=num;
            }
            
            
            if(sum%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Candies: 1018
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int arrayLength = sc.nextInt();

           int[] arr = new int[arrayLength*2];

            for (int j = 0; j <arr.length ; j++) {
                int num = sc.nextInt();
                arr[j] = num;
            }

            boolean possible = true;

            int iterator = 0;
            while (iterator < arr.length){
                int sum = 0;
                int value = arr[iterator];
                for (int j = 0; j < arr.length ; j++) {
                    if(arr[j] == value){
                        sum++;
                    }
                }

                if(sum > 2){
                    possible = false;
                    break;
                }
                else{
                    iterator++;
                }
            }


            if (possible){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}



// Chef Diet: 1025
// Mistake done: I created only 1 "for" loop and checking the value but we are asking for all inputs and then checking value. Not in-between.
import java.util.*;
import java.lang.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalDays = sc.nextInt();
           int proteinPerDay = sc.nextInt();



           boolean answer = true;
           int printDay = 0;


           int presentDay = 1;
           int remainingProtein = 0;



           int[] arr = new int[totalDays];
            for (int j = 0; j < totalDays; j++) {
                int dayProtein = sc.nextInt();
                arr[j] = dayProtein;

            }


            for (int j = 0; j <arr.length ; j++) {
                if((arr[j]+remainingProtein) >= proteinPerDay){
                    presentDay++;
                    remainingProtein += (arr[j]-proteinPerDay);
                }
                else{
                    answer = false;
                    printDay = presentDay;
                    break;
                }
            }
            if (answer){
                System.out.print("YES\n");
            }
            else{
                System.out.print("NO "+ printDay+"\n");

            }
        }

    }
}



// Break the Stick: 1026
