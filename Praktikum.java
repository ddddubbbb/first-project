import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
    }
    public static void welcomeUserByName() { // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

      public static void sayHelloByTime(){ // Объявите метод sayHelloByTime
        System.out.println("Который час?"); // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        Scanner scanner = new Scanner(System.in);
          int currentHour = scanner.nextInt();
            // В зависимости от времени предусмотрите печать приветствий 
    
          if (currentHour >=22) {  System.out.println("Доброй ночи!");}
           else if (currentHour <6) {  System.out.println("Доброй ночи!");}
              else if (currentHour <12) {  System.out.println("Доброе утро!");}
           else if (currentHour <18) {  System.out.println("Добрый день!");}
           else {  System.out.println("Добрый вечер!");}
                  
          }
public static void printSuccess() {// Объявите метод printSuccess
        System.out.println("У вас уже неплохо получается программировать!"); // Он должен печатать строку: У вас уже неплохо получается программировать!
}
}