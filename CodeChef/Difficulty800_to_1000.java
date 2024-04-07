// Hardest Problem Bet: 803
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int submissionA = sc.nextInt();
            int submissionB = sc.nextInt();
            int submissionC = sc.nextInt();


            if(submissionC < submissionB && submissionC < submissionA){
                System.out.println("ALICE");
            }
            else if(submissionB < submissionA && submissionB < submissionC){
                System.out.println("BOB");
            }
            else{
                System.out.println("DRAW");
            }
        }
    }
}


// Wordle: 804

//^ Solution: 1
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String correctString = sc.next();
            String guessString = sc.next();

            String answer = "";

            for (int j = 0; j < 5 ; j++) {
                
                Character correctStringChar = correctString.charAt(j);
                Character guessStringChar = guessString.charAt(j);
                if(correctStringChar.equals(guessStringChar)){
                    answer += "G";
                }
                else{
                    answer += "B";
                }
            }

            System.out.println(answer);

        }
    }
}


//^ Solution: 2
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String correctString = sc.next();
            String guessString = sc.next();

            String answer = "";

            for (int j = 0; j < 5 ; j++) {
                if(correctString.charAt(j) == guessString.charAt(j)){
                    answer += "G";
                }
                else{
                    answer+="B";
                }
            }

            System.out.println(answer);

        }
    }
}



// Complete the credits: 809
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int credits = sc.nextInt();
           
           if(credits > 65){
               System.out.println("OVERLOAD");
           }
           else if(credits < 35){
               System.out.println("UNDERLOAD");
           }
           else{
               System.out.println("NORMAL");
           }

        }
    }
}


// Cars and Bikes: 809
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int tyres = sc.nextInt();

           if(tyres%2 == 0){
               if(tyres%4 == 0){
                   System.out.println("NO");
               }
               else{
                   System.out.println("YES");
               }
           }
           else{
               System.out.println("NO");
           }
           

        }
    }
}


// Buy 2 Get 1 Free: 821
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int items = sc.nextInt();
           int cost = sc.nextInt();

           int payableAmount = 0;

           while (items > 0){
                if(items >= 2){
                    payableAmount = payableAmount + 2*cost;
                    items = items - 3;
                }
                else{
                    payableAmount = payableAmount + cost;
                    items--;

                }
           }

            System.out.println(payableAmount);

        }
    }
}


// Equalizing Numbers: 823
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int num1 = sc.nextInt();
           int num2 = sc.nextInt();

           if(Math.abs(num1-num2)%2 == 0){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

        }
    }
}


// The Preparations: 823
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int minutesBeforeExam = sc.nextInt();
           int episode = sc.nextInt();
           int duration = sc.nextInt();

           int total = episode*duration;
           
           if(total < minutesBeforeExam){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

        }
    }
}


// Genes: 826
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

           Character value1 = sc.next().charAt(0);
           Character value2 = sc.next().charAt(0);

           if( value1.equals('R') || value2.equals('R')){ // Brown
               System.out.println('R');
           }
           else if(value1.equals('B') || value2.equals('B')){ // Blue
               System.out.println('B');
           }
           else{
               System.out.println('G');
           }

        
    }
}


// Best of N Sets: 830
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int player1Matches = sc.nextInt();
           int player2Matches = sc.nextInt();
           
           
           
           int maxScore = Math.max(player1Matches, player2Matches);
           int minScore = Math.min(player1Matches, player2Matches);

            System.out.println(player1Matches + player2Matches + (maxScore - minScore -1)); // You can also use Math.abs

        }
    }
}


// The Block Game: 831
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
           int num = sc.nextInt();


           int number = num;
           int reverse = 0;

           while (number > 0){
               reverse = reverse*10 + number%10;
               number = number/10;
           }

            System.out.println(num==reverse ? "wins" : "loses");
        }

        sc.close();
    }
}




// Mileage matters: 831
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i <  cases ; i++) {
            int kmToTravel = sc.nextInt();
            int petrolPrice = sc.nextInt();
            int dieselPrice = sc.nextInt();
            int petrolKm = sc.nextInt();
            int dieselKm = sc.nextInt();


            /*
            * We are using Cross-Multiplication
            *
            * 10 rupees = 2 km
            *     ?     = 20km
            * */

            double petrol = (double)(petrolPrice * kmToTravel) / (double) petrolKm;
            double diesel = (double)(dieselPrice * kmToTravel) / (double) dieselKm;

            // System.out.println(petrol);
            // System.out.println(diesel);

            if(diesel == petrol){
                System.out.println("ANY");
            }
            else if(petrol < diesel){
                System.out.println("PETROL");
            }
            else{
                System.out.println("DIESEL");
            }



        }
    }
}


