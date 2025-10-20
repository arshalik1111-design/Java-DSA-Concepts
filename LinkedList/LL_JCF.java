import java.util.LinkedList; //JCF-Optimized functions i.e best time and space complexieties

public class LL_JCF {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

    }
}
