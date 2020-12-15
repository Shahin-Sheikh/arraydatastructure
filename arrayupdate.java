import java.util.*;
public class arrayupdate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Emter the location where you want to insert updated value: ");
        int k = sc.nextInt();
        System.out.println("Enter the item you want to update: ");
        int item = sc.nextInt();
        int[] ara = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            ara[i] = sc.nextInt();
        }
        ara[k-1] = item;

        System.out.println("Elements after update: ");
        for(int j=0; j<n; j++){
            System.out.println(ara[j]);
        }
    }
}