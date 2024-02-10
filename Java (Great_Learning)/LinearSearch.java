import java.util.*;

public class LinearSearch {
    
    public static int ls(int arr[], int key, int size){
        for(int i = 0; i<size; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the numbers in the array: ");
        int arr[] = new int[size];
        for(int i = 0; i<size;i+=1){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number that you want to find: ");
        int key = sc.nextInt();

        int result = ls(arr, key, size);

        if(result == -1){
            System.out.print("No number found.");
        }
        else{
            System.out.println("Number found at "+ result +" location of the array.");
        }

        sc.close();
    }
}