// Melt Gold: 835


// Good Weather : 835
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i <  cases ; i++) {
            int day1 = sc.nextInt();
            int day2 = sc.nextInt();
            int day3 = sc.nextInt();
            int day4 = sc.nextInt();
            int day5 = sc.nextInt();
            int day6 = sc.nextInt();
            int day7 = sc.nextInt();
            
            int[] days = {day1, day2, day3, day4, day5, day6, day7};

            int sunny = 0;
            int rainy = 0;
            for (int j = 0; j < 7; j++) {
                if(days[j] == 1){
                    sunny++;
                }
                else{
                    rainy++;
                }
            }
            
            if(sunny > rainy){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}


//! Circular Track: 838
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i <  cases ; i++) {
            int initialPoint = sc.nextInt();
            int finalPoint = sc.nextInt();
            int totalLength = sc.nextInt();

            int clockwise = 0;
            int antiClockwise = 0;
            // Clockwise
            if(initialPoint <= finalPoint){
                System.out.println(Math.min(finalPoint - initialPoint, totalLength - finalPoint + initialPoint));
            }
            else{
                System.out.println(Math.min(initialPoint - finalPoint , totalLength - initialPoint + finalPoint));
            }


        }
    }
}


// Grade The Steel: 838
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i <  cases ; i++) {
            double hardness = sc.nextDouble();
            double carbonContent = sc.nextDouble();
            double tensile = sc.nextDouble();

            boolean condition1 = hardness > 50;
            boolean condition2 = carbonContent < 0.7 ;
            boolean condition3 = tensile > 5600 ;


            if(condition1 && condition2 && condition3){
                System.out.println(10);
            }
            else if(condition1 && condition2){
                System.out.println(9);
            }
            else if(condition2 && condition3){
                System.out.println(8);
            }
            else if(condition1 && condition3){
                System.out.println(7);
            }
            else if(condition1 || condition2 || condition3){
                System.out.println(6);
            }
            else{
                System.out.println(5);
            }


        }
    }
}


// Smallest Numbers of Notes: 839
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i <  cases ; i++) {
            int totalAmount = sc.nextInt();

            int[] arr = {100, 50, 10, 5, 2, 1};
            int iterator = 0;

            int notes = 0;

            while(totalAmount > 0){
                    notes += totalAmount/arr[iterator];
                    totalAmount = totalAmount % arr[iterator];
                    iterator++;
            }

            System.out.println(notes);


        }
    }
}


// Is it a VOWEL or CONSONANT: 840
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            String character = sc.next();

            char[] vowels = {'A', 'E', 'I', 'O', 'U'};

            boolean isVowel = false;

            for (int j = 0; j < 5; j++) {
                if(character.charAt(0) == vowels[j]){
                    isVowel = true;
                }
            }

            if(isVowel){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }


    }
}

// Which Mixture: 841
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int solid = sc.nextInt();
            int liquid = sc.nextInt();

            if(solid > 0 && liquid > 0){
                System.out.println("Solution");
            }
            else if(solid == 0){
                System.out.println("Liquid");
            }
            else{
                System.out.println("Solid");
            }
        }

    }
}


// Id and Ship: 847
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String character = sc.next();

            char firstChar = character.charAt(0);
            if(firstChar == 'B' || firstChar == 'b'){
                System.out.println("BattleShip");
            }
            else if(firstChar == 'C' || firstChar == 'c'){
                System.out.println("Cruiser");
            }
            else if(firstChar == 'D' || firstChar == 'd'){
                System.out.println("Destroyer");
            }
            else if(firstChar == 'F' || firstChar == 'f'){
                System.out.println("Frigate");
            }
        }

    }
}


// Equal Integers: 852

/* TIME LIMIT EXCEED
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            if(first <= second){
                System.out.println(second - first); // this is because X = X + 1
            }
            else{
                int iteration = 0;
                while(second < first){
                    second = second + 2;
                    iteration++;
                }

                if(first == second){
                    System.out.println(iteration);
                }
                else{
                    System.out.println( iteration + (second - first));
                }

            }

        }

    }
}

*/

