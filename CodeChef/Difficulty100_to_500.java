//  Cricket World Cup Qualifier: 203
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        if(value >= 12){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}


// Lucky Seven: 213
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(S.charAt(6));

    }
}


// Clear Day: 233
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int rainy = sc.nextInt();
        int cloudy = sc.nextInt();

        System.out.println(7 - rainy - cloudy);

    }
}


// Double Rent: 234
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int initialRent = sc.nextInt();
        System.out.println(initialRent*2);

    }
}


// Saving Taxes: 252
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(X-Y);
        }

    }
}


//  Masterchef finals: 255
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int rank = sc.nextInt();
            if(rank <= 10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        
    }
}


// Biryani classes: 257
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int week = sc.nextInt();
            int cost = sc.nextInt();
            System.out.println(week*cost);
        }
        
    }
}


// Chef Plays Ludo: 260
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int number = sc.nextInt();
            if(number == 6){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}

// How many unattempted problems: 264
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

            int totalProblems = sc.nextInt();
            int problemsSolved = sc.nextInt();
            System.out.println(totalProblems-problemsSolved);
    }
}

// Determine the Score: 267 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalPoints = sc.nextInt();
            int testPassed = sc.nextInt();
            
            int pointPerTest = totalPoints / 10;
            System.out.println(pointPerTest* testPassed);
        }

    }
}


// 404 Not Found: 267
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        
        int responseCode = sc.nextInt();
        if(responseCode == 404) {
            System.out.println("NOT FOUND");
        } 
        else{
           System.out.println("FOUND");
       }

    }
}


// Off By One: 271
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println((num1+num2)*10 + 1);

    }
}


// Donation Drive: 272
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int donationNeeded = sc.nextInt();
            int donationReceived = sc.nextInt();
            System.out.println(donationNeeded-donationReceived);

        }

    }
}



// Kitchen Timings: 273
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int startingHours = sc.nextInt();
            int endingHours = sc.nextInt();
            System.out.println(endingHours- startingHours);
        }

    }
}


// IPL Ticket Rush: 273
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int students = sc.nextInt();
            int tickets = sc.nextInt();

            if(students > tickets){
                System.out.println(students-tickets);
            }
            else{
                System.out.println(0);
            }
        }

    }
}


// Audible Range: 279
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int hearing = sc.nextInt();

            if(hearing >= 67 && hearing <= 45000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Reach on Time: 279
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int leftFromHomeToOffice = sc.nextInt();

            if(leftFromHomeToOffice >= 30){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Puzzle Hunt: 279
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

            int totalTeamMembers = sc.nextInt();

            if(totalTeamMembers >= 6 && totalTeamMembers <=8){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

    }
}


// Bone Appetit: 279
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int totalPersonInBones = sc.nextInt();
        int totalPersonInBlood = sc.nextInt();

        int treatPerPersonInBones = sc.nextInt();
        int treatPerPersonInBlood = sc.nextInt();

        System.out.println((totalPersonInBlood* treatPerPersonInBlood)+(totalPersonInBones* treatPerPersonInBones));

    }
}


// Who is taller!: 281
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int alice = sc.nextInt();
            int bob = sc.nextInt();

            if(alice > bob){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}


// Reach the Target: 281
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int target = sc.nextInt();
            int scored = sc.nextInt();

            System.out.println(target-scored);

        }


    }
}


// Best of Two: 284
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int marks1 = sc.nextInt();
            int marks2 = sc.nextInt();

            System.out.println(Math.max(marks1, marks2));
        }


    }
}


// 2000: 284
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int notesOf2000 = sc.nextInt();

        System.out.println(notesOf2000 * 4);
    }
}


// Roller Coaster: 285
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int sonHeight = sc.nextInt();
            int minimumHeight = sc.nextInt();

            if(sonHeight >= minimumHeight){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }
}


// Candy Division: 289
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalCandies = sc.nextInt();
            
            if(totalCandies%3 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }
}


// Chef On Date: 294 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int dollar = sc.nextInt();
            int bill = sc.nextInt();
            if(dollar >= bill){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}   


// Parity: 295
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalChocolate = sc.nextInt();
            if(totalChocolate%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}

