package ru.otus.javabasic.homework6;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;

public class ResourceLevel {

    public String readFile(String fileName) {
        String status;
        try {
            System.out.println("Пытаемся прочитать файл "+ fileName +" с сетевого ресурса.....");
            throw new FileNotFoundException();
            //status =  "Success read";   //выводим данные если прочитали из файла
        } catch (Exception e) {
            status = "Во время чтения файла " + fileName + " произошла ошибка.";
            System.out.println(e);

        } finally {
            System.out.println("Закрываем все открытые ресурсы...");
        }
        System.out.println("Ошибку подавили. Программа работает дальше ...");
        return status;
    }


    public String readFromDataBase(String dbName) throws Exception {
        try {
            System.out.println("Подключаемся к базе данных ....");
            throw new Exception("Oops!");
        } catch (Exception e) {
            System.out.println("Проблемы подключения к базе данных ..." + dbName);
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public void doAnyWork() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        try (MyDataSource conn = new MyDataSource()) {
// Работаем с conn и stream
        } catch (Exception e){
// Обрабатываем исключения
        } finally {
// И даже можем тут, что-то сделать
        }
// Но к этому моменту conn и stream будут уже закрыты
    }
}

class MyDataSource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("метод заглушка.");
        System.out.println("закрываем соединение");
    }

    public Str getConnection() {
        System.out.println("Запускаем getConnection ....");
        return "Connection open";
    }
}