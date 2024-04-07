// Greater Average: 500
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if( ( (float)a + (float)b )/2.0 > c  ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}

// Subscriptions: 504
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // size
            int X = sc.nextInt(); // price

            int numberOfSub = N/6;

            if(N%6!=0){
                numberOfSub++;
            }

            System.out.println(numberOfSub*X);
        }

    }
}


// Janmansh and Assignments: 513
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // starting time

            if(X+3 <= 10){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}


// Exams: 519
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // schools
            int Y = sc.nextInt(); //  student
            int Z = sc.nextInt(); // total pass


            double passingCriteria = (X*Y)*0.5;

            if(Z > passingCriteria) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}


// Chef in his Office: 532 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            int regular = sc.nextInt();
            int friday = sc.nextInt();
            System.out.println(regular*4 + friday);

        }


    }
}



// Mahasena: 533
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

        int totalValues = sc.nextInt();

        int[] values = new int[totalValues];

        for (int i = 0; i < totalValues; i++) {
            int input = sc.nextInt();
            values[i] = input;
        }

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < values.length ; i++) {
            if(values[i]%2==0){
                sumOfEven++;
            }else{
                sumOfOdd++;
            }
        }

        if (sumOfEven > sumOfOdd) {
            System.out.println("READY FOR BATTLE");
        }else{
            System.out.println("NOT READY");
        }


    }
}


// CRED Coins: 539
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

       int totalCases = sc.nextInt();

        for (int i = 0; i < totalCases; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println((X*Y)/100);

        }


    }
}


// Water Filling: 541
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

       int totalCases = sc.nextInt();

        for (int i = 0; i < totalCases; i++) {
            int bottle1 = sc.nextInt();
            int bottle2 = sc.nextInt();
            int bottle3 = sc.nextInt();
            int[] arr = {bottle1, bottle2, bottle3};

            int sum =0;
            for (int j = 0; j < 3 ; j++) {
                if(arr[j]==1){
                    sum++;
                }
            }

            if(sum>=2){
                System.out.println("Not now");
            }else{
                System.out.println("Water filling time");
            }

        }


    }
}



// Sale Season: 541
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

        int totalCases = sc.nextInt();

        for (int i = 0; i < totalCases; i++) {
            int price = sc.nextInt();
            if(price<=100){
                System.out.println(price);
            }else if(price<=1000) {
                System.out.println(price-25);
            } else if (price<=5000) {
                System.out.println(price-100);
            } else if (price > 5000) {
                System.out.println(price-500);
            }
        }




    }
}


// Minimum Pizzas: 546
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);

        int totalCases = sc.nextInt();

        for (int i = 0; i < totalCases; i++) {
            int numberOfFriend = sc.nextInt();
            int slicesPerFriend = sc.nextInt();

            int totalSlices = numberOfFriend*slicesPerFriend;

            int pizza = totalSlices/4;

            if(totalSlices%4!=0){
                pizza++;
            }
            System.out.println(pizza);

        }






    }
}


// Chefland Games: 550
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();

            if(num1==0 && num2==0 && num3==0 && num4==0){

                System.out.println("IN");
            }else{
                System.out.println("OUT");
            }

        }

    }
}


// Expert Setter: 561
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int totalCases = sc.nextInt();
        for (int i = 0; i < totalCases ; i++) {
            int total = sc.nextInt();
            int approved = sc.nextInt();
            if((approved >= (float)total /2.0)  ){

                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}


// Chef and NextGen: 562
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int totalCases = sc.nextInt();
        for (int i = 0; i < totalCases ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if((X*Y) >= A*B){

                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}



// Sugarcane Juice Business: 563
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int totalCases = sc.nextInt();
        for (int i = 0; i < totalCases ; i++) {
            int N  = sc.nextInt();
            int total = N * 50;
            int profit = (int)((double)total - (0.7 * (double) total));
            System.out.println(profit);

        }

    }
}


//Count the Notebooks
public static void main (String[] args) throws java.lang.Exception
{
    Scanner sc = new Scanner(System.in);


//        1 kg = 1000 pages = 10 notebooks
//        N kg = N * 10 notebooks


    int totalCases = sc.nextInt();
    for (int i = 0; i < totalCases ; i++) {
        int N  = sc.nextInt();
        System.out.println(N*10);

    }

}