// Total Prize Money: 296
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int top10 = sc.nextInt();
            int from91to100 = sc.nextInt();
            System.out.println( (10*top10) + (90*from91to100));

        }
    }
}


// Counting Words: 296
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int pages = sc.nextInt();
            int wordsPerPages = sc.nextInt();

            System.out.println(pages* wordsPerPages);

        }
    }
}


// Battery Health: 296
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int health = sc.nextInt();
           if(health >= 80){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");

           }
        }
    }
}


// Tom and Jerry Chase: 298
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
          int jerrySpeed = sc.nextInt();
          int tomSpeed = sc.nextInt();
          if(tomSpeed > jerrySpeed){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }

        }
    }
}


// Ageing: 299
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
         int chefAge = sc.nextInt();
            System.out.println(chefAge - 10);

        }
    }
}


// Right There: 299
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
         int perpleInvited = sc.nextInt();
         int capacityOfHall = sc.nextInt();
         
         if(capacityOfHall >= perpleInvited){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }

        }
    }
}


// Second Max of Three Numbers: 300

//^ Solution-1
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();

         int max;
         int max2;

         if(num1> num2){
             max = num1;
             max2 = num2;
         }
         else{
             max = num2;
             max2 = num1;
         }

         if(num3 > max){
             max2 = max;
             max = num3;
         }
         else if(num3 > max2){
             max2 = num3;
         }

            System.out.println(max2);

        }
    }
}   

//^ Solution-2
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int[] arr = {num1, num2, num3};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}


// Bull or Bear: 300
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int buy  = sc.nextInt();
            int sell = sc.nextInt();
            if(sell > buy){
                System.out.println("PROFIT");
            }
            else if(buy > sell){
                System.out.println("LOSS");
            }
            else{
                System.out.println("NEUTRAL");
            }
        }
    }
}

// Four Tickets: 302
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int ticketPrice = sc.nextInt();
            if(ticketPrice* 4 > 1000){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}


// Chairs Requirement: 305
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int student = sc.nextInt();
            int seatAvailable = sc.nextInt();
            if(student > seatAvailable){
                System.out.println(student-seatAvailable);
            }
            else{
                System.out.println(0);
            }
        }
    }
}


// Chef and Donation: 305
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int chefIncome = sc.nextInt();
           int chefinaIncome = sc.nextInt();
            System.out.println(chefinaIncome - chefIncome);
        }
    }
}


// Sum it: 308
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int sum = sc.nextInt();
          if(num1+ num2 == sum){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
        }
    }
}


// Get Subscription: 315
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
          int lengthOfMeeting = sc.nextInt();
          if(lengthOfMeeting > 30){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");

          }        
        }
    }
}


// Messi vs Ronaldo: 316
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

          int messiGoals = sc.nextInt();
          int messiAssists = sc.nextInt();
          int ronaldoGoals = sc.nextInt();
          int ronaldoAssists = sc.nextInt();

          int messiTotal = messiGoals*2 + messiAssists;
          int ronaldoTotal = ronaldoGoals*2 + ronaldoAssists;

          if(ronaldoTotal > messiTotal){
              System.out.println("Ronaldo");
          }
          else if(messiTotal > ronaldoTotal){
              System.out.println("Messi");
          }
          else{
              System.out.println("Equal");
          }

    }
}


// Waiting Time: 319
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int week = sc.nextInt();
            int daysPassed = sc.nextInt();

            System.out.println(week * 7 - daysPassed);

        }
    }
}


// October Marathon: 319
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        if(time < 3){
            System.out.println("GOLD");
        }
        else if(time < 6){
            System.out.println("SILVER");
        }
        else{
            System.out.println("BRONZE");
        }

    }
}


// Just One More Episode: 320
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int examStart = sc.nextInt();
            if(examStart > 24){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}

// Mana Points: 327
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int attackPoint = sc.nextInt();
            int availablePoint = sc.nextInt();

            System.out.println(availablePoint/attackPoint);


        }

    }
}


// Rain in Chefland: 328
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int rateOfPrecipitation = sc.nextInt();
            if(rateOfPrecipitation < 3){
                System.out.println("LIGHT");
            }
            else if(rateOfPrecipitation < 7){
                System.out.println("MODERATE");
            }
            else{
                System.out.println("HEAVY");

            }

        }

    }
}


