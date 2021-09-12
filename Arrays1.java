package org.itstep;

public class Arrays1 {
    static int size=10;
    static int [] arr=new int [size];

   public static void main(String[] args) {
	fillOrder();
	print();
	System.out.println(sum());
    }
    public static void fillOrder(){
        for (int i=0; i<size; i++)
            arr[i]=i+1;
    }
    public static void print(){
        for (int elem:arr) //для всех элементов
            System.out.print(elem+" ");
        System.out.println();
    }
    public static int sum(){
      int summ=0;
      for (int elem:arr)
          summ+=elem;
        return summ;
    }
}