// Chef and Candies: 570
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int totalCases = sc.nextInt();
        for (int i = 0; i < totalCases ; i++) {
            int N  = sc.nextInt();
            int X = sc.nextInt();
            if(X > N ) {
                System.out.println(0);
            }else{
                int candiesNeeded = N - X;
                double numberOfPackets = Math.ceil((double)candiesNeeded/4);
                System.out.println((int)numberOfPackets);
            }


        }

    }
}


// Car or Bus
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int bikeX = sc.nextInt();
            int carY = sc.nextInt();
            if(bikeX < carY){
                System.out.println("BIKE");
            }else if(carY < bikeX){
                System.out.println("CAR");
            }else{
                System.out.println("SAME");
            }


        }

    }
}


// Is the Score Consistent
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int initialA = sc.nextInt();
           int initialB = sc.nextInt();
           int finalC = sc.nextInt();
           int finalD = sc.nextInt();

           if(finalC >= initialA && finalD >=initialB){
               System.out.println("POSSIBLE");
           }
           else{
               System.out.println("IMPOSSIBLE");
           }

        }

    }
}


// The Three Topics

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        
           int topicA = sc.nextInt();
           int topicB = sc.nextInt();
           int topicC = sc.nextInt();
           int X = sc.nextInt();

           if(X== topicA || X==topicB || X==topicC){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }

        

    }
}


// Monopoly

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();
        

        for (int i = 0; i < cases; i++) {

            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            if(P > (Q+R+S) || Q > (P+R+S) || R > (P+Q+S) || S > (P+Q+R)){

                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


/*
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();
        int P= sc.nextInt();
        int Q= sc.nextInt();
        int R= sc.nextInt();
        int S= sc.nextInt();


        int[] profits = {P,Q,R,S};
        String answer = "NO";
        for (int i = 0; i < cases; i++) {

            for (int k = 0; k < profits.length ; k++) {
                int value = profits[k];

                int sum =0;
                for (int j = 0; j < 4 ; j++) {
                    sum+= profits[j];
                }
                int subtractValue = sum-value;

                if(value>subtractValue){
                    answer = "YES";
                }
            }
            System.out.println(answer);
            answer = "NO";
        }

    }
}
*/


// Problems in your to-do list
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int numberOfValues = sc.nextInt();
            int sum=0;
            for (int j = 0; j < numberOfValues; j++) {

                int value = sc.nextInt();  // Taking 1 input at a time => checking if it is greater than 1000
                if(value>=1000){
                    sum++;
                }

            }
            System.out.println(sum);

        }

    }
}




// Air Conditioner Temperature: 584
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            int value3 = sc.nextInt();
            
            int largestValue = (value1 > value3) ? value1 : value3;
//            int largestValue = Math.max(value1,value2);
            if(value2 >= largestValue){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }

    }
}


// Nearest Exit: 585
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
           int seatNumber = sc.nextInt();
           if(seatNumber<=50){
               System.out.println("LEFT");
           }
           else{
               System.out.println("RIGHT");
           }

        }

    }
}

//! Reverse The Number
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();
            int reverse = 0;

             while(number!=0){
                 int remainder = number%10;
                 reverse = reverse*10+remainder;
                 number = number/10;
             }

            System.out.println(reverse);


        }

    }
}


// Sasta Shark Tank: 592
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int amountA = sc.nextInt();
            int amountB = sc.nextInt();

            int valuationA = amountA*10;
            int valuationB = amountB*5;

            if(valuationA> valuationB){
                System.out.println("FIRST");
            } else if (valuationB > valuationA) {
                System.out.println("SECOND");
            }else{
                System.out.println("ANY");
            }
        }

    }
}

// Good Program
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int bit = sc.nextInt();

            if(bit%4==0){
                System.out.println("Good");
            }
            else{
                System.out.println("Not Good");
            }
        }

    }
}



