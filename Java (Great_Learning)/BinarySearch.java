import java.util.*;

public class BinarySearch {
    
    public static int bs(int arr[], int key){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = (left+right-1)/2;
            if (arr[mid]==key)
            {
                return key;
            }
            else if(arr[mid]<key)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number, you want to find: ");
        int key = sc.nextInt();

        int result = bs(arr, key);

        if(result != -1)
        {
            System.out.print("No number found.");
        }
        else{
            System.out.println("Number found at "+ result +" location of the array.");
        }
        sc.close();
    }
}


