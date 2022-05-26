package ru.otus.javabasic.homework7;

import java.io.File;
import java.util.Scanner;

public class ResourceLevel {

    public void readFile() {
        try {
            File myObj = new File("myFilename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace(System.out);
        }
//        finally {
//            System.out.println("Закрываем все открытые ресурсы...");
//        }
        System.out.println("Ошибку подавили. Программа работает дальше ...");
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

    public void doAnyWork()  {
        System.out.println("Call method doAnyWork");
        try (MyDataSource conn = new MyDataSource()) {
            System.out.println("doAnyWork start...");
            throw new Error("BIG CRASH!");
        } catch (Error e) {
            System.out.println("doAnyWork catch. Выбрасываем error.");
            throw e;
        }
        finally {
            System.out.println("doAnyWork Finaly");
        }
        //System.out.println("Конец");
    }
}

class MyDataSource implements AutoCloseable {
    public MyDataSource() {
        System.out.println(getConnection());
    }

    @Override
    public void close()  {
        System.out.println("Метод заглушка.");
        System.out.println("Закрываем соединение");
    }

    private String getConnection() {
        System.out.println("Инициализация соединения");
        return "Connection open";
    }
}