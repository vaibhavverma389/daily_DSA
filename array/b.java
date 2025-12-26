package array;

public class b {
    public static void update(int[] marks)
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]++;
        }
    }
    public static void main(String[] args) {
        int[] marks={67,78,89};
        update(marks);
        for(int i:marks)
        {
            System.out.print(i + "  ");
        }
        
    }
    
}
