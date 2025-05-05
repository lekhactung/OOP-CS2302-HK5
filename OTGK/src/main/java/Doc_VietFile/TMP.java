/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doc_VietFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LE TUNG
 */
public class TMP {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/resourses/data.txt");
        File fo = new File("src/main/resourses/data1.txt");

        try (Scanner sc = new Scanner(f); PrintWriter w = new PrintWriter(fo)) {
            while (sc.hasNext()) {
//            System.out.printf("%s - ", sc.next());
                w.printf("%s \t", sc.next());
            }
        }
    }
}
