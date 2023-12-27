package com.example.dataStructures.arrays;

public class JugglingAlgoRotation {
    void leftRotate(int arr[], int d, int n)
    {
        int k=0;
        int g_c_d = gcd(n,d);
        for(int i=0;i<g_c_d;i++){
            int temp = arr[i];
            int j=i;
            while(true){
                k=j+d;
                if(k>=n){
                    k=k-n;
                }
                if(k==i){
                    break;
                }
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }

    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Function to get gcd of a and b*/
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        JugglingAlgoRotation rotate = new JugglingAlgoRotation();
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // right rotate - 8,9,10,11,12,0,1,2,3,4,5,6,7;
        // left rotate -  5,6,7,8,9,10,11,12,0,1,2,3,4;
        rotate.leftRotate(arr, 5, 12);
        rotate.printArray(arr, 12);
    }
}
