package DivideAndConqure;

public class SortString {
        public static String[] Merge_Sort(String [] arr , int si , int ei){
                //Base condition
                if( si == ei){
                        String [] A = {arr[si]};
                        return A;
                }
                int mid = si + (ei - si) / 2;
                String [] arr1 = Merge_Sort(arr, si, mid);
                String [] arr2 = Merge_Sort(arr, mid+1, ei);

                String [] arr3 = merge(arr1 , arr2);
                return arr3;
        }
        public static String[] merge(String [] arr1, String [] arr2){
                int m = arr1.length;
                int n = arr2.length;
                String [] arr3 = new String[m+n];
                int idx = 0 ; 
                int i = 0 , j = 0;
                while(i < m && j< n){
                        if(isAlhabet(arr1[i] , arr2[j])){
                                arr3[idx] = arr1[i];
                                i++;
                                j++;
                        }else{
                                arr3[idx] = arr2[j];
                                j++;
                                idx++;
                        }
                }
                 //Remain left part
                 while(i < m){
                        arr3[idx] = arr1[i];
                        i++; idx++;
                }
                //Reamin right part
                while(j <n){
                        arr3[idx] = arr2[j];
                        j++; idx++;
                }
                return arr3;
        }
        public static boolean isAlhabet(String str1 , String str2){
                if(str1.compareTo(str2) < 0){
                        return true;
                }
                return false;
        }
        public static void main(String[] args) {
                String[] arr = {"sun" ,"earth", "mars" , "mercury"};
                String [] a = Merge_Sort(arr, 0, arr.length -1);
                for(int i = 0 ; i< a.length; i++){
                        System.out.print(a[i]+" ");
                }
        }
        
}
