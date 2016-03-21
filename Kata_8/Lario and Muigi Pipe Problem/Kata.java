package Mario;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by SCabuk on 29.02.2016.
 */
public class Kata {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int[] inputArray = numbers;
        Arrays.sort(inputArray);
        int x = inputArray.length;
        int fullArrayLength = inputArray[x-1] - (inputArray[0]-1);
        int[] fullArray = new int[fullArrayLength];
        int inputIndex = 0;
        int fullIndex = 0;

        fullArray[0] = inputArray[inputIndex];
        inputIndex++;
        fullIndex++;

        for(int i=1; i<inputArray.length; i++) {
            if(inputArray[inputIndex]-1 == inputArray[inputIndex]) {
                fullArray[fullIndex] = inputArray[inputIndex];
            }
            else {
                int a = inputArray[inputIndex-1];
                int b = inputArray[inputIndex];
                while(a < b) {
                    int temp = 0;
                    temp = ++a;
                    fullArray[fullIndex] = temp;
                    fullIndex++;
                }
            }
            inputIndex++;
        }
        return fullArray;

    }
}
