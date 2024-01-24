import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      MyArrList MyArr=new MyArrList();
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(5);
      MyArr.add(1);
      MyArr.add(1);
      MyArr.add(2);
     // MyArr.add(1,5);
        MyArr.add(345);
      //  MyArr.add(3,7);
     // MyArr.add(3,8);
        MyArr.add(3);
//      System.out.println(MyArr);
     //   MyArr.remove(0);
      System.out.println(MyArr.indexOf(3));
//        System.out.println(MyArr.get(0));
      System.out.println(MyArr);
      System.out.println(MyArr.isEmpty());
      System.out.println(MyArr.size());
    }

}