package ru.otus.javabasic.homework6;

public class ApplicationLevel {
    private  String data1;
    private  String data2;
    private ResourceLevel resources;

    public ApplicationLevel() {
        this.resources = new ResourceLevel();
    }

    public String read(String file){
        data1 = resources.readFile(file);
        return data1;
    }

   public String readDb(String dbName){
       try {
           data2 = resources.readFromDataBase("Oracle");
       } catch (Exception e) {
           //  System.out.println(e);
           throw new RuntimeException(e);
       }
       return data2;
   }


}
