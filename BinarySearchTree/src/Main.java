import entities.Tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/in.txt");
        Tree tree = new Tree();
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String operation = line.split(" ")[0];
                System.out.println(operation);
                if(operation.equals("add")){
                    tree.add(Integer.parseInt(line.split(" ")[1]));
                }else if(operation.equals("print")){
                    tree.print();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}