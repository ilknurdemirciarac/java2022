package reCapDemo2;//array

public class Main {
    public static void main(String[] args) {
        //ders 15 : diziler tekrar

        //double[] myList=new double[4];
        //diğer yöntem
        double[] myList={1.2,6.3,4.3,5.6};

        for (double number:myList) {
            System.out.println(number);            
        }

        double total=0;
        for (double number:myList) {
            total=total+number;
            System.out.println(number);            
        }
        System.out.println("Toplam : "+total);
        double max=myList[0];
        for (double number : myList) {
            if(max<number){
                max=number;
            }
            
        }
        System.out.println("En Büyük : "+max);

    
    }
}
