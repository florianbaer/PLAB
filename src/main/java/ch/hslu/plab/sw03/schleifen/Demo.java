package ch.hslu.plab.sw03.schleifen;

public class Demo {

    public static void getOneToTenFor(){
        for (int counter = 0; counter <= 10; counter++){
            System.out.println(counter);        }
    }

    public static void getOneToTenDo(){
        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
        } while(counter <= 10);
    }

    public static void getOneToTenWhile(){
        int counter = 0;
        while(counter <= 10){
            System.out.println(counter);
            counter++;
        }
    }

    public static void incrementToOne(){
        float counter = 0.9f;
        int countOfLoops = 0;
        do{
            counter += 0.000025f;
            countOfLoops++;
        } while(counter <= 1.0f);
        System.out.println(counter);
        System.out.println(countOfLoops);
    }

    public static void printBox(int heigth, int width){
        int heighCount = 0;
        int widthCount = 0;
        do{
            do{
                if(heighCount == 0 || (heighCount+1) == heigth || widthCount == 0 || (widthCount+1) == width){
                    System.out.print('#');
                }
                else{
                    System.out.print(' ');
                }
                widthCount++;
            } while(widthCount < width);
            widthCount=0;
            System.out.println();
            heighCount++;
        } while(heighCount < heigth);

    }

}
