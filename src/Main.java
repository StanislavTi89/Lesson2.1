public class Main {
    public static void main(String[] args) {
        System.out.println("ООП_Введение");

        Car car = new Car ("Lada", "Granda", "объем двигателя 1,7 Литра", "2015 год выпуска", "сборка в России", "желтого цвета");
        System.out.println(car);
        Car car1 = new Car("Audi A8", "50 L TDI quattro", "объем двигателя 3,0 л", "2020 год выпуска", "сборка в Германии", "черный цвет кузова");
        System.out.println(car1);
        Car car2 = new Car("BMW", "Z8", "объем двигателя 3,0 л", "2021 год выпуска", "сборка в Германии", "черный цвет кузова");
        System.out.println(car2);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", "объем двигателя 2,4 л", "2018 год выпуска", "сборка в Южной Корее", "цвет кузова красный");
        System.out.println(car3);
        Car car4 = new Car("Hyundai", "Avante", "объем двигателя 1,6 л", "2016 год выпуска", "сборка в Южной Корее", "цвет кузова — оранжевый");
        System.out.println(car4);
    }
}