public class Degiskenler {
    public static void main(String[] args) {
        int not = 55;
        //50 ve üzeri : geçti
        //40-49 : bütünleme
        //0-39 : Kaldı

        if (not>=50){
            System.out.println("Gecti");
        } else if (not>=40){
            System.out.println("Bütünleme");
        } else if (not<40){
            System.out.println("Kaldı");
        }


    }
}
