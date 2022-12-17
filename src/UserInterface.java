import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void menu() {
        boolean flag = true;
        int userClick;
        String userSearch;
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(MovieData.movie1);
        movieList.add(MovieData.movie2);
        movieList.add(MovieData.movie3);
        movieList.add(MovieData.movie4);
        movieList.add(MovieData.movie5);
        movieList.add(MovieData.movie6);
        movieList.add(MovieData.movie7);
        movieList.add(MovieData.movie8);
        movieList.add(MovieData.movie9);
        movieList.add(MovieData.movie10);
        movieList.add(MovieData.movie11);
        movieList.add(MovieData.movie12);
        while (flag) {
            System.out.println("Добро пожаловать в 'ОКино'");
            System.out.println("Введите цифру пункта меню для продолженния");
            System.out.println("==========================****************==============================");
            System.out.println("1.Просмотреть все фильмы");
            System.out.println("2.Поиск фильма");
            System.out.println("3.Завершить работу");
            System.out.println("==========================****************==============================");
            userClick = scan.nextInt();
            if (userClick == 1) {
                Movie.viewAllMovies(movieList);
            } else if (userClick == 2) {
                System.out.println("Выберите параметр для поиска");
                System.out.println("==========================****************==============================");
                System.out.println("1.По названию");
                System.out.println("2.По стране");
                System.out.println("3.По жанру");
                System.out.println("4.Возврат в главное меню");
                System.out.println("==========================****************==============================");
                userClick = scan.nextInt();
                if (userClick == 1) {
                    System.out.println("Введите название фильма, или его часть: ");
                    userSearch = scann.nextLine();
                    if (!userSearch.isEmpty()) {
                        Movie.searchByName(movieList, userSearch);
                    } else {
                        System.out.println("Некорректный ввод. Возврат в главное меню");
                        menu();
                    }
                } else if (userClick == 2) {
                    System.out.println("Введите название страны, или ее часть: ");
                    userSearch = scann.nextLine();
                    if (!userSearch.isEmpty()) {
                        Movie.searchByCountry(movieList, userSearch);
                    } else {
                        System.out.println("Некорректный ввод. Возврат в главное меню");
                        menu();
                    }
                } else if (userClick == 3) {
                    System.out.println("Введите название жанра, или его часть: ");
                    userSearch = scann.nextLine();
                    if (!userSearch.isEmpty()) {
                        Movie.searchByGenre(movieList, userSearch);
                    } else {
                        System.out.println("Некорректный ввод. Возврат в главное меню");
                        menu();
                    }
                } else if (userClick == 4) {
                    menu();
                } else {
                    System.out.println("Некоректный ввод. Возврат в главное меню");
                    menu();
                }
            } else if (userClick == 3) {
                flag = false;
            } else {
                System.out.println("Некоректный ввод. Возврат в главное меню");
            }
        }
        scan.close();
        scann.close();
    }
}
