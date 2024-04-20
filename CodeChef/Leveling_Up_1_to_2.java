import java.util.*;
import java.lang.*;
import java.io.*;


// Richie RIch: 878
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int chefAssests = sc.nextInt();
            int requiredAssests = sc.nextInt();
            int growPerYear = sc.nextInt();

            int countYear = 0;

            while(chefAssests < requiredAssests){
                countYear++;
                chefAssests += growPerYear;
            }

            System.out.println(countYear);
        }

    }
}

// Vaccine Dates: 938

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int firstDose = sc.nextInt();
            int minimunRange = sc.nextInt();
            int maximumRange = sc.nextInt();

            if(firstDose <= maximumRange && firstDose >=minimunRange){
                System.out.println("Take second dose now");
            }
            else if(firstDose > maximumRange){
                System.out.println("Too Late");
            }
            else if(firstDose < minimunRange){
                System.out.println("Too Early");
            }
        }

    }
}


// Hoop Jump: 930
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalHoops = sc.nextInt();
            System.out.println((totalHoops/2)+1);
        }

    }
}


// The Two Dishes: 1254
