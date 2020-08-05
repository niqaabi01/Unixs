import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DamArrayApp {
    public static String CSVfile = "C:\\Users\\saani\\Downloads\\Dam_Levels_Individual_Nov2015-Mar2016 (1).csv";

    public static void main(String[] args) throws IOException {
        //checks if argumeants are given
        if (args.length>0){
            printDam(args[0]);
            System.out.println("Printing specific dam info");
        }else {
            printAllDams();
        }
    }
    private static void printAllDams() throws IOException {
        File file =new File("DamNames.txt");
         //creates new files
        file.createNewFile();
        //creates a file write object
        Writer writer = new FileWriter(file);
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(CSVfile))) {
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                if (lineNum == 0) {
                    lineNum++;
                    continue;
                }

                // use comma as separator
                String[] dam = line.split(cvsSplitBy);
                String outcome ="Dam: " + dam[2] + ", FSC: " + dam[10] + " , Dam level: " + dam[25];
                writer.write(outcome +"\n");
                System.out.println(outcome);
                

            }writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printDam(String damName) throws IOException {
        File file =new File("DamNames1.txt");
        //  creates new files
        file.createNewFile();
        // creates a file write object without overiding previously stored data
        Writer writer = new FileWriter(file, true);
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(CSVfile))) {
            int lineNum = 0;
            boolean found  = false;
            while ((line = br.readLine()) != null) {
                if (lineNum == 0) {
                    lineNum++;
                    continue;
                }

                // use comma as separator
                String[] dam = line.split(cvsSplitBy);
                String val =dam[2];
                // checks for specific dam if found
                if (val.contains(damName)){
                    System.out.println( "Dam: " + dam[2] + ", FSC: " + dam[10] + " , Dam level: " + dam[25]);
                    writer.write("Dam: " + dam[2] + ", FSC: " + dam[10] + " , Dam level: " + dam[25]+"\n");
                    found = true;
                }
        
            }

            if(found == false){
                System.out.println("Dam not found ever");
                writer.write("Dam not found");
            }
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            System.out.println("Dam not found");
            e.printStackTrace();
        }
    }

    }