// Qualify the round: 594
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
           int totalPointsNeeded = sc.nextInt();
           int easy = sc.nextInt();
           int hard = sc.nextInt();

           if((easy + hard*2) >= totalPointsNeeded){
               System.out.println("Qualify");
           }
           else{
               System.out.println("NotQualify");
           }
        }

    }
}

// Elections in Chefland: 604
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int totalPoulation = sc.nextInt();
            int minimumAgeToVote = sc.nextInt();
            int sum = 0;
            
            
            for (int j = 0; j < totalPoulation ; j++) {
                int age = sc.nextInt();
                if(age > minimumAgeToVote){
                    sum++;
                } 
            }

            System.out.println(sum);
        }
        

    }
}

// Minimum Cars required: 608
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            double numberOfFriends = sc.nextInt();

            System.out.println((int)Math.ceil(numberOfFriends/4));

        }


    }
}

// Test Score: 610
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int numberOfQuestion = sc.nextInt();
            int marksPerQuestion = sc.nextInt();
            int exactScoreRequired = sc.nextInt();


            String output = "NO";

            if(exactScoreRequired == 0){
                output = "YES";

            }else{
                for (int j = 1; j < numberOfQuestion+1 ; j++) {

                    if(j*marksPerQuestion == exactScoreRequired){
                        output = "YES";
                    }

                }


            }

            System.out.println(output);

        }
    }
}


// Jenga Night: 613
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int numberOfPlayers = sc.nextInt();
            int numberOfTiles = sc.nextInt();

            if(numberOfTiles%numberOfPlayers == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}


// Bus Seat Numbering: 613
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int seatNumber = sc.nextInt();

            if(seatNumber<= 15){
                if(seatNumber<=10){
                    System.out.println("Lower Double");
                }
                else{
                    System.out.println("Lower Single");
                }
            }
            else{
                if(seatNumber<=25){
                    System.out.println("Upper Double");
                }
                else{
                    System.out.println("Upper Single");
                }

            }

        }
    }
}

// Discus Throw: 622
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int throw1 = sc.nextInt();
            int throw2 = sc.nextInt();
            int throw3 = sc.nextInt();

            int maxBetweenFirstTwoValues = Math.max(throw1, throw2);

            System.out.println(Math.max(maxBetweenFirstTwoValues, throw3));

        }
    }
}

// Maximise the Tastiness: 627
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            int dish1 = A+C;
            int dish2 = A+D;
            int dish3 = B+C;
            int dish4 = B+D;

            int checkingTwo = Math.max(dish1,dish2);
            int checkingTwo2 = Math.max(dish3,dish4);
            System.out.println(Math.max(checkingTwo,checkingTwo2));


        }
    }
}



// Watching Movies at 2x: 628
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

           int totalMovieTime = sc.nextInt();
           int doubleSpeed = sc.nextInt();
           System.out.println( (totalMovieTime-doubleSpeed) +doubleSpeed/2);


    }
}


// Police and Thief: 639 => Need to see the Failed Result
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int policeLocation = sc.nextInt();
            int thiefLocation = sc.nextInt();

            int seconds = 0;
            if(thiefLocation < policeLocation){
                seconds = policeLocation - thiefLocation; // This was derived after looking at failed test
            }
            else{
                while (thiefLocation > policeLocation){
                    policeLocation = policeLocation + 2;
                    thiefLocation += 1;
                    seconds++;
                }
            }
            System.out.println(seconds);


        }
    }
}


// Flip the cards: 641
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int totalCards = sc.nextInt();
            int flipside = sc.nextInt();

            if(totalCards == flipside || flipside == 0){
                System.out.println(0);
            }
            else{
                int substactFlipCard = totalCards - flipside;
                if(substactFlipCard < flipside){
                    System.out.println(substactFlipCard);
                }
                else{
                    System.out.println(flipside);
                }
            }


        }
    }
}



// Bath in Winters: 643
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();




        for (int i = 0; i < cases; i++) {
            int peopleCanBath = 0;


           int water = sc.nextInt();
           int bucketCapacity = sc.nextInt();

           if(water < bucketCapacity*2){
               System.out.println(0);
           }
           else{
               int totalBucketPerPerson = bucketCapacity*2;
               while(totalBucketPerPerson <= water){
                   peopleCanBath++;
                   totalBucketPerPerson = totalBucketPerPerson + bucketCapacity*2; // This is tricky
               }
               System.out.println(peopleCanBath);
           }

        }
    }
}