import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            if(first <= second){
                System.out.println(second - first); // this is because X = X + 1
            }
            else{
                if((first - second) % 2 == 0){ 
                    System.out.println((first - second) / 2);
                }
                else{
                    System.out.println((first - second) / 2 + 2); // 22.5 => 22 + 2 = 24 operations
                }

            }

        }
    }
}


// Summer Heat: 852
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int cocunutWater = sc.nextInt();
            int cocunutPulp = sc.nextInt();
            int doctorWaterAdvice = sc.nextInt();
            int doctorPulpAdvice = sc.nextInt();

            double water = Math.ceil((double) doctorWaterAdvice / (double) (cocunutWater));
            double pulp = Math.ceil((double) doctorPulpAdvice / (double) (cocunutPulp));

            System.out.println( (int)(water+pulp) );
        }

    }
}

// Chef and Vacation Transportation: 855
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int flight = sc.nextInt();
            int bus = sc.nextInt();
            int train = sc.nextInt();

            if((flight + bus) == train){
                System.out.println("EQUAL");
            }
            else if(train < (flight + bus)){
                System.out.println("TRAIN");
            }
            else{
                System.out.println("PLANEBUS");
            }

        }

    }
}

// Chefland Visa: 857
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int problemCondition = sc.nextInt();
            int problemPlayer = sc.nextInt();

            int ratingCondition = sc.nextInt();
            int ratingPlayer = sc.nextInt();

            int submissionCondition = sc.nextInt();
            int submissionPlayer = sc.nextInt();


            boolean condition = (problemPlayer >= problemCondition) && (ratingPlayer >= ratingCondition) && (submissionPlayer <= submissionCondition);

            if(condition){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Area OR Perimeter: 858

import java.util.Scanner;
class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            int length = sc.nextInt();
            int breadth = sc.nextInt();

            int area = length * breadth;
            int peri = 2*(length+breadth);
            if(area > peri){
                System.out.println("Area");
                System.out.println(area);
            }
            else if(peri > area){
                System.out.println("Peri");
                System.out.println(peri);
            }
            else{
                System.out.println("Eq");
                System.out.println(area); // "perimeter" also works
            }
    }
}

// Devendra and Water Sports: 859
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int initialMoney = sc.nextInt();
            int spent = sc.nextInt();

            int rideA = sc.nextInt();
            int rideB = sc.nextInt();
            int rideC = sc.nextInt();

            int moneyLeft = initialMoney - spent;

            if((rideA + rideB + rideC) <= moneyLeft){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }

        }

    }
}


// Highest Divisor: 860
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int number = sc.nextInt();

            for (int j = 10; j > 0 ; j--) {
                if(number % j == 0){
                    System.out.println(j);
                    break;
                }

            }
    }
}


// Construct N: 860
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();
            if( number/ 2 > 0 || number/7 > 0){
                if(number % 2 == 0 || number % 7 == 0){
                    System.out.println("YES");
                }
                else{
                    if(number / 7 > 0){
                        for (int j = 1; j < (number/7)+1 ; j++) {
                            if ((number - (7 * j)) % 2 == 0) {
                                Codechef.answer = "YES";
                                break;
                            }
                        }

                        System.out.println(Codechef.answer);

                    }
                    else{
                        System.out.println("NO");
                    }

                }
            }
            else{
                System.out.println("NO");
            }

        }

    }
}


// Car Choice: 861
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int diesel = sc.nextInt();
            int petrol = sc.nextInt();
            int dieselPrice = sc.nextInt();
            int petrolPrice = sc.nextInt();

            double dieselCarCost = (double)diesel / dieselPrice;
            double petrolCarCost = (double)petrol / petrolPrice;

            if(petrolCarCost == dieselCarCost){
                System.out.println(0);
            }
            else if(petrolCarCost < dieselCarCost){
                System.out.println(-1);
            }
            else{
                System.out.println(1);
            }
        }

    }
}


// Which Division: 867
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int rating = sc.nextInt();

            if(rating >= 2000){
                System.out.println(1);
            }
            else if(rating >= 1600){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }

    }
}


// Badminton Serves: 869
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int pointsAtEnd = sc.nextInt();

            System.out.println((pointsAtEnd/2)+1);
        }

    }
}


