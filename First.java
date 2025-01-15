import java.util.Arrays;

public class First {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5};
    int n = arr.length;
    int temp = arr[0];
    int k = 2; 
    for (int i = 0; i < k; i++) {
      for (int j = n - 1; j >= 0; j--) { 
        temp = arr[j];
        arr[j] = arr[0];
        arr[0] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
