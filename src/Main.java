/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class Main {

    public static String[][] ReadFile(String rawFilePath) {

        try {
            File myFile = new File(rawFilePath);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (Exception ex) {
            System.out.print(Arrays.toString(ex.getStackTrace()));
        }

        return null;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a File Path : ");
            String str = sc.nextLine();              //reads string



    }

}