// Chef and Contest: 872
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefTime = sc.nextInt();
            int chefinaTime = sc.nextInt();
            int chefWrong = sc.nextInt();
            int chefinaWrong = sc.nextInt();

            int chefTotalTime = chefTime + chefWrong*10;
            int chefinaTotalTime = chefinaTime + chefinaWrong*10;

            if(chefTotalTime == chefinaTotalTime){
                System.out.println("Draw");
            }
            else if(chefTotalTime < chefinaTotalTime){
                System.out.println("Chef");
            }
            else{
                System.out.println("Chefina");
            }

        }

    }
}


// Odds and Evens: 872
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int fingers1 = sc.nextInt();
            int fingers2 = sc.nextInt();

            if( (fingers1+fingers2) % 2 == 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }

    }
}


// Group Assignment: 872
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int groups = sc.nextInt();
            int chefRollNumber = sc.nextInt();

            System.out.println(2*groups - (chefRollNumber-1));
        }

    }
}


// Relativity: 872
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int gravity = sc.nextInt();
            int velocity = sc.nextInt();
            
            // h = (v*v)/2*g

            System.out.println((velocity*velocity)/(2*gravity));
        }

    }
}


// Counting Pretty Numbers: 873
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int left = sc.nextInt();
           int right = sc.nextInt();

           char[] characters = {'2', '3', '9'};

           int count = 0;
           for (int j = left; j < right+1; j++) {
               String s = String.valueOf(j);

               for (int k = 0; k < 3; k++) {
                   if (s.charAt(s.length() - 1) == characters[k]) {
//                       System.out.println(s.charAt(s.length() - 1));
                       count++;
                   }
               }
           }
            System.out.println(count);
        }

    }
}


// Drunk Alcoholic: 874
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int totalSeconds = sc.nextInt();
           
           int steps = 0;
           
           for (int j = 0; j < totalSeconds; j++) {
               if(j%2 == 0){
                   steps+=3;
               }
               else{
                   steps--;
               }
           }

            System.out.println(steps);
        }
    }
}


// Chef On Island: 878
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int food = sc.nextInt();
            int water = sc.nextInt();
            int foodPerDay = sc.nextInt();
            int waterPerDay = sc.nextInt();
            int days = sc.nextInt();

            int totalFood = days*foodPerDay;
            int totalWater = days*waterPerDay;

            if(food >= totalFood && water >= totalWater){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }

    }
}


// Find the Direction: 880
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int second = sc.nextInt();
            
            String[] directions = {"North", "East", "South", "West"};

            int iterator = 0;
            for (int j = 0; j < second; j++) {
                if(iterator == 3){
                    iterator = -1;
                }
                iterator++;
            }

            System.out.println(directions[iterator]);
        }

    }
}


// Farmers League: 883  
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int teams = sc.nextInt();

            int winningTeam = 3*(teams-1);

            int secondPlace;

            if((teams - 2)%2 == 0){
                secondPlace = ((teams - 2)/2)*3;
            }
            else{
                secondPlace = ((teams - 2 + 1)/2)*3;
            }

            System.out.println(winningTeam - secondPlace);

        }

    }
}


// Utkarsh and Placement tests: 886
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String company1 = sc.next();
            String company2 = sc.next();
            String company3 = sc.next();

            String acceptance1 = sc.next();
            String acceptance2 = sc.next();

            String[] companies = {company1, company2, company3};

            int index1 = 0;
            int index2 = 0;

            for (int j = 0; j < 3; j++) {
                if(acceptance1.equals(companies[j])){
                    index1 = j;
                }
                if(acceptance2.equals(companies[j])){
                    index2 = j;
                }
            }

            System.out.println((index1 > index2) ? companies[index2] : companies[index1]);
        }

    }
}

//^ Solution-2
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            char company1 = sc.next().charAt(0);
            char company2 = sc.next().charAt(0);
            char company3 = sc.next().charAt(0);

            char acceptance1 = sc.next().charAt(0);
            char acceptance2 = sc.next().charAt(0);

            if(acceptance1 == company1 || acceptance2 == company1){
                System.out.println(company1);
            }
            else if(acceptance1 == company2 || acceptance2 == company2){
                System.out.println(company2);
            }

           


        }

    }
}


