import java.util.Arrays;

public class ZeroOnStart {
    public static void moveZeroes(int num[]){
        int lastIndex = num.length-1;
        //replacing zero value by non-zero
        for(int i=num.length-1;i>=0;i--){//starts from 7 to 1(Opposite)
            if(num[i]!=0){//lastIndex will not change for 0
                num[lastIndex] = num[i]; //so lastIndex element is 0 value element and it will be replaced by its next value
                lastIndex--;
            }
            System.out.println(Arrays.toString(num));
        }
        for(int i=0; i<=lastIndex;i++){
            num[i] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 0, 6, 7};
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) { 
        //         int temp = arr[i];
        //         arr[i] = arr[k];
        //         arr[k++] = temp;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));  //doing 0 on first but messing up order of anothre element
        moveZeroes(arr);

        for (int i : arr) {
            System.out.print(i); //001367
        }

    }
}
