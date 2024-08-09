public class SecondLargestNumber {
public static void main(String[] args) {
int[] numbers = {10, 20, 5, 15, 30};
int firstLargest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int number : numbers) {
if (number > firstLargest) {
secondLargest = firstLargest;
firstLargest = number;
} else if (number > secondLargest && number != firstLargest) {
secondLargest = number;
}
}
System.out.println("Second largest number in the array is: " + secondLargest);
}
}