// Secret Recipe: 888
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefPositon = sc.nextInt();
            int kefaPositon = sc.nextInt();
            int receipePositon = sc.nextInt();
            

            int chefSpeed = sc.nextInt();
            int kefaSpeed = sc.nextInt();

            int chefDistance = Math.abs(chefPositon - receipePositon);
            int kefaDistance = Math.abs(receipePositon - kefaPositon);


            // Time = Distance/Speed
            double chefTime = (double) chefDistance/chefSpeed;
            double kefaTime = (double) kefaDistance/kefaSpeed;

            if(chefTime < kefaTime){
                System.out.println("Chef");
            }
            else if (kefaTime < chefTime) {
                System.out.println("Kefa");
            }
            else{
                System.out.println("Draw");
            }


        }

    }
}


// Chef and Profits: 889
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int stocks = sc.nextInt();
           int buyingPrice = sc.nextInt();
           int sellingPrice = sc.nextInt();

            System.out.println(stocks*(sellingPrice-buyingPrice));

        }

    }
}


// Chef on Vacation: 891
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int familyDays = sc.nextInt();
            int friendsDays = sc.nextInt();
            int vacation = sc.nextInt();

            if(vacation >= familyDays+friendsDays){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}


// Olympics Ranking: 893
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            // Team-1
            int gold1 = sc.nextInt();
            int silver1 = sc.nextInt();
            int bronze1 = sc.nextInt();

            // Team-2
            int gold2 = sc.nextInt();
            int silver2 = sc.nextInt();
            int bronze2 = sc.nextInt();

            int team1 = gold1+silver1+bronze1;
            int team2 = gold2+silver2+bronze2;

            if(team1 > team2){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }

    }
}


// Chef and the Hair Salon: 895
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int customers = sc.nextInt();
            int time = sc.nextInt();

            System.out.println(customers*time);
        }

    }
}


// Inside The Stadium: 895
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int balls = sc.nextInt();

            int perfect100 = 0;
            int runsAfterBall = 0;
            for (int j = 1; j < balls+1; j++) {
                int runs = sc.nextInt();
                runsAfterBall += runs;
                if(((double)runsAfterBall / j)*100 == 100){
                    perfect100++;
                }


            }
            System.out.println(perfect100);
        }

    }
}


// Chef and SnackDown: 895
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int year = sc.nextInt();

            if(year == 2010 || year == 2015 || year == 2016 || year == 2017 || year == 2019){
                System.out.println("HOSTED");
            }
            else{
                System.out.println("NOT HOSTED");
            }
        }

        sc.close();

    }
}


// Peaceful Party: 898
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int populationA = sc.nextInt();
            int populationB = sc.nextInt();
            int populationC = sc.nextInt();

            if (populationB > (populationA+populationC)){
                System.out.println(populationB);
            }
            else{
                System.out.println(populationA+populationC);
            }
        }

        sc.close();

    }
}


//! Chef and Battery: 901
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int currentBattery = sc.nextInt();

            int count = 0;

            while (currentBattery !=50){
                if(currentBattery < 50){
                    currentBattery +=2;
                }
                else{
                    currentBattery-=3;
                }
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}





// Passing Marks: 904
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int Amin = sc.nextInt();
            int Bmin = sc.nextInt();
            int Cmin = sc.nextInt();
            int Tmin = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if((A >= Amin && B >= Bmin && C >= Cmin) && (A+B+C >= Tmin)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();

    }
}


// Count the Holidays: 907
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int festivalTotal = sc.nextInt();

            int holidaysPerMonths = 8;
            for (int j = 0; j < festivalTotal; j++) {
                int day = sc.nextInt();

                if(!(day%7 == 6 || day%7 == 0 )){
                    holidaysPerMonths++;
                }
            }

            System.out.println(holidaysPerMonths);
        }

        sc.close();

    }
}


// Avoid Contact: 907
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int total = sc.nextInt();
            int chickenpox = sc.nextInt();

            if(total == chickenpox){
                System.out.println(total+chickenpox-1);
            }
            else{
                System.out.println(total+chickenpox);
            }
        }

        sc.close();

    }
}


// Problem: 908
import java.util.Scanner;

class Codechef {

    public  static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int alice = sc.nextInt();
            int bob = sc.nextInt();

            if(Math.abs(alice-bob)%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();

    }
}


// HOW MANY DIGITS DO I HAVE: 908
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int number = sc.nextInt();

            int count = 0;
            while (number > 0){
                count++;
                number = number/10;
            }


            if(count > 3){
                System.out.println("More than 3 digits");
            }
            else{
                System.out.println(count);
            }

        sc.close();

    }
}


