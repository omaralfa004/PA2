
import java.util.*;
public class comput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int posCount = 0;

        int negCount = 0;

        int sumPositive = 0;
        int sumNegative = 0;
        int sum;
        float avePositive = 0.0f;
        float averageNegative = 0.0f;
        float avg = 0.0f;

        System.out.print("Enter five whole numbers: ");

        for(int i = 0;i< num.length; i++)
        {
            num[i] = sc.nextInt();
            if(num[i] > 0)
            {
                sumPositive += num[i];
                posCount++;
            }
            else
            {
                sumNegative += num[i];
                negCount++;
            }
        }

        sum = sumPositive + sumNegative;

        if(posCount == 0)
        {
            avePositive = 0.0f;
        }
        else
        {
            avePositive = (float) (sumPositive)/posCount;
        }


        averageNegative = (float) (sumNegative)/negCount;

        avg = (float) (sum)/5;

        if(posCount == 1)
        {
            System.out.printf("The sum of the %d positive number : %d",posCount, sumPositive);
        }
        else
        {
            System.out.printf("The sum of the %d positive numbers: %d",posCount, sumPositive);
        }
        if(negCount == 1)
        {

            System.out.printf("\nThe sum of the %d non-positive number: %d", negCount, sumNegative);
        }
        else
        {

            System.out.printf("\nThe sum of the %d non-positive numbers: %d",negCount, sumNegative);
        }

        System.out.printf("\nThe sum of the 5 numbers: %d", sum);
        if(posCount == 1)
        {
            System.out.printf("\nThe average of the %d positive number: %.2f", posCount,avePositive);
        }
        else
        {
            System.out.printf("\nThe average of the %d positive numbers: %.2f", posCount,avePositive);
        }
        if(negCount == 1)
        {
            System.out.printf("\nThe average of the %d non-positive number: %.2f", negCount, averageNegative);
        }
        else
        {
            System.out.printf("\nThe sum of the %d non-positive numbers: %.2f", negCount,averageNegative);
        }

        System.out.printf("\nThe average of the 5 numbers: %.2f", avg);


    }

}
