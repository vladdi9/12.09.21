package org.itstep;

public class While3 {
    public static void main(String[] args) {
        //Проверить, содержит ли строка букву "a"
        While1();
        DoWhile1();
        TaylorSeries();
    }
    public static void While1(){
        String s = "okpkmnjmnopjknml";
        int  length = s.length();
        boolean flag = false;
        int i = 0;
        while (s.charAt(i) != 'a' && (i< length - 1))
            i++;
        if (i<length-1 || s.charAt(i)== 'a')
            flag = true;
        System.out.println(flag);
    }
    public static void  DoWhile1(){
        String s = "aokpkmnjmnopjknml";
        int  length = s.length();
        boolean flag = false;
        int i = -1;
        do i++;
        while (s.charAt(i) != 'a' && (i< length - 1));
        if (i<length-1 || s.charAt(i)== 'a')
            flag = true;
        System.out.println(flag);
    }
    public  static  void TaylorSeries(){
        //sin(x) = x-x^3/3!+x^5/5!-x^7/7!+...
        double x=Math.PI/6, summ=0, eps=1e-10,a=x, denom=1;
        int i=1;
        while (Math.abs(a)>eps){
            summ += a;
            denom *=(i+1)*(i+2);
            a *= x*x;
            a *=-x*x/denom;
            i += 2;
        }
        System.out.printf("%f,%f%n",Math.sin(x),summ );
    }
}