// Bidding: 330
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int aliceBet = sc.nextInt();
            int bobBet = sc.nextInt();
            int charlieBet = sc.nextInt();

            int[] arr = {aliceBet, bobBet, charlieBet};
            Arrays.sort(arr);


            if(arr[2] == aliceBet){
                System.out.println("Alice");
            }
            else if(arr[2] == bobBet){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }

        }

    }
}


// Overspeeding Fine: 335
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int speed = sc.nextInt();
            if(speed <= 70){
                System.out.println(0);
            }
            else if(speed <= 100){
                System.out.println(500);
            }
            else{
                System.out.println(2000);
            }

        }

    }
}


// Chess Time: 337
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int hours = sc.nextInt();
            System.out.println(hours*3);

        }

    }
}


// Passes for Fair: 342
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int friends = sc.nextInt();
            int passes = sc.nextInt();

            if(passes > friends){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}


// Read Pages: 343
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int totalPages = sc.nextInt();
            int pagesPerDay = sc.nextInt();
            int totalDay = sc.nextInt();
            
            if( (pagesPerDay * totalDay) >= totalPages ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");

            }
        }

    }
}


// Couple Game: 347
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int girls = sc.nextInt();
            int boys = sc.nextInt();
            System.out.println( boys - girls);
        }

    }
}


// Air Quality Index: 347
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

           int index = sc.nextInt();
           if(index < 100){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

    }
}

// Fever: 348
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int feverTemperature = sc.nextInt();

            if(feverTemperature > 98){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Sleep deprivation: 348
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int sleep = sc.nextInt();

            if(sleep < 7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");

            }        
        }

    }
}


// MATH1 Enrolment: 347
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int seatsHave = sc.nextInt();
           int student = sc.nextInt();
           
           if(seatsHave < student){
               System.out.println(student-seatsHave);
           }
           else{
               System.out.println(0);
           }
        }

    }
}


// Chef and Chapters: 350
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int courses = sc.nextInt();
           int unitPerCourses = sc.nextInt();
           int chapter = sc.nextInt();
            System.out.println(courses*unitPerCourses*chapter); 
        }

    }
}

// Water Requirement: 351
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int hours = sc.nextInt();
            System.out.println(2*hours);
        }

    }
}


// Lunchtime: 352
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int breakTime = sc.nextInt();

           if(breakTime >= 1 && breakTime <=4){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }

    }
}


// Good Investment or Not: 357
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int interestRate = sc.nextInt();
           int inflationRate = sc.nextInt();

           if(interestRate >= 2*inflationRate){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");

           }
        }
    }
}

// Final Population: 358
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int peopleInTown = sc.nextInt();
           int peopleLeft = sc.nextInt();
           int peopleMigrate = sc.nextInt();
           System.out.println(peopleInTown-peopleLeft+peopleMigrate);
        }
    }
}

// Chef gives Party: 363
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int friends = sc.nextInt();
           int pricePerBurger = sc.nextInt();
           int moneyChef = sc.nextInt();
           
           if(moneyChef >= friends* pricePerBurger){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}


// Time Complexity: 364
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int comparisonA = sc.nextInt();
           int comparisonB = sc.nextInt();
           if(comparisonA > comparisonB){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");

           }        
        }
    }
}


// Interior Design: 373
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int floorHouse1 = sc.nextInt();
           int wallHouse1 = sc.nextInt();
           int floorHouse2 = sc.nextInt();
           int wallHouse2 = sc.nextInt();

           int house1 = floorHouse1 + wallHouse1;
           int house2 = floorHouse2 + wallHouse2;

            System.out.println(Math.min(house1, house2));
        }
    }
}


// Car Trip: 374
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
           int km = sc.nextInt();
           int remainingKmAfter300 = km-300;

           if(km <= 300){
               System.out.println(3000);
           }
           else{
               System.out.println( 3000 + remainingKmAfter300*10);
           }
        }
    }
}


// Multivitamin Tablets: 376
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int days = sc.nextInt();
            int tablets = sc.nextInt();

            if (days * 3 <= tablets) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}


