package org.example.algorithm;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 10, 14};
        int target = 9;
        int left = 0;
        int right = arr.length - 1;


        while (left <= right) { // sol - sagdan ya kicikdir ya beraberdir.
            int mid = (left + right) / 2; // orta indeks solnan sagin toplaminin yarisina beraberdir.
            if (arr[mid] == target) {   // eger orta eded axtardigimiz edede beraberdise midi cap et.
                System.out.println("Axtardigimiz eded tapildi: " + mid);
                break; // diyan
            } else if (arr[mid] > target) { // yox eger deyilse yeni  merkez axtardigimiz ededden kicikdirse...

                left = mid + 1;// sol indeksi beraber edirik mid+1 = 2 ci indeks +1 = 3 cu indeks =10

            } else {
                right = mid - 1;

            }
            // yox eger hecbiri deyilse  2 ci indeks-1 = 1ci indeks
            System.out.println("Axtardigimiz eded: ");
        }


    }


}
