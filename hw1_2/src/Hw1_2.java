/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        //TO DO!!!
        int countCredit=0;
        float sum=0, gd;
        for (int i=0; i<grade.length; i++)
        {
            countCredit += credit[i];
            gd=grade[i]*credit[i];
            sum += gd;
        }
        return sum/countCredit;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
