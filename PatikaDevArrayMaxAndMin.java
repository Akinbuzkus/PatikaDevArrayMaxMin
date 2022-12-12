
import java.util.Scanner;
import java.util.Arrays;


public class PatikaDevArrayMaxAndMin {
    public static void main(String[] args) {
        int[] list={10,20,30,350,50,450,70,120,90,100};
        findMax(list);
        findMin(list);
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please Enter the number :");
        int number=scan.nextInt();
        int[] newlist={10,20,30,350,50,450,70,120,90,100,number};
        Arrays.sort(newlist);
        int max=list[0];
        int min=list[0];
        min=newlist[Arrays.binarySearch(newlist,number)-1];
        max=newlist[Arrays.binarySearch(newlist,number)+1];
        
        System.out.println("The nearest number greater than the entered number :"+max);
        System.out.println("The nearest number lower than the entered number :"+min);
        
        
    }
    
    static int findMax(int[] arr){
        
        int max=arr[0];
        for(int i :arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Max :"+max);
    return max;
    }
    
    static int findMin(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Min :"+min);
        return min;
    }
    
    
    
}