// Two Ranges: 918
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int range1Start = sc.nextInt();
            int range1End = sc.nextInt();
            int range2Start = sc.nextInt();
            int range2End = sc.nextInt();

            int[] arr = new int[range1End - range1Start + 1];

            int x = 0;
            for (int j = range1Start; j < range1End + 1; j++) {
                arr[x] = j;
                x++;

            }

            int repeat = 0;
            for (int j = range2Start; j < range2End + 1; j++) {
                {
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == j) {
                            repeat++;
                        }
                    }
                }

            }

            System.out.println(arr.length + (range2End-range2Start+1) - repeat);


        }
        sc.close();
    }
}


// Penalty Shots: 925
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();
            int A4 = sc.nextInt();
            int A5 = sc.nextInt();
            int A6 = sc.nextInt();
            int A7 = sc.nextInt();
            int A8 = sc.nextInt();
            int A9 = sc.nextInt();
            int A10 = sc.nextInt();

            int team1 = A1+A3+A5+A7+A9;
            int team2 = A2+A4+A6+A8+A10;

            if(team1 == team2){
                System.out.println(0);
            }
            else if(team1 > team2) {
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }


        }
        sc.close();
    }
}

// Shoe Fit: 925
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int shoe1 = sc.nextInt();
            int shoe2 = sc.nextInt();
            int shoe3 = sc.nextInt();
            
            if((shoe1 == 0 || shoe2 == 0 || shoe3 == 0) && (shoe1 == 1 || shoe2 == 1 || shoe3 == 1)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
            


        }
        sc.close();
    }
}


// Chef and Pairing Slippers: 930
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int total = sc.nextInt();
            int left = sc.nextInt();
            int price = sc.nextInt();

            int right = total - left;

            System.out.println(price*(Math.min(left, right)));

        }
        sc.close();
    }
}


// Chef and Price Control: 931
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int numberOfItem = sc.nextInt();
            int government = sc.nextInt();

            int initialRevenue = 0;
            int reductionRevenue = 0;
            for (int j = 0; j < numberOfItem; j++) {
                int item = sc.nextInt();
                initialRevenue += item;
                
                if(item <= government){
                    reductionRevenue += item;
                }
                else{
                    reductionRevenue+= government;
                }
            }

            System.out.println(initialRevenue - reductionRevenue);


        }
        sc.close();
    }
}


// Akash and Missing Class: 931
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int days = sc.nextInt();

//            int holiday = 0;
//            for (int j = 1; j < days+1; j++) {
//                if(j%7 == 6){
//                    holiday++;
//                }
//            }

            if(days <= 6){
                System.out.println(1);
            }
            else {
                System.out.println((days / 7));
            }


        }
        sc.close();
    }
}


// No Time to Wait: 932
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           int timeZones = sc.nextInt();
           int timeToSolve = sc.nextInt();
           int remainingTime = sc.nextInt();

           String solve = "NO";
            for (int j = 0; j < timeZones ; j++) {
                int time = sc.nextInt();
                if(remainingTime+time >=timeToSolve){
                    solve = "YES";
                    break;
                }
            }
            System.out.println(solve);
        sc.close();
    }
}


// First and Last: 932
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int lengthOfArray = sc.nextInt();

           int[] arr = new int[lengthOfArray];

            for (int j = 0; j < lengthOfArray; j++) {
                int num = sc.nextInt();
                arr[j] = num;
            }


            int highest = 0;

            int iteration = 0;
            while(iteration < lengthOfArray){
                if(iteration+1 < lengthOfArray){
                    if(arr[iteration] + arr[iteration+1] > highest){
                        highest = arr[iteration] + arr[iteration+1];
                    }
                }
                else{
                    int value = arr[iteration] + arr[0];
                    if(value > highest){
                        highest = value;
                    }
                }

                iteration++;
            }

            System.out.println(highest);
        }
        sc.close();
    }
}


// Back to Campus: 933
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int totalStudents = sc.nextInt();
           int perDay = sc.nextInt();

            System.out.println((int)(Math.ceil((double) totalStudents / perDay)));

        }
        sc.close();
    }
}


