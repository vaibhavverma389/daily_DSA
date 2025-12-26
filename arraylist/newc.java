package arraylist;


import java.util.*;

public class newc {
    public static void main(String[] args) {
        // System.out.println("vaiubhav");
        //initlising array
        ArrayList<Integer> list = new ArrayList<>();

        // adding element

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(2,6);
        // System.out.println(list);

        // removing element

        // list.remove(2);

        /// update or set element on a index

        // list.set(2, 11);

        //check elemnt exit or not

        // System.out.println(list.contains(11));
        ///using loop
        /// 
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

    /// reverse
    /// 
    


    //     for(int i=list.size()-1;i>=0;i--)
    //     {
    //         System.out.print(list.get(i) + " ");
    //     }
    // 

    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++)
    {
        if(max<list.get(i))
        {
            max=list.get(i);
        }
    }
    System.out.println(max);
    }
    
}
