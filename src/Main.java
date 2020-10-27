public class Main {
    public static void main(String[] args) {

        System.out.println(binarySearch((new int[]{1,2,3,4,5,6,7}), 2));
        System.out.println(binarySearch((new int[]{1,2,3,4,5,6,7}), 5));
        System.out.println(binarySearch((new int[]{12, 8,4,0,6,7}), 9));
        System.out.println(binarySearch((new int[]{}), 2));

    }

    private static boolean binarySearch(int[] sourceArray, int searchValue) {
        int low = 0;
        int mid;
        int high = sourceArray.length - 1;
        int sought;

        while (low <= high) {
            mid = (low + high) / 2;
            sought = sourceArray[mid];
            if (sought == searchValue) {
                return true;
            }
            if (sought > searchValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
