public class Main {
    public static void main(String[] args) {
        // 1. Завдання для привітання
        System.out.println("hi Roma");
        System.out.println("------------------------");

        // 2. Змінні
        String taskName = "Testing system";
        int testCasesCount = 15;
        double passRate = 95.5;
        boolean isPassed = true;

        System.out.println("Назва завдання:" + taskName);
        System.out.println("Кількість тест-кейсів:" + testCasesCount);
        System.out.println("Відсоток успіху:"+ passRate + "%");
        System.out.println("Статус тестування пройдено:" + isPassed);
        System.out.println("------------------------");

        // 3. Завдання на перевірку віку
        int age = 20;
        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }
        System.out.println("------------------------");

        // 4. Перевірка дня тижня
        String day = "Saturday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Невідомий день");

        }
        System.out.println("------------------------");

        // 5. Числа від 1 до 5
        for (int i = 1; i<= 5; i++) {
            System.out.println("Число:" + i);
        }
        System.out.println("------------------------");

        // 6. Пошук елемента в масиві
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;

        int resultIndex = findElement(numbers, target);
        if (resultIndex != -1) {
            System.out.println("Елемент" + target + "знайдено за індексом:" + resultIndex);
        } else {
            System.out.println("Елемент" + target+ "не знайдено в масиві" );
        }
    } public  static  int findElement(int [] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == elementToFind) {
                return i;

            }
        }

        return -1;}
}