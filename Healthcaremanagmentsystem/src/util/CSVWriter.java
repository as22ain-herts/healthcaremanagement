/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void appendLine(String filePath, String line) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write("\n" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
