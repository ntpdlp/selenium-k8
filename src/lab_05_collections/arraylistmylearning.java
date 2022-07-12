package lab_05_collections;

import java.util.ArrayList;
import java.util.List;

public class arraylistmylearning {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        //CRUD approach to all data types: TIPS

        //Create
        nums.add(new Integer(1));
        nums.add(2);
        nums.add(5);
        System.out.println(nums);

        //Read
        System.out.println(nums.get(1));

        //Update
        nums.set(1,11111111);
        System.out.println(nums);

        //Delete
        nums.remove(0);
        System.out.println(nums);


    }
}
