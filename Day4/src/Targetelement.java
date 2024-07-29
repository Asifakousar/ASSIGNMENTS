public class Targetelement {
    public static int binarysearch(int a[], int l, int h, int x){
        int low = 0, high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (a[mid]==x){
                return mid;
            }
            else{
                if(a[mid]>x){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }

            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        Sortedarray ob = new Sortedarray();
        int arr[] = { 1,4,5,8,10 };
        int n = arr.length;
        int x = 1;
        int result = ob.binarysearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
