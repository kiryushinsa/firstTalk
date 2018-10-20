import kiryushin.tips.codewars.*;

public class main {

    public static void  main (String []args)
    {
        WorkWithArray ObjectA = new WorkWithArray(2);
        ObjectA.array[0]=2;
        ObjectA.array[1]=1;

        ObjectA.sort();
        ObjectA.print();
    }
}
