public class Ejercicio1 {
    public static void main(String[] args) {
        //FECHA 22/04/2022
        int day = 22;
        int month = 04;
        int year = 2022;

        System.out.println("El día es: " + (day <=31&&(day>=1)));
        System.out.println("El mes es: " + (month<=12&&(month>=1)));
        System.out.println("El año es: " + (year<=3000&&(year>=1000)));

        if (day <=31&&(day>=1)) {
            System.out.println("El día es valido");
        }else {
            System.out.println("El día es invalido");
        }
        if (month<=12&&(month>=1)){
            System.out.println("El mes es valido");
        }else {
            System.out.println("el mes es invalido");
        }
        if (year<=3000&&(year>=1000)){
            System.out.println("El año es valido");
        }else {
            System.out.println("el año es invalido");
        }

    }
}
