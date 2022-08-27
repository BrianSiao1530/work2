//This project purpose is making
//
public class work2 {
    public static void main(String[]arg){
    int size = 5; // 由調整size 獲得想要的大小
        triangle(size);
        line(size);
        mid1(size);
        mid2(size);
        line(size);
        mid2(size);
        mid1(size);
        triangle(size);
    }
    //做出火箭的頂端及尾端
    public static void triangle(int x) {
        int num = x * 2 - 1;
        for (int y = 0; y < num; y++)
        {
            for( int w = y; w < num; w++)
                System.out.print(" ");
            for ( int z = 0;  z <= y; z++)
                System.out.print("/");
            System.out.print("**");
            for (int v = 0; v <= y; v++)
                System.out.print("\\");
            System.out.print("\n");
        }
    }
    //做出由+=*組成的一直線
    public static void line(int x){
        System.out.print("+");
        int num = x * 2 - 1;
        for(int i = 0; i <= num; i++)
            System.out.print("=*");
        System.out.println("+");
    }
    //做出內部菱形的機身
    public static void mid1(int x){
     for(int q = 0; q < x; q++)
     {
         System.out.print("|");
         for (int b = q + 1; b < x; b++)
             System.out.print(".");
         for(int p = x - q; p <= x; p++)
             System.out.print("/\\");
         for (int b = q + 1; b < x; b++)
             System.out.print(".");
         for (int b = q + 1; b < x; b++)
             System.out.print(".");
         for (int p = x - q; p <= x;p++)
             System.out.print("/\\");
         for (int b = q + 1; b < x; b++)
             System.out.print(".");
         System.out.print("|");
         System.out.println();
     }
    }

    //做出內部是叉叉的圖示
    public static void mid2(int x){
        for(int y = 0; y < x; y++){
            System.out.print("|");
            for(int z = x - y; z < x; z++)
                System.out.print(".");
            for(int q = y; q<x; q++)
                System.out.print("\\/");
            for(int z = x - y; z < x; z++)
                System.out.print(".");
            for(int z = x - y; z < x; z++)
                System.out.print(".");
            for(int q = y; q < x; q++)
                System.out.print("\\/");
            for(int z = x - y; z < x; z++)
                System.out.print(".");
            System.out.println("|");
        }
    }
}