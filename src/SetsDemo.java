import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

    public static void main(String[] args) {

        /* HashSet - Does not maintain order. Set only stores *unique* elements.
        It's faster because it doesn't do anything
         */
        Set<String> set = new HashSet<String>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");

        System.out.println("HashSet");
        for (String item: set) {
            System.out.println(item);
        }

        // LinkedHashSet - It maintains the order in which the elements are added
        Set<String> lHSet = new LinkedHashSet<String>();
        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        System.out.println("Linked");
        for (String item: lHSet) {
            System.out.println(item);
        }

        // TreeSet - It maintains the natural sorting 1, 2, 3... alphabetical, which makes it a little bit slower.
        Set<String> tSet = new TreeSet<String>();
        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        System.out.println("Tree");
        for (String item: tSet) {
            System.out.println(item);
        }

        List<String> list = new ArrayList<String>();

        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");
        System.out.println("List");
        System.out.println(list);

    }

}