// Six Friends: 382
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int doubleRoom = sc.nextInt();
            int tripleRoom = sc.nextInt();

            int doubleRoomTotal = doubleRoom*3;
            int tripleRoomTotal = tripleRoom*2;
            System.out.println(Math.min(doubleRoomTotal, tripleRoomTotal));
        }
    }
}


// Chef and Wire Frames: 383
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            int costOfWire = sc.nextInt();

            int totalPerimeter = 2*(length+breadth);
            System.out.println(totalPerimeter*costOfWire);
        }
    }
}


// Minimum Coins: 390
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int moneyToPay = sc.nextInt();

            System.out.println(moneyToPay%10);
        }
    }
}


// Spice Level: 390
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int spiceLevel = sc.nextInt();

            if(spiceLevel < 4){
                System.out.println("MILD");
            }
            else if(spiceLevel < 7){
                System.out.println("MEDIUM");
            }
            else{
                System.out.println("HOT");
            }
        }
    }
}


// The Gift: 390
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

           int moneyOmHas = sc.nextInt();
           int priceOfLaptop = sc.nextInt();
           int funds = sc.nextInt();

           if( moneyOmHas+funds >= priceOfLaptop){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

    }
}

// Reach Home: 395
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int fuel = sc.nextInt();
           int km = sc.nextInt();

           if( fuel* 5 >= km){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

        }
    }
}


// Donation Rewards: 395
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int donation = sc.nextInt();
           
           if(donation <= 3){
               System.out.println("BRONZE");
           }
           else if(donation <= 6){
               System.out.println("SILVER");
           }
           else{
               System.out.println("GOLD");
           }
        }
    }
}


// True and False Paper: 398
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int totalQuestions = sc.nextInt();
           int aliceScore = sc.nextInt();
            System.out.println(totalQuestions-aliceScore);

        }
    }
}


// The Cheaper Cab: 399
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int cab1 = sc.nextInt();
           int cab2 = sc.nextInt();

           if(cab1 == cab2){
               System.out.println("ANY");
           }
           else if(Math.min(cab1,cab2) == cab1){
               System.out.println("FIRST");
           }
           else{
               System.out.println("SECOND");
           }

        }
    }
}


// Discount: 401
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int discount = sc.nextInt();
            System.out.println(100-discount);

        }
    }
}


// Height of Rationals: 405
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a,b));

    }
}


// Instagram: 408
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int following = sc.nextInt();
           int followers = sc.nextInt();

           if(following > followers*10){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}


// Volume Control: 409
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
           int initialVolume = sc.nextInt();
           int finalVolume = sc.nextInt();

            System.out.println(Math.abs(initialVolume-finalVolume));
           
        }
    }
}

// ATM: 410
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

          int withdraw = sc.nextInt();
          double bankBalance = sc.nextDouble();
          
          if(withdraw%5==0 && bankBalance>= ((double) withdraw+0.5)){
              System.out.println((bankBalance-(double) withdraw) - 0.5);
          }
          else{
              System.out.println(bankBalance);
          }

    }
}


// Is it hot or cold: 410
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int temp = sc.nextInt();
            if(temp <= 20){
                System.out.println("COLD");
            }
            else{
                System.out.println("HOT");
            }

        }
    }
}


// Profit Increment: 414
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int sellingPrice = sc.nextInt();
            int initialProfit = sc.nextInt();

            double newSellingPrice = sellingPrice*1.1;

            int differenceSellingAndProfit = sellingPrice-initialProfit;

            System.out.println((int)newSellingPrice - differenceSellingAndProfit);

        }
    }
}


// Fill the Bucket: 419
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalCapacity = sc.nextInt();
            int filled = sc.nextInt();
            System.out.println(totalCapacity-filled);
            
        }
    }
}


// Parliament: 419
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int members = sc.nextInt();
            int favor = sc.nextInt();

            if( (double)favor >= (double)members /2.0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}


// Find Remainder: 421
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1%num2);

        }
    }
}


// Ezio and Guards: 427
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int manipulate = sc.nextInt();
            int guards = sc.nextInt();
            
            if(manipulate>=guards){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}

