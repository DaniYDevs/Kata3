package kata3.ulpgc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        String path = "src/main/java/kata3/ulpgc/datos.csv";
        mainFrame.histogramDisplay().show(new DataProvider() {
            @Override
            public ArrayList<Integer> getEdades(String path) {
                ArrayList<Integer> edades = new ArrayList<>();

                try (BufferedReader br = new BufferedReader(new FileReader(path))){
                    String line;
                    br.readLine();

                    while((line = br.readLine()) != null){
                        String[] partes = line.split(";");

                        edades.add(Integer.parseInt(partes[1]));
                    }

                } catch (IOException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    e.printStackTrace();
                }
                return edades;
            }
        });
        mainFrame.setVisible(true);
    }
}