public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 (){
        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то нужно немного подождать");
        }
    }
    public static void task2 (){
        int temperature = 4;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, шапку можно не надевать");
        }
    }
    public static  void task3 (){
        int speed = 56;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
    }
    public static  void  task4 (){
        int myAge = 24;

        if (myAge >= 2 && myAge <= 6) {
            System.out.println("Если возраст человека равен " + myAge +", то ему нужно ходить в садик");
        }
        else if (myAge > 6 && myAge <= 17) {
            System.out.println("Если возраст человека равен " + myAge + ", то ему нужно ходить в школу");
        }
        else if (myAge > 17 && myAge <= 24) {
            System.out.println("Если возраст человека равен " + myAge +", то ему нужно ходить в университет");
        }
        else if (myAge > 24) {
            System.out.println("Если возраст человека равен " + myAge +", то ему нужно ходить на работу");
        }
    }
    public static void task5 (){
        int age = 10;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 (){
        int capacity = 102;
        int seatedCapacity = 60;
        int standingPassengers = capacity - seatedCapacity;
        int passengers = 80; // Пример: 80 пассажиров

        if (passengers <= seatedCapacity) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (passengers >= seatedCapacity) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне больше нет свободных мест");
        }
    }
    public static void task7 (){
        int one = 1;
        int two = 5;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }





}