import java.util.HashMap;

public class array {

    static double getAvg(int[] arr){
        double sum = 0;
        for(int i : arr){
            sum = sum+i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] getMultipleOf10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i<size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    static boolean getElement(int[] arr, int target){ //liner search
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static int getMaxEle(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int[] getSum(int[] arr){
        int pos = 0;
        int neg = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                pos = pos+arr[i];
            }else{
                neg = neg + arr[i];
            }
        }
        int[] ans = {pos,neg};
        return ans;
    }

    static int[] getNoOfZeroesAndOnes(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }else{
                oneCount++;
            }
        }
        int ans[] = {zeroCount,oneCount};
        return ans;
    }

    static int getUnsortedEle(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
              return arr[i+1];
            }
        }
        return -1;
    }

    static int[] swapAlternateEle(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length-1; i+=2){
            temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

//    static int getIntersectionEle(int[] arr){
//        int ele = 0;
//        int size = arr.length;
//        for(int i=0; i<size; i++){
//            if( )
//        }
//    }

    static void reverseArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int k : arr){
            System.out.println(k);
        }
    }

    static void rightShiftByOne(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i]  = arr[i-1];
        }
        arr[0] = temp;

        for(int j: arr){
            System.out.println(j);
        }
    }

    static void printExtremesAlternate(int[] arr){
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
        for(int k:arr){
            System.out.println(k);
        }
    }

    static int getMode(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
            int maxEleFreq = -1;
            int maxKeyFreq = -1;

            for(int key: freq.keySet()){
                int currentKey = key;
                int currentKeyFreq = freq.get(key);

                if(currentKeyFreq > maxEleFreq){
                    maxEleFreq = currentKeyFreq;
                    maxKeyFreq = currentKey;
                }
            }
            return maxKeyFreq;

    }

    static int[] getHighLowFreqEle(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key); //value of the key

            if(currentKey>highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);

            if(currentFreq < lowestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum,lowestNum};
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,4,4,4,4,4,4,5,5};
        int[] ans = getHighLowFreqEle(arr);
        System.out.println("highest freq :" + ans[0]);
        System.out.println("lowest freq :" + ans[1]);

//        int[] arr = {1,2,2,2,3,3,3,4,4,4,4,4,4,5,5};
//        int ans = getMode(arr);
//        System.out.println(ans);


//        int[] arr = {1,2,3,4,5};
//        printExtremesAlternate(arr);

//        int [] arr = {1,2,3,4,5,6,7};
//        rightShiftByOne(arr);

//        int[] arr = {2,4,6,8,10,12};
//        reverseArray(arr);

//        int[] arr = {2,3,5,4,6,7};
//        swapAlternateEle(arr);
//
//        for(int i : arr){
//            System.out.println(i);
//        }

//        int[] arr = {2,3,5,4,6};
//        System.out.println(getUnsortedEle(arr));

//        int[] arr = {0,1,1,1,0,0,1};
//        int[] ans = getNoOfZeroesAndOnes(arr);
//        System.out.println("zero count: " + ans[0]);
//        System.out.println("one count: " + ans[1]);

//        int[] arr = {7,-2,3,-4,1,6,-9};
//        int[] ans = getSum(arr);
//
//        System.out.println("pos: " + ans[0]);
//        System.out.println("neg: " + ans[1]);


//        int[] arr = {7,2,3,4,1,6,9};
//        System.out.println(getMaxEle(arr));

//        int[] arr = {2, 4, 5, 6, 7};
//        int target = 4;
//        boolean ans = getElement(arr, target);
//        System.out.println(ans);

//        int[] arr = {1,2,3,4,5};
//        int[] ans = getMultipleOf10(arr);
//        for(int i : ans){
//            System.out.println(i);
//        }

//        int[] arr = {2,4,1,3};
//        System.out.println(getAvg(arr));
    }
}
