import java.util.ArrayList;
import java.util.Collections;

public class TodoListDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Проснуться по будильнику");
        tasks.add("Заварить кофе");
        tasks.add("Сделать утренню зарядку");

        System.out.println("Исходный список задач:");
        printTasks(tasks);

        tasks.remove(1);
        System.out.println("После удаления второй задачи:");
        printTasks(tasks);

        String taskToFind = "Сделать утреннюю зарядку";
        System.out.println("Есть ли задача \"" + taskToFind + "\": " + tasks.contains(taskToFind));

        Collections.sort(tasks);
        System.out.println("Отсортированный список задач:");
        printTasks(tasks);
    }

    private static void printTasks(ArrayList<String> tasks) {
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
