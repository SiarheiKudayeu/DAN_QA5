package lesson3.Homework;

public class Task3 {
    /*
    Попробовать вывести на экран какое количество раз
    символ 'a' встречается в  строке:
            "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."
    используя метод split и информацию по поводу поля length

    Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.
    * */
    public static void main(String[] args) {
/*        String text = "Completely random text in English. In it, " +
                "we just need to determine how many times the character 'a'" +
                " occurs there. And we can use the split method and the length method.";

        String[] words = text.split("\\s");*/

        String string = "AppppppppppppAppppppppppApppppppppAppppppA";
        String[] strings = string.split("A");
        System.out.println(strings.length - 1);
        System.out.println(string.split("A")[0]);
        System.out.println(string.split("A")[strings.length-1]);
    }
}
