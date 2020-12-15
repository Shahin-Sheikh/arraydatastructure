import java.util.*;
public class travase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ara = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+i+" element of the array: ");
            ara[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            System.out.println(j+"Element is"+ara[j]);
        }
    }
}