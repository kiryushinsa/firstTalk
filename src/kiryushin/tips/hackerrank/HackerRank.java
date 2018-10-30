package kiryushin.tips.hackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HackerRank
{

//два list, возвращает массив из двух элементов, где первый элемент массива сумма случаев
// когда ее элементы больше элементов на тех же позициях второго List у второго List, а второй элемент в тех когда больше List B.
  public   List <Integer> competitionPoints(List <Integer> A, List <Integer> B)
    {  List<Integer> C = new ArrayList<>();
             int a=0,b=0;
        for (int i = 0; i < A.size() ; i++)
        {
            if(A.get(i) > B.get(i)){ ++a;  }

            else if(A.get(i)<B.get(i)){b++;}

            else { }

        }

        C.add(a);
        C.add(b);
               

        return C;
    }

}
