
import java.util.Scanner;

// dev branch for Y.Practicum
public class  Main {


    public static void main(String[] args) {

        int countPersons;//количество человек
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счёт?");


        while (true) {

            if (scanner.hasNextInt()) {
                countPersons = scanner.nextInt();

                if (countPersons <= 1) {
                    System.out.println("Некорректное значение, введите число больше 1");
                } else {
                    break;
                }
            } else {
                System.out.println("Ошибка,нужно ввести целочисленное число");

            }
            scanner.nextLine();

        }

        Products products = new Products();

        products.TotalproductAndPrice();


        double result=Products.totalPrice/countPersons;//подсчет сколько должен заплатить каждый

        Convert convert=new Convert();

        System.out.printf("К оплате с человека: %.2f %s ",result, Convert.convertRub(result));

    }
}








