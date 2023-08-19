public class NestedLoopWithMultiplication2 {
    public static void main(String[] args) {
        int n = 10; // O(time complexity of the called function)
        int sum = 0; //O(1)
        double pie = 3.14; //O(1)
        int var = 1;
        while (var < n) { // O(log3 n)
            System.out.println("Pie: " + pie); // O(log3 n)
            for (int j = 1; j < n; j = j + 2) {  // O((log3 n)* (n/2))
                sum++;  // O((log3 n)* (n/2) * 2)
            }
            var *= 3;  // O(log3 n)
        } //end of while loop
        System.out.println("Sum: " + sum); //O(1)
    } //end of main
} //end of class