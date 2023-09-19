public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 (){
        int a=17;
        int b=18;
        int user = a + (int) (Math.random() * ((b - a) + 1));
        if (user >= 18)  {
            System.out.println("Если возраст человека равен " + user + " , то он достиг совершеннолетия");
        }

        else {
            System.out.println("Если возраст человека равен " + user + " , то он не достиг совершеннолетия");
        }
    }



}