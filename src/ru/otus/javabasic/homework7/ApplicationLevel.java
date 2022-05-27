package ru.otus.javabasic.homework7;

public class ApplicationLevel {
    private boolean data1;
    private String data2;
    private final ResourceLevel resources;

    public ApplicationLevel() {
        this.resources = new ResourceLevel();
    }

    public void read() {
        resources.readFile();
    }

    public String readDb(String dbName) {
        try {
            data2 = resources.readFromDataBase("Oracle");
        } catch (Exception e) {
            System.out.println("Проблемы подключения в БазеДанных " + e);
            e.printStackTrace(System.out);
        }
        return data2;
    }

    public void readFromResource() {
        resources.doAnyWork();
    }


}
