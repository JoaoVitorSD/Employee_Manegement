package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("src/in.txt");
        try {
            Scanner sc = new Scanner(file);
            System.out.println("Enter department's name: ");
            Department department = new Department(sc.nextLine());
            System.out.println("Enter worker data:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Level: ");
            WorkerLevel level = WorkerLevel.valueOf(sc.nextLine().toUpperCase());
            System.out.println("Base salary: ");
            Double salary = sc.nextDouble();
            Worker worker = new Worker(name, level, salary);
            System.out.println("How many contracts to this worker? ");
            Integer contractCount = sc.nextInt();
            sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                for (int i = 1; i <= contractCount; i++) {
                    System.out.println("Enter contract #" + i + " data: ");
                    Date date = sdf.parse(sc.nextLine());
                    System.out.println("Value per hour: ");
                    Double valuePerHour = sc.nextDouble();
                    System.out.println("Duration (hour): ");
                    Integer hours = sc.nextInt();
                    sc.nextLine();
                    worker.addContract(new HourContract(date, valuePerHour, hours));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Enter month and year to calculate income (MM/YYYY): ");
            String date = sc.nextLine();
            System.out.println(worker.getInfo(department.getName(), date));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
