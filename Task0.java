import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Task0
 */
public class Task0 {

  public static void main(String[] args) {
    /* 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

 */
    task0();
  }

  static void task0() {
    List <Integer> list = new ArrayList<>();
    List <Integer> linked = new LinkedList<>();
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }
    long end = System.currentTimeMillis();
    

    for (int i = 0; i < 10000; i++) {
      linked.add(i);      
    }
    long secondEnd = System.currentTimeMillis();
    System.out.println(end - start);
    System.out.println(secondEnd - end);
  }
}
