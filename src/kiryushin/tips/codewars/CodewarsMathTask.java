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
     public int findSumInDiapazone(int a,int b)
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
//находит в массиве чисел уникальное число и выводит его
     public double   findUniq (double ... arr)
     {
         double a=arr[0];
         double  b=0;
         int a2=0,b2=0;

         for (double c: arr)
         {
            if(a!=c) {  b=c; b2++;         }
            else a2++;


         }

if (a2>b2)return b;
else return a;

     }

     public boolean checkCard(String cardnumber)
     {

        int lenCardNumber = cardnumber.length();
String cardResult="";

        for(int i=0; i<lenCardNumber; i++)
        {
            if(i!=0 && (i%2)!=0) { cardResult = cardResult.concat(String.valueOf(cardnumber.charAt(i)));     }
            else {
                cardResult = cardResult.concat(String.valueOf(cardnumber.charAt(i)));
            }

        }





         return true;

     }


}
