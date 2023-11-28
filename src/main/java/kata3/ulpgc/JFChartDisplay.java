package kata3.ulpgc;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JFChartDisplay extends JPanel implements HistoDisplay {
    @Override
    public void show(DataProvider provider) {
        ArrayList<Integer> edades = provider.getEdades("src/main/java/kata3/ulpgc/datos.csv");

        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Edades", edades.stream().mapToDouble(Integer::doubleValue).toArray(),14);

        JFreeChart histo = ChartFactory.createHistogram(
                "",
                "ages",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                false,false,false);
        add(new ChartPanel(histo));
    }
}
