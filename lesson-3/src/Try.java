public class Try {
        public static void main(String[] args) {
            int arr[]={73,80,62,93,96,87};
            int max=arr[0];
            //手动实现最大/小值
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //在数组的指定位置插入一个数据eg:arr[3]=83
            int arr1[]=new int[arr.length+1];
            for (int i = 0; i <=2; i++) {
                arr1[i]=arr[i];
            }
            arr1[3]=83;
            for (int i = 4; i < arr1.length; i++) {
                arr1[i]=arr[i-1];
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+" ");
            }

        }
    }

