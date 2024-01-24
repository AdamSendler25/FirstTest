
public class MyArrList {

    /**
     * что за магическая переменная i - норм название ей придумай
     */
    int i = 0;
    int counter = 0;

    int[] arr = new int[10];

    /**
     * что за магическая переменная j - норм название ей придумай
     */
    int j = 0;

    public void add(int var) {

        //опять создаешь oldarr каждый раз когда добавляешь новый элемент
        int[] oldarr = new int[i];
        if (i == arr.length) {
            //ты тут зануляешь всегда j - зачем ее в переменную класса?
            j = 0;
            //перепиши на цикл фор будет читабельнее и уберешь int j = 0; в переменной класса
            while (j < oldarr.length) {
                oldarr[j] = arr[j];
                j++;
            }
            arr = new int[i + 1];

            i++;

            // тоже самое. перепиши на цикл фор будет читабельнее и уберешь int j = 0; в переменной класса
            j = 0;
            while (j < oldarr.length) {

                arr[j] = oldarr[j];

                j++;
            }
        } else {
            // у тебя эта операциия и if и в else, убери блок else и выполняй i++; перед arr[i - 1] = var
            i++;
        }


        arr[i - 1] = var;

    }

    public void add(int index, int var) {

        int j = 0;
        int[] oldarr = new int[arr.length];
        while (j < arr.length) {
            oldarr[j] = arr[j];
            j++;
        }
        i = arr.length + 1;
        arr = new int[i];
        arr[index] = var;
        j = 0;
        while (j < arr.length) {
            if (j < index) {
                arr[j] = oldarr[j];
                j++;
            } else if (j > index) {
                arr[j] = oldarr[j - 1];
                j++;
            } else j++;
        }

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < arr.length; i++) {

            s = s + arr[i];
            if (i != arr.length - 1) {
                s = s + ",";
            }
        }

        return "[" + s + "]";
    }

    public void remove(int index) {
        int[] oldarr = new int[arr.length];
        int i = 0;
        while (i < index) {
            oldarr[i] = arr[i];
            i++;
        }
        while (i < oldarr.length) {
            oldarr[i] = arr[i + 1];
            i++;
        }
        arr = new int[i];
        i = 0;
        while (i < arr.length) {
            arr[i] = oldarr[i];
            i++;
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public int indexOf(int Value) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == Value) return i;
            i++;
        }
        return -1;
    }

    public boolean isEmpty() {
        if (arr.length == 0) return true;
        return false;
    }

    public int size() {
        return arr.length;
    }

}