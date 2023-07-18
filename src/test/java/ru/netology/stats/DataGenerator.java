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
    private DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("ru"));

    public static String generateCity() {
        var cities = new String[]{"Уфа", "Петрозаводск", "Сыктывкар", "Симферополь", "Йошкар-Ола", "Саранск", "Якутск", "Владикавказ", "Казань", "Москва"};
        return cities[new Random().nextInt(cities.length)];
    }

    public static String generateName() {
        return faker.name().fullName();
    }

    public static String generateDate(long days, String pattern) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern(pattern));
    }
}