package kata3.ulpgc;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private HistoDisplay histodisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Histograma de Edades");
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistoDisplay());
    }

    private Component createHistoDisplay() {
        JFChartDisplay display = new JFChartDisplay();
        this.histodisplay = display;
        return display;
    }

    public HistoDisplay histogramDisplay() {
        return histodisplay;
    }
}
