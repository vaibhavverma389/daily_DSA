public class inheri {
    public static void main(String[] args) {
        fish tuna=new fish();
        tuna.eat();
    }
    
}

class animal{
    void eat()
    {
        System.out.println("eating");
    }
    void breathe()
    {
        System.out.println("breathing");
    }
    String color;
}

class fish extends animal
{
    int wings;
    void swim()
    {
        System.out.println("swimming");
    }
}