// World Chess Championship: 935
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int X = sc.nextInt();
           String matches = sc.next();


           int charlsenPoints = 0;
           int chefPoints = 0;

           for (int j = 0; j < matches.length(); j++) {
                if(matches.charAt(j) == 'C'){
                    charlsenPoints+=2;
                }
                else if(matches.charAt(j) == 'N'){
                    chefPoints+=2;
                }
                else{
                    charlsenPoints++;
                    chefPoints++;
                }
           }

           if(charlsenPoints == chefPoints){
               System.out.println(55*X);
           } else if (charlsenPoints > chefPoints) {
               System.out.println(60*X);
           }
           else{
               System.out.println(40*X);
           }




        }
        sc.close();
    }
}


//* Concept
// Two vs Ten: 936
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();

            if(number%10 == 0){
                System.out.println(0);
            }
            else if ( number % 5 == 0 ) {
                System.out.println(1);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}


// Car Range: 938
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int people = sc.nextInt();
           int baseMileage = sc.nextInt();
           int currentFuel = sc.nextInt();
           
           int peopleExceptDrive = people -1;

            System.out.println((baseMileage - peopleExceptDrive)*currentFuel);
           
        }
        sc.close();
    }
}


// Am I Lucky!: 941
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int total = sc.nextInt();
            int boys = sc.nextInt();
            int groupSize = sc.nextInt();

            int girls = total - boys;

            int remainingBoys = boys%groupSize;
            int remainingGirls = girls%groupSize;

            if(remainingBoys != 0 && remainingGirls!=0){
                System.out.println(Math.abs(remainingBoys-remainingGirls));
            }
            else{
                System.out.println(remainingBoys + remainingGirls);
            }


        }
        sc.close();
    }
}


// Janmansh at Fruit Market: 947
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalFruits = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int[] arr = {A,B,C};
            Arrays.sort(arr);

            System.out.println((arr[0]*(totalFruits-1)) + arr[1]);


        }
        sc.close();
    }
}


// Non-Negative Product: 948
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
          int arrayLength = sc.nextInt();


          int countNegative = 0;

          boolean present0 = false;
          int[] arr = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                int element = sc.nextInt();
                arr[j] = element;

                if(element == 0){
                    present0 = true;
                }
                else if(element < 0){
                    countNegative++;
                }
            }

            if(countNegative % 2 == 0 || present0){
                System.out.println(0);
            }
            else{
                System.out.println(countNegative%2);
            }

        }
        sc.close();
    }
}


// Rearranging digits to get a multiple of 5: 949
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int numberOfDigits = sc.nextInt();
            String number = sc.next();

            boolean divisibleBy5 = false;
            for (int j = 0; j < numberOfDigits; j++) {
                if(number.charAt(j) == '0' || number.charAt(j) == '5'){
                    divisibleBy5 = true;
                    break;
                }
            }

            if(divisibleBy5){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}


// Marathon: 955
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int days = sc.nextInt();;
            int kmPerDay = sc.nextInt();
            int Aprice = sc.nextInt();
            int Bprice = sc.nextInt();
            int Cprice = sc.nextInt();

            int totalDistance = days * kmPerDay;

            if(totalDistance >= 42){
                System.out.println(Cprice);
            }
            else if(totalDistance >= 21){
                System.out.println(Bprice);
            }
            else if(totalDistance >= 10){
                System.out.println(Aprice);
            }
            else{
                System.out.println(0);
            }

        }
        sc.close();
    }
}


// La Liga: 956
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String name1 = sc.next();
            int score1 = sc.nextInt();
            String name2 = sc.next();
            int score2 = sc.nextInt();
            String name3 = sc.next();
            int score3 = sc.nextInt();
            String name4 = sc.next();
            int score4 = sc.nextInt();

            String[] names = {name1, name2, name3, name4};
            int[] scores = {score1, score2, score3, score4};


            int RealMadrid = 0;
            int Malaga = 0;
            int Barcelona = 0;
            int Eibar = 0;

            for (int j = 0; j < names.length ; j++) {
                if(names[j].equals("RealMadrid")){
                    RealMadrid = scores[j];
                }
                else if(names[j].equals("Malaga")){
                    Malaga = scores[j];
                }
                else if(names[j].equals("Barcelona")){
                    Barcelona = scores[j];
                }
                else if(names[j].equals("Eibar")){
                    Eibar = scores[j];
                }
            }

            if(RealMadrid < Malaga && Barcelona > Eibar){
                System.out.println("Barcelona");
            }
            else{
                System.out.println("RealMadrid");
            }
        }
        sc.close();
    }
}


