public class MyArrList {
    int[] arr=new int[0];
    int[] oldarr=new int[0];
    int i=0;
    public void add(int var) {
        int j = 0;
         oldarr = new int[arr.length];
        while (j < arr.length) {
            oldarr[j] = arr[j];
            j++;
        }
        i = arr.length + 1;
        arr = new int[i];
        arr[i - 1] = var;
        j = 0;
        while (j < oldarr.length) {

            arr[j] = oldarr[j];
            j++;
        }
    }
    public void add(int index,int var){
        int j = 0;
        oldarr = new int[arr.length];
        while (j < arr.length) {
            oldarr[j] = arr[j];
            j++;
        }
        i = arr.length + 1;
        arr = new int[i];
        arr[index] = var;
        j = 0;
        while (j < arr.length) {
            if(j<index){
            arr[j] = oldarr[j];
            j++;}
            else if (j>index){
                arr[j]=oldarr[j-1];
                j++;}
            else j++;
            }

        }

       public String toString(){
        String s="";
            for (int i=0;i<arr.length;i++) {

                s=s+arr[i];
                if(i!=arr.length-1){
                s=s+",";}
            }

            return "["+s+"]";
            }

    public void remove(int index){
    int i=0;
        while(i<index){
        oldarr[i]=arr[i];
        i++;
    }
        while(i<oldarr.length){
         oldarr[i]=arr[i+1];
        i++;
    }
    arr = new int[i];
    i=0;
        while(i<arr.length){
        arr[i]=oldarr[i];
        i++;
    }
}

    public int get(int index){
       return arr[index];
    }
    public int indexOf(int Value){
       int i=0;
       while(i<arr.length){
           if (arr[i]==Value) return i;
           i++;
       }
       return -1;
    }

    public boolean isEmpty(){
        if( arr.length == 0) return true;
        return false;
    }

    public int size(){
        return arr.length;
    }

}
