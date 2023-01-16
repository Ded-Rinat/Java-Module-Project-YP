

import java.util.Scanner;

public class Products {

    double priceProduct;// стоимость товара
    String nameProduct;// наименование товара
     static double totalPrice;// общая сумма
     String listProduct="Добавленные товары:";// список товаров

    Scanner scan = new Scanner(System.in);


    public void TotalproductAndPrice() {

        while (true) {
            System.out.println("Введите наименование товара");
            nameProduct = scan.next();
            System.out.println("Товар добавлен в калькулятор");
            listProduct += "\n"+nameProduct;

            System.out.println("Введите стоимость товара в формате рубли,копейки");
            while (true) {
                if (scan.hasNextDouble()) {
                    priceProduct = scan.nextDouble();

                    if (priceProduct <= 0) {
                        System.out.println("Стоимость д.б. больше 0, повторите ввод");

                    } else {
                        break;
                    }

                } else {
                    System.out.println("Введите корректное значение в цифрах");
                    scan.next();
                }
            }
                scan.nextLine();
            totalPrice += priceProduct;
            System.out.println("Желаете добавить еще товар? Если нет, то напишите \"завершить\"");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("завершить")) {
                break;
            }

            }

        System.out.println(listProduct);

    }
    }





