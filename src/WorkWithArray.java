public class WorkWithArray
{
    int [] array;

    WorkWithArray(){array =  new int [1]; }

    WorkWithArray(int i){ array =  new int [i];  }

    void intialize(){
        for(int a=0,  b=10;a<array.length;a++,b--){array[a]=b;}
    }


    void sort( )
    {
        for(int i=0,a;i<=array.length-1;i++)
        {
            if (i < array.length && array[i] > array[i+1]) { a=array[i]; array[i]=array[i+1]; array[i+1] =a;               }
    }

    }


    void print (){
        for (int a:array) {
            System.out.println(a);
        }}
}
