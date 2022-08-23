import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        Element element = new Element();
        try(Scanner sc = new Scanner(new File("src/in.txt"))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                element.add(line);
//                try{
//                    integers.add(Integer.parseInt(line));
//                }catch(NumberFormatException e){
//                  doubles.add(Double.parseDouble(line));
//                }

            }
            element.print();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}