// Finding Shoes: 646
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();




        for (int i = 0; i < cases; i++) {
            int numberOfFriends = sc.nextInt();
            int leftshoes = sc.nextInt();


            if(leftshoes < numberOfFriends){
                int count = 0;
                while(leftshoes < numberOfFriends){
                    count++;
                    leftshoes++;
                }
                System.out.println(count + numberOfFriends);


            }
            else{
                System.out.println(numberOfFriends);
            }
        }
    }
}


// Small factorials: 648
import java.math.BigInteger;
import java.util.*;
import java.lang.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();
            BigInteger factorial = BigInteger.valueOf(1);
            for (int j = 1; j <= number  ; j++) {
                factorial=factorial.multiply(BigInteger.valueOf(j)); // NEW CONCEPT
            }
            System.out.println(factorial);
        }
    }
}


// Mario and Transformation: 649
import java.math.BigInteger;
import java.util.*;
import java.lang.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int mushrooms = sc.nextInt();
            String[] arr = {"X", "HUGE", "SMALL", "NORMAL"};
            if(mushrooms > 0){
                int count = 0;
                for (int j = 1; j < mushrooms+1 ; j++) {
                    count++;
                    if(count== 4){
                        count = 1;
                    }
                }
                System.out.println(arr[count]);
            }else{
                System.out.println("NORMAL");
            }
        }
    }
}

// Mario and Bullet: 650
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int speedPerPixel = sc.nextInt();
            int standingPixel = sc.nextInt();
            int timeAfterMarioStartShouting = sc.nextInt();

            int calculateTime = standingPixel/speedPerPixel;
            if(calculateTime < timeAfterMarioStartShouting){
                System.out.println(timeAfterMarioStartShouting - calculateTime);
            }
            else{
                System.out.println(0);
            }

        }
    }
}

// Chess Ratings: 651
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int currentRating = sc.nextInt();
            int ratingToAchieve = sc.nextInt();

            int matches = 0;
            if(ratingToAchieve > currentRating){
                while (currentRating < ratingToAchieve) {
                    matches++;
                    currentRating = currentRating + 8;
                }
                System.out.println(matches);
            }
            else{
                System.out.println(matches);
            }

        }
    }
}


// Complementary Strand in a DNA: 660
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int length = sc.nextInt();
            String characters = sc.next();

            String output = "";
            for (int j = 0; j < length; j++) {
                if(characters.charAt(j) == 'A'){
                    output = output + "T";
                }
                else if (characters.charAt(j) == 'T') {
                    output = output + "A";
                }
                else if (characters.charAt(j) == 'C') {
                    output = output + "G";
                }
                else if (characters.charAt(j) == 'G') {
                    output = output + "C";
                }

            }
            System.out.println(output);

        }
    }
}


// Chef and Water Bottles: 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {

            int numberOfBottles = sc.nextInt();
            int capacityPerBottle = sc.nextInt();
            int waterInTank = sc.nextInt();

            int countBottle = 0;
            int countWater = 0;
            if(waterInTank > capacityPerBottle){
                while(numberOfBottles > countBottle){
                    if(waterInTank > countWater){
                        countBottle++;
                        countWater = countWater + capacityPerBottle;

                        // This is an Extra condition
                        // 63 60 632
                        // Eg: waterInTank = 632, countWater = 600 (after 10 bottle fill)
                        // Then it will run but the capacity is 60
                        // So it should stop
                        if (!(waterInTank - countWater > capacityPerBottle)){
                            countWater += capacityPerBottle;
                        }
                    }
                    else{
                        break;
                    }

                }
                System.out.println(countBottle);
            }
            else{
                System.out.println(countBottle);
            }
        }
    }
}


// Candy Distribution: 668
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int candies = sc.nextInt();
            int friends = sc.nextInt();

            if (candies % friends == 0) {
                if (candies / friends % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}


// Finding Square Roots: 668
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            double number = sc.nextInt();
            System.out.println((int) Math.sqrt(number));
        }
    }
}

