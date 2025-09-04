package DSA.GreedyAlgo;

public class Candy {
    public int minCandy(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 1, i = 1;

        while (i < n) {
            if (arr[i] == arr[i - 1]) {
                sum += 1;
                i++;
                continue;
            }

            int peek = 1;
            while (i < n && arr[i] > arr[i - 1]) {
                peek += 1;
                sum += peek;
                i++;
            }

            int down = 1;
            while (i < n && arr[i] < arr[i - 1]) {
                sum += down;
                i++;
                down++;
            }

            if (down > peek)
                sum += down - peek;
        }

        return sum;
    }
}
