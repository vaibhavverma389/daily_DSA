package arraylist;

import java.util.ArrayList;

public class lonlyn {
    public static ArrayList<Integer> lonlynumber(ArrayList<Integer> list)
{
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < list.size(); i++)
    {
        boolean temp = true;

        for (int j = 0; j < list.size(); j++)
        {
            if (i == j) continue; 
            if (list.get(i) == list.get(j)) {
                temp = false;  
                break;
            }

            if (list.get(i) + 1 == list.get(j) ||
                list.get(i) - 1 == list.get(j))
            {
                temp = false;
                break;
            }
        }

        if (temp)
        {
            arr.add(list.get(i));
        }
    }
    return arr;
}

  
public static void main(String[] args) {;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        System.out.println(lonlynumber(list));

    }
    
}