// The Last Levels: 679
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int remainingLevel = sc.nextInt();
            int minutesPerLevel = sc.nextInt();
            int breakToBeTaken = sc.nextInt();


            int level = 3;
            int totalTime = remainingLevel * minutesPerLevel;
            if(remainingLevel > 2){
                while (level <= remainingLevel){
                    if(!(level == remainingLevel)){
                        totalTime = totalTime + breakToBeTaken;
                    }
                    level +=3;
                }
                System.out.println(totalTime);
            }
            else{
                System.out.println(totalTime);
            }
        }
    }
}


// Blackjack
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            if(number1 + number2 >=11){
                System.out.println(21 - (number1 + number2));
            }else{
                System.out.println(-1);
            }
        }
    }
}


// Fill Candies: 681
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int candies = sc.nextInt();
            int pocket = sc.nextInt();
            int capacity = sc.nextInt();

//            int totalCapacityPerBag = pocket * capacity;
            int fillingBag = 0;
            int bag = 0;
            while(fillingBag < candies){
                bag++;
                fillingBag = fillingBag + pocket* capacity;
            }
            System.out.println(bag);
        }
    }
}


// X Jumps: 686
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int totalStep = sc.nextInt();
            int stepCanBeTaken = sc.nextInt();

            int quotient = totalStep/ stepCanBeTaken;
//            System.out.println(quotient);
            int remainder = totalStep % stepCanBeTaken;
//            System.out.println(remainder);

            System.out.println(quotient+remainder);
        }
    }
}


// Chessboard Distance: 690
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
           int X1 = sc.nextInt();
           int Y1 = sc.nextInt();
           int X2 = sc.nextInt();
           int Y2 = sc.nextInt();

            System.out.println( Math.max( Math.abs(X1-X2), Math.abs(Y1-Y2)) );
        }
    }
}


// Valentine is Coming
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {     
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
           int moneyChefHave = sc.nextInt();
           int pricePerChocolate = sc.nextInt();

            System.out.println(moneyChefHave/pricePerChocolate);
        }
    }
}


// It is My Serve: 691
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
           int score1 = sc.nextInt();
           int score2 = sc.nextInt();
           int sum = score1 + score2;

           
            if((sum/2) % 2 == 0){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
           
               
        }
    }
}


// Water Mixing: 694
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int initialTemp = sc.nextInt();
            int finalTemp = sc.nextInt();
            int hot = sc.nextInt();
            int cold = sc.nextInt();


            if(finalTemp-initialTemp > 0){
                if(hot >= finalTemp-initialTemp){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(finalTemp-initialTemp < 0){
                if(cold >= Math.abs(finalTemp-initialTemp)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }

        }

    }
}


// Weights: 697
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int exactWeight = sc.nextInt();
            int scale1 = sc.nextInt();
            int scale2 = sc.nextInt();
            int scale3 = sc.nextInt();


            if(exactWeight == (scale1+scale2) || exactWeight == (scale2+scale3) || exactWeight == (scale3+scale1) || 
                    exactWeight==scale1 || exactWeight==scale2 || exactWeight==scale3 || exactWeight==(scale1+scale2+scale3)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }

    }
}

// Chef and his Apps: 702
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalStorage = sc.nextInt();

            int app1 = sc.nextInt();
            int app2 = sc.nextInt();
            int app3 = sc.nextInt();

            if(app1+app2+app3 <= totalStorage){
                System.out.println(0);
            }else{
                if(Math.min(app1,app2)+app3 <=totalStorage){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }

        }

    }
}


// Chef Eren: 706
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalEpisode = sc.nextInt();
            int evenEpisodeLength = sc.nextInt();
            int oddEpisodeLength = sc.nextInt();

            int length = 0;
            
            for (int j = 1; j < totalEpisode+1; j++) {
                if(j%2==0){
                    length+=evenEpisodeLength;
                }
                else{
                    length+=oddEpisodeLength;
                }
            }

            System.out.println(length);
            
        }
    }
}


