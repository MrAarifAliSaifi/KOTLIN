public class Java_Array_Practice{
    public static  int isPeak(int arr[])
    {
        int len=arr.length;
        if(arr[0]>=arr[1])//checking first and last elements in the array to check as peak
        {
            return arr[0];
        }
        if(arr[len-1]>=arr[len-2])
        {
            return arr[len-1];
        }
        for(int i=1;i<len-1;i++)//checking the other elemensts
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){//driver code

        int arr[]={1, 3, 20, 4, 1, 0};
        System.out.println(isPeak(arr));

    }
}
