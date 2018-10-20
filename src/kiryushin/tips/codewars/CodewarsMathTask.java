package kiryushin.tips.codewars;

public class CodewarsMathTask
{
    //выводит индекс элемента в массиве у которого сумма элементов справа и слева равны другдругу
    int findIndexSummRightandLeft(int [] array)
    {

int indexOtvet=-2;

        for(int i=0; i<array.length;i++)
        {
            int left=0, right=0;
            int index=i;

            while(index>0)
            {
                index--;
                left = left + array[index];
            }
index=i;
            while(index<array.length-1)
            {
                index++;
                right= right + array[index];
            }

            if(right==left){indexOtvet=i; break;}
        }

        if(indexOtvet!=-2){return indexOtvet;}
        else{return -1;}

    }

    //находит сумму элементов в диапазоне от от а до б
     public int findSum(int a,int b)
     {int summ=0;

     // -1 2 // 0 -1

       if(a<b)
       {
           while (a <= b) {
               summ += a;
               ++a;
           }
       }

else {
           while (a >= b) {
               summ += (a);
               --a;

           }
       }


          return summ;
     }


}
