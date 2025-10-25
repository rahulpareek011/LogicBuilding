public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,45,1,99,23,76};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
            System.out.println(largest);
            System.out.println(secondLargest);
        }

        if(secondLargest==Integer.MIN_VALUE){
                System.out.println("Second largest number not found");
            } else{
                System.out.println("Second largest number: "+ secondLargest);
            }

    }
}
