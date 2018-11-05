import java.util.Scanner;

public class HW {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        //Public - модификатор доступа
        Scanner scanner = new Scanner(System.in); //new - выделение памяти
        System.out.println("Как тебя зовут?: ");
        String name = scanner.nextLine(); //String - обьект <<>> name - переменная
        System.out.println("Привет, " + name + " сейчас я расскажу как я провёл своё лето!");

        work();
        System.out.println("Конец!");
    }

    public static void work() {
        System.out.println("Моё лето было разнообразным. Сначала я посетил Америку, Гранд Каньон, мне там очень понравилось. Я и мои родители поехали в путешествие по штатам, я увидел Америку, её культуру, как там живут люди. Мы жили в штате Колорадо в маленьком уютном городке Колорадо Спрингс. В средине лета я поехал с друзьями в Болгарию, мы там купались, загорали и гуляли. Отдых с друзьями по-моему самый весёлый, но всё таки я скучал за родителями. Остальную часть лета я провёл с семьёй дома. Вот такое у меня было лето! ");
    }
}