import java.util.*;
public class comput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int positiveCount = 0;
        int negativeCount = 0;
        int sumPositive = 0;
        int sumNegative = 0;
        int sum;
        float averagePositive = 0.0f;
        float averageNegative = 0.0f;
        float avg = 0.0f;

        System.out.print("Enter five whole numbers: ");

        for(int i = 0;i< num.length; i++)
        {
            num[i] = sc.nextInt();
            if(num[i] > 0)
            {
                sumPositive += num[i];
                positiveCount++;
            }
            else
            {
                sumNegative += num[i];
                negativeCount++;
            }
        }
        sum = sumPositive + sumNegative;

        if(positiveCount == 0)
        {
            averagePositive = 0.0f;
        }
        else
        {
            averagePositive = (float) (sumPositive)/positiveCount;
        }

        averageNegative = (float) (sumNegative)/negativeCount;

        avg = (float) (sum)/5;

        if(positiveCount == 1)
        {
            System.out.printf("The sum of the %d positive number : %d",positiveCount, sumPositive);
        }
        else
        {
            System.out.printf("The sum of the %d positive numbers: %d",positiveCount, sumPositive);
        }
        if(negativeCount == 1)
        {
            System.out.printf("\nThe sum of the %d non-positive number: %d", negativeCount, sumNegative);
        }
        else
        {
            System.out.printf("\nThe sum of the %d non-positive numbers: %d",negativeCount, sumNegative);
        }

        System.out.printf("\nThe sum of the 5 numbers: %d", sum);
        if(positiveCount == 1)
        {
            System.out.printf("\nThe average of the %d positive number: %.2f", positiveCount,averagePositive);
        }
        else
        {
            System.out.printf("\nThe average of the %d positive numbers: %.2f", positiveCount,averagePositive);
        }
        if(negativeCount == 1)
        {
            System.out.printf("\nThe average of the %d non-positive number: %.2f", negativeCount, averageNegative);
        }
        else
        {
            System.out.printf("\nThe sum of the %d non-positive numbers: %.2f", negativeCount,averageNegative);
        }

        System.out.printf("\nThe average of the 5 numbers: %.2f", avg);


    }

}