// Minimum number of coins: 711
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int amount = sc.nextInt();

            int totalCoins = 0;

            if(amount%5==0){
                int tenQuotient = amount/10;
                int fiveQuotient = (amount%10)/5;
                System.out.println(tenQuotient+fiveQuotient);
            }
            else{
                System.out.println(-1);
            }
        }

    }
}


// Airlines: 712
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int days = sc.nextInt();
            int totalPassengers = sc.nextInt();

            int availablePassengers = days*100;

            if(availablePassengers < totalPassengers){
                int remaining = totalPassengers - availablePassengers;


                int flightRequired = 0;
                if(remaining%100 == 0){
                    flightRequired = remaining/100;
                }
                else{
                    flightRequired = remaining/100 + 1;
                }

                System.out.println(flightRequired);
            }
            else{
                System.out.println(0);
            }

        }

    }
}

//  Self Defence Training: 716
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {
      int totalWomen = sc.nextInt();

      int count = 0;
      for (int j = 0; j < totalWomen; j++) {
        int woman = sc.nextInt();
        if (woman >= 10 && woman <= 60) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}


// Cup Finals: 716
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int diffRequired = sc.nextInt();

            if( Math.abs(score1 - score2) <= diffRequired){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}



//! IMP
// Too many Floors: 717
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefRoom = sc.nextInt();
            int chefinaRoom = sc.nextInt();

            /*
            * Formula:
            * i[floor] = 10*(i[room] - 1) + 1
            * i[room] = (i[floor]-1)/10 + 1: This is the formula we are going to apply. This is confusing
            * */

            int chefFloor = (chefRoom-1)/10 + 1;
            int chefinaFloor = (chefinaRoom-1)/10 + 1;

            System.out.println(Math.abs(chefFloor-chefinaFloor));


        }
    }
}


// Speed Limit Test: 718
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int aliceDistance = sc.nextInt();
            int aliceTime = sc.nextInt();
            int bobDistance = sc.nextInt();
            int bobTime = sc.nextInt();
            
            // Speed = Distance/Time
            
            double aliceSpeed = (double)aliceDistance / (double)aliceTime;
            double bobSpeed = (double)bobDistance / (double)bobTime;
            
            if(aliceSpeed > bobSpeed ){
                System.out.println("ALICE");
            }
            else if(bobSpeed > aliceSpeed){
                System.out.println("BOB");
            }
            else{
                System.out.println("EQUAL");
            }


        }
    }
}

// Decrement OR Increment: 722
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number%4==0){
            number++;
        }
        else{
            number--;
        }

        System.out.println(number);
    }
}



// A or B: 728
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int timeA = sc.nextInt();
            int timeB = sc.nextInt();

            // Case - I
            int case1 = 500-(timeA*2) + 1000-(timeA+timeB)*4;
            
            // Case - II
            int case2 = 1000-(timeB*4) + 500-(timeA+timeB)*2;

            System.out.println(Math.max(case1,case2));
        }
    }
}


// Second Largest: 730
// Sol-1
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
            int num3 = sc.nextInt();

            int[] A = {num1, num2, num3};
            Arrays.sort(A);

            System.out.println(A[A.length -2]);


        }
    }
}


// Pass or Fail: 730
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int questions = sc.nextInt();
            int correctQuestions = sc.nextInt();
            int passing = sc.nextInt();

            int formula = 3*(correctQuestions) - 1*(questions-correctQuestions);

            if(formula >= passing){
                System.out.println("PASSS");
            }
            else{
                System.out.println("FAIL");
            }


        }
    }
}


// Cyclic Quadrilateral: 735
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int sideA = sc.nextInt();
            int sideB = sc.nextInt();
            int sideC = sc.nextInt();
            int sideD = sc.nextInt();

            if((sideA+sideC) == 180 || (sideB+sideD) == 180){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}

// Too many items: 738
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int items = sc.nextInt();

            if(items%10 != 0 ){
                System.out.println(items/10 + 1);
            }
            else{
                System.out.println(items/10);
            }

        }
    }
}


// Chef Fantasy 11: 739
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int choices = sc.nextInt();

            System.out.println(choices * (choices-1));
        }
    }
}   


