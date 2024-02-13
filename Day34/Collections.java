import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(23);
        nums.add(78);
        nums.add(56);

        for (int obj : nums)
            System.out.println(obj);

        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(5);
        nums1.add(23);
        nums1.add(78);
        nums1.add(5);

        System.out.println(nums1.indexOf(23));

        // Set<Integer> set = new HashSet<Integer>();//unsorted list
        Set<Integer> set = new TreeSet<Integer>();// sorted lsit
        set.add(5);
        set.add(23);
        set.add(78);
        set.add(5);

        for (int obj : set)
            System.out.println(obj);

    }

    public static void sort(List<Integer> nums) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}