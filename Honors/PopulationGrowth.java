// Ryan Fortner
// September 26, 2023
// Population Growth

import java.util.*;

public class PopulationGrowth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Growth
        System.out.println("Please enter the current population, the years to calculate for the projection, and the rate of growth:");
        int a = input.nextInt();
        int t = input.nextInt();
        double r = input.nextDouble();
        double answer = a * Math.pow((1 + (r/100)), t);
        int answerFinal = (int)Math.rint(answer);
        System.out.printf("In %d years at %.1f%% growth, the population is expected to be %d\n", t, r, answerFinal);
        
        // Decay
        //In 10 years at 1.2% decline, the population is expected to be 106353
        System.out.println("Please enter the current population, the years to calculate for the projection, and the rate of decay.:");
        a = input.nextInt();
        t = input.nextInt();
        r = input.nextDouble();
        answer = a * Math.pow((1 - (r/100)), t);
        answerFinal = (int)Math.rint(answer);
        System.out.printf("In %d years at %.1f%% decay, the population is expected to be %d\n", t, r, answerFinal);
        
    }
}
