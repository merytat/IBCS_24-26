package Persistance;

import java.io.*;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String task = "";

        //Create file
        File file1 = new File("Resources/tasks.txt");
        file1.createNewFile();

        //Open stream and the fileWriter
        FileWriter fw = new FileWriter(file1, true);
        PrintWriter pw = new PrintWriter(fw);

        while(!task.equals("Done")) {
            System.out.print("Enter a task or Done to finish: ");
            task = kb.nextLine();
            if (!task.equals("Done")) {
                //System.out.println(task);
                pw.println(task); //writing on file
            }
        }

        //close file
        pw.flush();
        pw.close();
        fw.close();

        //Read and print all task
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);

        //loop through the file and print each line until null is found
        String line = "";
        while((line = br.readLine()) != null){
            System.out.println(line);
        }


    }
}