// Chef and Masks: 432
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int disposal = sc.nextInt();
            int cloth = sc.nextInt();

            int disposalTotal = disposal*100;
            int clothTotal = cloth*10;

            if(disposalTotal == clothTotal){
                System.out.println("Cloth");
            }
            else if(Math.min(disposalTotal, clothTotal) == clothTotal){
                System.out.println("Cloth");
            }
            else{
                System.out.println("Disposable");
            }

        }
    }
}


// Speciality: 434
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int[] arr = {num1, num2, num3};
            Arrays.sort(arr);

            if(arr[2] == num1){
                System.out.println("Setter");
            }
            else if(arr[2] == num2){
                System.out.println("Tester");
            }
            else{
                System.out.println("Editorialist");
            }
        }
    }
}


// Maximum Submissions: 435
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int minutes = sc.nextInt();
            System.out.println(minutes*2);


        }
    }
}


// TV Discount: 472
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int TV1 = sc.nextInt();
            int TV2 = sc.nextInt();
            int discountTV1 = sc.nextInt();
            int discountTV2 = sc.nextInt();

            int TV1AfterDiscount = TV1 - discountTV1;
            int TV2AfterDiscount = TV2 - discountTV2;

            if(TV1AfterDiscount < TV2AfterDiscount){
                System.out.println("First");
            }
            else if(TV2AfterDiscount < TV1AfterDiscount){
                System.out.println("Second");
            }
            else{
                System.out.println("Any");
            }


        }
    }
}


// Broken Phone: 451
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int repair = sc.nextInt();
            int newPhone = sc.nextInt();

            if(repair < newPhone){
                System.out.println("REPAIR");
            }
            else if(newPhone < repair){
                System.out.println("NEW PHONE");
            }
            else{
                System.out.println("ANY");
            }


        }
    }
}


// Tyre problem: 452
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int bike = sc.nextInt();
            int car = sc.nextInt();

            System.out.println((bike*2) + (car*4));


        }
    }
}


//* Sum of Digits: 455
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int num = sc.nextInt();

            int sum = 0;
            while(num>0) {
                sum += num % 10;
                num = num / 10;
            }

            System.out.println(sum);

        }
    }
}


// Perfect Trio: 455
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if( A==B+C || B==A+C || C==A+B){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
} 


// Monthly Budget: 456
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalMoney = sc.nextInt();
            int dailyExpenditure = sc.nextInt();
            
            if(dailyExpenditure* 30 <= totalMoney){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}


// Credit score: 459
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();

        if(creditScore >= 750){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}


//* First and Last Digit: 461
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String num = sc.next();

            int[] arr = new int[num.length()];

            for (int j = 0; j < num.length() ; j++) {
                arr[j] = num.charAt(j) - '0';

            }

            System.out.println(arr[0] + arr[arr.length-1]);


        }
    }
}


// Enormous Input Test
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int totalNumbers = sc.nextInt();
        int division = sc.nextInt();
        int count = 0;

        int[] arr = new int[totalNumbers];
        for (int i = 0; i < totalNumbers ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % division == 0){
                count++;
            }
        }

        System.out.println(count);

    }
}


// Practice makes us perfect: 467
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int count = 0;


        for (int i = 0; i < 4 ; i++) {
            int week = sc.nextInt();
            if(week >= 10){
                count++;
            }
        }

        System.out.println(count);

    }
}


// Pending Assignments: 468
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int totalAssignment = sc.nextInt();
            int minutesPerAssignment = sc.nextInt();
            int days = sc.nextInt();

            int totalMinutes = days*24*60;
            if( totalAssignment* minutesPerAssignment <= totalMinutes){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Course Registration: 470
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
            int totalFriendsInGroup = sc.nextInt();
            int maximunStudent = sc.nextInt();
            int enrolledStudent = sc.nextInt();

            if(maximunStudent-enrolledStudent >= totalFriendsInGroup){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Insurance: 475
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
           int maximunRefund = sc.nextInt();
           int accidentAmount = sc.nextInt();

           if(maximunRefund >= accidentAmount){
               System.out.println(accidentAmount);
           }
           else{
               System.out.println(maximunRefund);
           }
        }

    }
}


