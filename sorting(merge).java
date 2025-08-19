
public class Merge {
    static void merge(int []arr,int l,int m,int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for (int i = 0; i < n1; i++)
            larr[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            rarr[j] = arr[m + 1 + j];
             int i = 0;
             int j = 0;
             int k = l;
             while (i<n1&&j<n2) {
                 if (larr[i] <= rarr[j]) {
                     arr[k] = larr[i];
                     i++;
                 } else {
                     arr[k] = rarr[j];
                     j++;
                    }
                    k++;
                }
                while (i < n1) {
                    arr[k] = larr[i];
                    i++;
                    k++;
                }
                while (j < n2) {
                    arr[k] = rarr[j];
                    j++;
                    k++;
                }
            }
            static void mergeSort(int[] arr, int left, int right) {
                if (left < right) {
                    int m = (left + right) / 2;
                    mergeSort(arr, left, m );
                    mergeSort(arr, m + 1, right);
                    merge(arr, left, m, right);
                }
            }

            public static void main(String[] args) {
                int[] array = {4,2,5,1,6,7,9,6};
                System.out.println("Original Array:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println("");
                mergeSort(array, 0, array.length-1);
                System.out.println("sorted array:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            } }


