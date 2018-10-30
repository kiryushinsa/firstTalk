import kiryushin.tips.codewars.*;
import kiryushin.tips.hackerrank.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void  main (String []args)
    {
        HackerRank Obj= new HackerRank();

        List<Integer> A= new ArrayList<>();
        List<Integer> B= new ArrayList<>();
        List<Integer> C= new ArrayList<>();
A.add(17);
A.add(28);
A.add(30);

        B.add(99);
        B.add(16);
        B.add(8);
 C=Obj.competitionPoints(A,B);

 System.out.println(C.get(0));

        System.out.println(C.get(1));

    }
}
