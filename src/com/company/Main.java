package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите имя : ");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Вы успешно задали имя. Ваше имя : "+user.getName());
                System.out.println("Введите возраст : ");
                Integer age = scanner.nextInt();
                user.setAge(age);
                System.out.println("Вы успешно задали возраст. Ваш возраст :"+user.getAge());
            }catch (IllegalNameLengthException e){
                System.out.println(e.getMessage());
            }catch (IllegalAgeException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}