// Chef and Cook-Off: 961
import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int problem1 = sc.nextInt();
            int problem2 = sc.nextInt();
            int problem3 = sc.nextInt();
            int problem4 = sc.nextInt();
            int problem5 = sc.nextInt();

            int sum = problem1+problem2+problem3+problem4+problem5;

            if(sum == 5){
                System.out.println("Jeff Dean");
            }
            else if (sum == 4) {
                System.out.println("Hacker");
            }
            else if(sum == 3){
                System.out.println("Senior Developer");
            }
            else if(sum == 2){
                System.out.println("Middle Developer");
            }
            else if(sum == 1){
                System.out.println("Junior Developer");
            }
            else{
                System.out.println("Beginner");
            }

        }
        sc.close();
    }
}


// Judging Delay: 964
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int inputs = sc.nextInt();
            int count = 0;

            for (int j = 0; j < inputs ; j++) {
                int submission = sc.nextInt();
                int judge = sc.nextInt();

                if(judge - submission > 5){
                    count++;
                }
            }

            System.out.println(count);

        }
        sc.close();
    }
}


// Cricket Ranking: 966
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int run1 = sc.nextInt();
            int wicket1 = sc.nextInt();
            int catches1 = sc.nextInt();

            int run2 = sc.nextInt();
            int wicket2 = sc.nextInt();
            int catches2 = sc.nextInt();

            int[] player1 = {run1, wicket1, catches1};
            int[] player2 = {run2, wicket2, catches2};


            int player1Score = 0;
            int player2Score = 0;


            for (int j = 0; j <3 ; j++) {
                if(player1[j] >= player2[j]){
                    player1Score++;
                }
                else{
                    player2Score++;
                }
            }

            if(player1Score >   player2Score){
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }

        }
        sc.close();
    }
}




//! Joining Date: 970
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int total = sc.nextInt();
            int candidatePosition = sc.nextInt();


            int totalGroup = total/5 + (total%5 ==0 ? 0 : 1 );
            int candidateGroup = candidatePosition/5 + (candidatePosition%5 == 0 ? 0 : 1 );

            System.out.println(totalGroup-candidateGroup);

        }
        sc.close();
    }
}


// Play Piano: 980
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int totalDays = sc.nextInt();


            for (int j = 0; j <  totalDays; j++) {
                boolean answer = true;
                String value = sc.next();

                for (int k = 0; k < value.length(); k = k+2) {
                    if(
                        (value.charAt(k) == 'A' && value.charAt(k+1) == 'A') ||
                        (value.charAt(k) == 'B' && value.charAt(k+1) == 'B')
                    ){
                        answer = false;
                        break;
                    }

                }

                if(answer){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
        }
        sc.close();
    }
}


// Malvika is peculiar about color of balloons: 988
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBalloons = sc.nextInt();


        for (int j = 0; j <  totalBalloons; j++) {
            String str = sc.next();

            int amber = 0;
            int brass = 0;
            for (int i = 0; i < str.length() ; i++) {
                if(str.charAt(i) == 'a'){
                    amber++;
                }
                else{
                    brass++;
                }
            }

            System.out.println(Math.min(amber,brass));

        }


        sc.close();
    }
}


// Game between friends: 991
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int nitin = sc.nextInt();
            int sobhagya = sc.nextInt();
            int ritik = sc.nextInt();
            int satyarth = sc.nextInt();

            if(sobhagya > nitin){
                nitin +=ritik;
            }
            else{
                sobhagya+=ritik;
            }


            if(sobhagya > nitin){
                nitin +=satyarth;
            }
            else{
                sobhagya+=satyarth;
            }


            if(sobhagya > nitin){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }

        }
        sc.close();
    }
}


// Keplers Law: 992
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();

            // Cross-multiplication
            if( (T1*T1*R2*R2*R2) == (T2*T2*R1*R1*R1)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}


// Kitchen Timetable: 997
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int students = sc.nextInt();

            int[] time = new int[students+1];

            time[0] = 0;

            int[] required = new int[students];


            for (int j = 0; j < students; j++) {
                int studentTime = sc.nextInt();
                time[j+1] = studentTime;
            }
            for (int j = 0; j < students; j++) {
                int requiredTime = sc.nextInt();
                required[j] = requiredTime;
            }


            int count = 0;
            for (int j = 0; j < students ; j++) {
                if(time[j+1] - time[j] >= required[j]){
                    count++;
                }

            }
            System.out.println(count);
        }


        sc.close();
    }
}


// Bear and Ladder: 999
