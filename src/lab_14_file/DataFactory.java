package lab_14_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFactory {

    public static void main(String[] args) {
        String dataFileRelativePath = "src/lab_14_file/testdata.txt";
        String dataFileAbsolutePath = System.getProperty("user.dir").concat("/").concat(dataFileRelativePath);
        readFile(dataFileAbsolutePath);

        List<Person> persons = readDataFileIntoPersonList(dataFileAbsolutePath);
        System.out.println(persons);

        String dataSavedFileRelativePath = "src/lab_14_file/output.txt";
        String dataSavedFileAbsolutePath = System.getProperty("user.dir").concat("/").concat(dataSavedFileRelativePath);
        List<Person> friends = Arrays.asList(new Person("Adnan",25,200000),new Person("Jak",28,180000));
        saveDataToFile(friends,dataSavedFileAbsolutePath);
    }

    public static void readFile(String filePath){
        System.out.println("Reading file from: ".concat(filePath));

        //[source] -------- [Lu/ca/ly] to contain stream

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
                String dataLine = bufferedReader.readLine();
                while(dataLine!=null){
                    System.out.println(dataLine);
                    dataLine = bufferedReader.readLine();
                }

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("[ERR] File not found!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<Person> readDataFileIntoPersonList(String filePath){
        List<Person> persons = new ArrayList<>();

        System.out.println("Reading file from: ".concat(filePath));

        //[source] -------- [Lu/ca/ly] to contain stream

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while(dataLine!=null){
                String[] personData = dataLine.split(";");
                String name = personData[0];
                int age = Integer.valueOf(personData[1]);
                int salary = Integer.parseInt(personData[2]) ;
                persons.add(new Person(name,age,salary));
                dataLine = bufferedReader.readLine();
            }

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("[ERR] File not found!");
        }catch(Exception e){
            e.printStackTrace();
        }

        return persons;
    }

    private static void saveDataToFile(List<Person> persons, String filePath){

        if(persons==null || filePath==null){
            throw new IllegalArgumentException("[ERR] Person List or filePath can not be null.");
        }

        if(persons.isEmpty()){
            System.out.println("[WARN] No Data to read");
            return;
        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {

            for(Person person:persons){
                String name = person.getName();
                int age = person.getAge();
                int salary = person.getSalary();
                String dataLine = name.concat(";").concat(String.valueOf(age)).concat(";").concat(String.valueOf(salary));
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
