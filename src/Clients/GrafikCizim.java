package Clients;

import Veriler.Veri;
import java.awt.BasicStroke;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class GrafikCizim {

   
    private Vector<Veri> veriler;

    private SimpleDateFormat formatter;

    public GrafikCizim() {

        formatter = new SimpleDateFormat("d MMMM yyyy");
    }

    public JPanel grafikOlustur(Vector<Veri> veriler) {
        this.veriler = veriler;
        String chartBaslik = "";
        String xEkseni = "Günler";
        String yEkseni = "Kişi Sayısı";

        CategoryDataset dataset = datasetOlustur();

        JFreeChart chart = ChartFactory.createLineChart(chartBaslik,
                xEkseni, yEkseni, dataset, PlotOrientation.VERTICAL, true, true, false);

        chartDuzenle(chart);

        return new ChartPanel(chart);
    }

    private CategoryDataset datasetOlustur() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String vaka = "Vaka";
        String vefat = "Vefat";

        String[] tarihler = new String[veriler.size()];

        for (int i = 0; i < veriler.size(); i++) {
            tarihler[i] = formatter.format(veriler.get(i).getTarih());
        }

        for (int i = 0; i < veriler.size(); i++) {
            dataset.addValue(veriler.get(i).getVaka(), vaka, tarihler[i]);
            dataset.addValue(veriler.get(i).getVefat(), vefat, tarihler[i]);
        }

        return dataset;
    }

    private void chartDuzenle(JFreeChart chart) {   // here we make some customization
       
        chart.setBackgroundPaint(new Color(4, 147, 114));
        chart.getTitle().setPaint(new Color(255, 255, 255));
        chart.getLegend().setBackgroundPaint(new Color(4, 147, 114));
        chart.getLegend().setItemPaint(new Color(255, 255, 255));


        CategoryPlot plot = chart.getCategoryPlot();
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();

        renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());

        // sets paint color for each series
        renderer.setSeriesPaint(0, Color.ORANGE);
        renderer.setSeriesPaint(1, Color.RED);

        // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));

        plot.setRenderer(renderer);
        
        plot.setBackgroundPaint(new Color(4, 147, 114));

        plot.getDomainAxis().setTickLabelPaint(new Color(255, 255, 255));
        plot.getRangeAxis().setTickLabelPaint(new Color(255, 255, 255));

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

    }

}