// Codechef Airlines: 475
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();


        for (int i = 0; i < cases ; i++) {
           int maximumCapacityPerPlane = sc.nextInt();
           int peopleBookedIn1Day = sc.nextInt();
           int chargePerTicket = sc.nextInt();

           if ( maximumCapacityPerPlane*10 >= peopleBookedIn1Day){
               System.out.println(peopleBookedIn1Day*chargePerTicket);
           }
           else{
               System.out.println(maximumCapacityPerPlane*10 *chargePerTicket);
           }
        }

    }
}


// Increase IQ: 478
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int currentIQ = sc.nextInt();
        


        if(170 - currentIQ < 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}


// Battery Low: 479
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int currentBattery = sc.nextInt();
            if(currentBattery <= 15){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}


// Bob at the Bank: 481
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int currentBalance = sc.nextInt();
            int deposit = sc.nextInt();
            int withdraw = sc.nextInt();
            int months = sc.nextInt();

            System.out.println( currentBalance+(deposit-withdraw)*months);
        }

    }
}


// The Mango Truck: 482
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int mangoWeight = sc.nextInt();
            int truckWeight = sc.nextInt();
            int bridge = sc.nextInt();

            int mangoWeightToBeCarried = bridge - truckWeight;


            // Just an extra condition for "DOUBLE CHECKING"
            if(mangoWeightToBeCarried >=0){
                System.out.println(mangoWeightToBeCarried / mangoWeight);
            }
        }

    }
}



// Monopoly in Chefland: 482
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int company1 = sc.nextInt();
            int company2 = sc.nextInt();
            int company3 = sc.nextInt();
            
            if(company1 > (company2+company3) || company2 > (company1+company3) || company3 > (company1+company2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}

// Bucket and Water Flow: 483
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases ; i++) {
            int initialWaterLevel = sc.nextInt();
            int totalWaterLevel = sc.nextInt();
            int waterPerHour = sc.nextInt();
            int time = sc.nextInt();

            int remainingLevel = totalWaterLevel - initialWaterLevel;
            if(remainingLevel == waterPerHour*time){
                System.out.println("filled");
            }
            else if(remainingLevel > waterPerHour*time){
                System.out.println("Unfilled");
            }
            else{
                System.out.println("Overflow");
            }
        }

    }
}


// Miami GP: 487
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
            double fastestTime = sc.nextInt();
            double completionTime = sc.nextInt();

            double toQualify = fastestTime*1.07;

            if( completionTime <=  toQualify ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }

    }
}


// Dominant Army: 488
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
            int kingdomA = sc.nextInt();
            int kingdomB = sc.nextInt();
            int kingdomC = sc.nextInt();
            
            if(kingdomA > (kingdomB+kingdomC) || kingdomB > (kingdomA+kingdomC) || kingdomC > (kingdomA+kingdomB)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}


// Playlist: 489
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
            int totalJourney = sc.nextInt();
            int songTime = sc.nextInt();

            System.out.println( totalJourney / (songTime*3));

        }

    }
}


// Chef and Chocolates: 492
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
            int totalChocolate = sc.nextInt();
            int have = sc.nextInt();
            int price = sc.nextInt();

            System.out.println( (totalChocolate-have)*price);

        }

    }
}

// Netflix: 493
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
            int alice = sc.nextInt();
            int bob = sc.nextInt();
            int charlie = sc.nextInt();
            int netflixSubscription = sc.nextInt();

            if ((alice+bob)>=netflixSubscription || (bob+charlie)>= netflixSubscription || (charlie+alice) >= netflixSubscription){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}


// Chef and Gym: 496
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
           int montlyCharge = sc.nextInt();
           int trainer = sc.nextInt();
           int total = sc.nextInt();
           
           if(total >= trainer+montlyCharge){
               System.out.println(2);
           }
           else if(total >= montlyCharge){
               System.out.println(1);
           }
           else{
               System.out.println(0);
           }

        }

    }
}


// Best Coupon: 496
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        // read 107% Rule
        for (int i = 0; i < cases ; i++) {
          double cost = sc.nextInt();

          if(cost*.10 > 100.0){
              System.out.println((int)(cost*.10));
          }
          else{
              System.out.println(100);
          }

        }

    }
}


