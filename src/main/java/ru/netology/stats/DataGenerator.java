package ru.netology.stats;


import com.github.javafaker.Faker;
import lombok.Value;
//import lombok.var;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    public DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("ru"));

    public static String generateCity() {
        var cities = new String[]{"Уфа", "Петрозаводск", "Сыктывкар", "Симферополь", "Йошкар-Ола", "Саранск", "Якутск", "Владикавказ", "Казань", "Москва"};
        return cities[new Random().nextInt(cities.length)];
    }

    public static String generateName() {
        return faker.name().fullName();
    }

    public static String generateDate(long days,String pattern) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String generatePhone(String locale) {
        return faker.phoneNumber().phoneNumber();
    }
}
//   }
//    void setUpAll() {
//
//        Faker faker;
//        }
//        faker = new Faker(new Locale("ru"));
//    }
//
//    public static String generateName(String locale) {
//        var faker = new Faker(new Locale("ru"));
//        return faker.name().fullName();
//    }
//
//    public static String generateCity() {
//        var cities = new String[]{"Уфа", "Петрозаводск", "Сыктывкар", "Симферополь", "Йошкар-Ола", "Саранск", "Якутск", "Владикавказ", "Казань", "Москва"};
//        return cities[new Random().nextInt(cities.length)];
//    }
//

//
//    public static String generatePhone(String locale) {
//        var faker = new Faker(new Locale(locale));
//        return faker.phoneNumber().phoneNumber();
//    }
//        public static UserInfo generateUser(String locale) {
//            return new UserInfo(generateCity(), generateName(locale), generatePhone(locale));
////
//        }
//
//    public static class Registration {
//        private Registration() {
//        }
//    }
//
//    @Value
//    public static class UserInfo {
//        String city;
//        String name;
//        String phone;


//    public static String generateCity(){
//        var cities = new String[]{"Уфа","Петрозаводск","Сыктывкар","Симферополь","Йошкар-Ола","Саранск","Якутск","Владикавказ","Казань","Москва"};
//        return cities[new Random().nextInt(cities.length)];
//         }
//    private String getFutureDate(int addDays) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate futureDate = currentDate.plusDays(addDays);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String formatDate = futureDate.format(formatter);
//        return formatDate;

//    public static String generateDate(int shift) {
//        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
//        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
//        return date;
//    public static class Registration {
//        private Registration() {
//        }
////
//    }