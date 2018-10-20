public class WorkWithArray
{
    int [] array;

    WorkWithArray(){array =  new int [1]; }

    WorkWithArray(int i){ array =  new int [i]; }

    void addArray(int i){ array = new int [i]; }

    void sort( )
    {
        for (int a:array)
        {
          if ( a>array[a+1] ) { int b; b=array[a+1]; array[a+1]=a; a=b;    }
        }
    }


    void print (){
        for (int a:array) {
            System.out.print(a);
        }}
}
