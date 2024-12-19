package gfg.array;

import java.util.HashSet;

public class UnionIntersection {

    // Method to find the union of two arrays
    public static int[] findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of the first array to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements of the second array to the set
        for (int num : arr2) {
            set.add(num);
        }

        // Convert set to array
        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }

        return union;
    }

    // Method to find the intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of the first array to the set
        for (int num : arr1) {
            set1.add(num);
        }

        // Check each element in the second array for intersection
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert set to array
        int[] intersection = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            intersection[i++] = num;
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int[] union = findUnion(arr1, arr2);
        int[] intersection = findIntersection(arr1, arr2);

        // Print the union
        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the intersection
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}