// Building Race: 739
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefFloor = sc.nextInt();
            int chefinaFloor = sc.nextInt();
            int chefSpeed = sc.nextInt();
            int chefinaSpeed = sc.nextInt();

            // Speed = Distance/Time
            // Time = Distance/Speed

            double chefTime = (double) chefFloor / (double) chefSpeed;
            double chefinaTime = (double) chefinaFloor / (double) chefinaSpeed;

            if(chefTime==chefinaTime){
                System.out.println("BOTH");
            }
            else if(chefTime < chefinaTime){
                System.out.println("CHEF");
            }
            else{
                System.out.println("CHEFINA");
            }

        }
    }
}


// Chef and Races: 745
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefRace1 = sc.nextInt();
            int chefRace2 = sc.nextInt();
            int rivalRace1 = sc.nextInt();
            int rivalRace2 = sc.nextInt();

            int[] chef = {chefRace1, chefRace2};
            int[] rival = {rivalRace1, rivalRace2};

            int gold = 2;
            for (int j = 0; j < 2 ; j++) {
                for (int k = 0; k <2 ; k++) {
                    if(chef[j] == rival[k]){
                        gold--;
                    }
                }
            }

            System.out.println(gold);

        }
    }
}


// Endless Appetizers: 752
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int limit = sc.nextInt();
            int singlePlate = sc.nextInt();
            int moneyRecieved = sc.nextInt();

            int totalStickEaten = limit + moneyRecieved/30;

            if(totalStickEaten%singlePlate == 0){
                System.out.println(totalStickEaten/singlePlate);
            }
            else{
                System.out.println((totalStickEaten/singlePlate) + 1);
            }

        }
    }
}


// Presents for Cheffina: 757
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int gifts = sc.nextInt();

            System.out.println( gifts - (gifts/5));

        }
    }
}


// Small Factorial: 760
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int num = sc.nextInt();
            
            int fact = 1;

            for (int j = 1; j < num+1 ; j++) {
                fact = fact*j;
            }

            System.out.println(fact);

        }
    }
}


// Dracula Eats: 763
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int daysLeft = sc.nextInt();
            
            int value = daysLeft/7;
            
            if(daysLeft%7 > 1){
                value++;
            }
            
            System.out.println(value);
        }
    }
}


// Possible Victory: 769
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int oppositeTeamScore = sc.nextInt();
        int oversCompleted = sc.nextInt();
        int runScored = sc.nextInt();

        int ballsRemains = (20 - oversCompleted)*6;
        int maximumRuns = ballsRemains * 6;

        if(maximumRuns + runScored > oppositeTeamScore){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
    }
}



// Chef And Operators: 770
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

            if(num1 > num2){
                System.out.println(">");
            }
            else if (num1 < num2){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
        }
    }
}


// Mutated Minions: 777
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int totalTests = sc.nextInt();
           int increment  = sc.nextInt();

           int divisionBy7 = 0;
            for (int j = 0; j < totalTests; j++) {
                int test = sc.nextInt();
                int add = test + increment;
                if(add%7 == 0){
                    divisionBy7++;
                }
            }
            System.out.println(divisionBy7);
        }
    }
}


// Reach fast: 777
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int chef = sc.nextInt();
           int chefina = sc.nextInt();
           int increment = sc.nextInt();

           int steps = 0;
           if(chefina > chef){
              while(chef < chefina){
                  steps++;
                  chef += increment;
              }
           }
           else{
               while(chef > chefina){
                   steps++;
                   chef -= increment;
               }
           }

            System.out.println(steps);
        }
    }
}


// Single-use Attack: 777
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int bossHealth = sc.nextInt();
           int attack = sc.nextInt();
           int attackSpecial = sc.nextInt();
           
           int newHealth = bossHealth - attackSpecial;
           
           int numberOfAttack = 1;
           
           while(newHealth > 0){
               numberOfAttack++;
               newHealth -= attack;
           }

            System.out.println(numberOfAttack);  
        }
    }
}


// Get Lowest Free: 778
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int item1 = sc.nextInt();
           int item2 = sc.nextInt();
           int item3 = sc.nextInt();
           
           int min1 = Math.min(item1,item2);
           int min = Math.min(min1, item3);

            System.out.println(item1+item2+item3-min);

        }

    }
}

