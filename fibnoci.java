import java.util.*;

public class fibnoci {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // Sum adjacent elements
            //System.out.println(sum);
        }
	System.out.println(sum);
    }
}

