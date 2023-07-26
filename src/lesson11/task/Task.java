package lesson11.task;

import java.util.Scanner;

public class Task {
/*
    Написати консольну програму "планувальник завдань на тиждень".

    Технічні вимоги:


    Створити двовимірний масив рядків розмірністю 7х2
    String[][] scedule = new String[7][2]


    Заповніть матрицю значеннями день тижня: головне завдання на цей день:
    scedule[0][0] = "Sunday";
    scedule[0][1] = "do home work";
    scedule[1][0] = "Monday";
    scedule[1][1] = "go to courses; watch a film";


    Використовуючи цикл та оператор switch, запитайте у користувача день тижня в консолі, залежно від введення:

    програма: Please, input the day of the week:
    користувач вводить коректний день тижня (f.e. Monday)
    програма виводить на екран Your tasks for Monday: go to courses; watch a film.;
    програма йде на наступну ітерацію;
    програма: Please, input the day of the week:
    користувач вводить некоректний день тижня (f.e. %$=+!11=4)
    програма виводить на екран Sorry, I don't understand you, please try again.; програма йде на наступну ітерацію до успішного введення;
    програма: Please, input the day of the week:
    користувач виводить команду виходу exit
    програма виходить із циклу і коректно завершує роботу.



    Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
    Зверніть увагу: програма повинна приймати команди як у нижньому регістрі (monday) так і у верхньому (MONDAY) і врахуйте, що користувач міг випадково після дня тижня ввести пробіл.*/

    /*   Необов'язкове завдання просунутої складності:
       Доопрацюйте програму так, щоб при введенні користувачем фрази change
         [day of the week] або reschedule [day of the week],
       програма запропонувала ввести нові завдання для даного дня тижня
        і зберегла їх у відповідному осередку масиву, видаливши при цьому старі завдання.
         Після цього програма йде на наступну ітерацію до введення exit.

       програма: Please, input the day of the week:

       Користувач вводить change Monday

       програма пропонує ввести нові завдання на понеділок Please, input new tasks for Monday.

       Користувач вводить нові завдання в консоль
       програма зберігає нові завдання у відповідний осередок
       програма пішла на нову ітерацію і під час введення "Monday" видає вже нові завдання.*/
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "dot";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "dow";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "dot2";
        scedule[5][0] = "Friday";
        scedule[5][1] = "dof";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "dos";
        System.out.println("Please, input the day of the week");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("EXIT")) {

            if (input.contains("change") || input.contains("reschedule")) {
                String day = input.split("\\s")[1];

                for (int i = 0; i < 7; i++){
                    if(scedule[i][0].equals(day)){
                        System.out.println("ввести нові завдання для " + day);
                        String newTask = scanner.nextLine();
                        scedule[i][1] = newTask;
                        break;
                    }
                }
                input = day;
            }

            switch (input) {
                case "Sunday":
                    System.out.println(scedule[0][1]);
                    break;

                case "Monday":
                    System.out.println(scedule[1][1]);
                    break;

                case "Thuesday":
                    System.out.println(scedule[2][1]);
                    break;

                case "Wednesday":
                    System.out.println(scedule[3][1]);
                    break;
                case "Thuersday":
                    System.out.println(scedule[4][1]);
                    break;
                case "Friday":
                    System.out.println(scedule[5][1]);
                    break;
                case "Saturday":
                    System.out.println(scedule[6][1]);
                    break;
                default:
                    System.out.println("Я вас не пон");
            }
            System.out.println("Please, input the day of the week");
            input = scanner.nextLine();
        }
    }
}
