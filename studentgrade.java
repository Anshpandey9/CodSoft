import java.util.*;
public class studentgrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("     \nStudent Result.\n     ");
        System.out.println("Enter the marks of subject1: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        int subject3 = sc.nextInt();
        System.out.println("Enter the marks of subject4: ");
        int subject4 = sc.nextInt();
        System.out.println("Enter the marks of subject5: ");
        int subject5 = sc.nextInt();
        System.out.println("The average marks of student is :");
        int average = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println(average);
        System.out.println(" The percentage of student is :");
        double percentage = average/5;
        System.out.println(percentage);
        System.out.println("\nThe average marks of student is : " + average);
        System.out.println("\nThe percentage of student is : " + percentage);
        if(percentage>=90){
            System.out.println("\nThe grade of student is A");
        }
        else if(percentage>=80 && percentage<=89){
            System.out.println("\nThe grade of student is B");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("\nThe grade of student is C");
        }
        else if(percentage>=60 && percentage<=69){
            System.out.println("\nThe grade of student is D");
        }
        else{
            System.out.println("\nThe grade of student is F");
        }
    }
}