// Minimum number of Flips: 781
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                int num = sc.nextInt();
                arr[j] = num;
            }

            if(Math.abs(arrayLength %2) == 0){
                int sum = 0;
                for (int j = 0; j < arr.length ; j++) {
                     sum = sum + arr[j];
                }

                System.out.println(Math.abs(sum)/2);

            }
            else{
                System.out.println(-1);
            }
        }
    }
}


// Binary Battles: 786
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            // It is known that "n" is the power of 2
            int totalTeams = sc.nextInt();
            int roundTime  = sc.nextInt();
            int breakTime  = sc.nextInt();

            int time = 0;
            while(totalTeams != 1){ // Extra condition: while(True) also "might" be fine
                time = time + roundTime;
                totalTeams = totalTeams/2;
                if(totalTeams == 1){
                    break;
                }
                time = time+breakTime;

            }

            System.out.println(time);
        }
    }
}


// Best of Two: 789
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();

            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();

            int[] alice = {A1, A2, A3};
            int[] bob = {B1, B2, B3};

            Arrays.sort(alice);
            Arrays.sort(bob);

            if( (alice[1] + alice[2]) > (bob[1]+ bob[2])){
                System.out.println("ALICE");
            }
            else if( (bob[1] + bob[2]) > (alice[1]+ alice[2])){
                System.out.println("BOB");
            }
            else{
                System.out.println("TIE");
            }
        }
    }
}



//! Remaining to understand
// The Lead Game: 790
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rounds = sc.nextInt();
        int[] player1 = new int[rounds];
        int[] player2 = new int[rounds];

        for (int i = 0; i < rounds; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            player1[i] = p1;
            player2[i] = p2;
        }

        int maxLead = Math.abs(player1[0] - player2[0]);
        int winningPlayer = player1[0] > player2[0] ? 1 : 2;
        int currentLead;

        for (int i = 1; i < rounds; i++) {
            player1[i] += player1[i - 1];
            player2[i] += player2[i - 1];

            currentLead = Math.abs(player1[i] - player2[i]);
            if (currentLead > maxLead) {
                maxLead = currentLead;
                winningPlayer = player1[i] > player2[i] ? 1 : 2;
            }
        }

        System.out.println(winningPlayer + " " + maxLead);
    }
}


// Degree of Polynomial: 793
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int testCases = sc.nextInt();

            int highestPower = 0;
            int power = -1;


            for (int j = 0; j < testCases; j++) {
                int value = sc.nextInt();
                if(value != 0 ){
                    power++;
                    highestPower = power;
                }
                else{
                    power++;
                }
            }

            System.out.println(highestPower);

        }


    }
}


// Recent contest problems: 793
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalValues = sc.nextInt();

            int start28 = 0;
            int ltime108 = 0;

            for (int j = 0; j < totalValues ; j++) {
                String name = sc.next();
                if(name.equals("START38")){
                    start28++;
                }
                else{
                    ltime108++;
                }
            }

            System.out.println(start28 + " " + ltime108);
        }
    }
}



// Primality Test: 794
import java.io.*;
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();

            if(number == 1){
                System.out.println("no");
            }
            else{
                String prime = "yes";
                for (int j = 2; j < (number/2)+1 ; j++) {
                    if(number%j == 0){
                        prime = "no";
                    }
                }

                 System.out.println(prime);
            }

        }
    }
}


// The Cooler Dilemma 2: 798



/* Could not work because of time limit
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int rent = sc.nextInt();
            int purchase= sc.nextInt();

            int numberOfMonth = 0;

            int initialRent = rent;

            while(initialRent < purchase){

                initialRent += rent;
                numberOfMonth++;
            }
            System.out.println(numberOfMonth);
        }
    }
}

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        for (int i = 0; i < cases; i++) {
            int rent = sc.nextInt();
            int purchase= sc.nextInt();

            int remainder = purchase % rent;
            int quotient = purchase / rent;

            if(remainder != 0){
                System.out.println(quotient);
            }
            else{
                System.out.println(quotient-1);
            }
        }
    }
}

