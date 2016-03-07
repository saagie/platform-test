package io.saagie.javastatistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.Random;

public class RunMe {
    private static DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            descriptiveStatistics.addValue(random.nextDouble() * (random.nextInt(200) + 1));
        }

        System.out.println("Version 5.2");
        System.out.println("Sum : " + descriptiveStatistics.getSum());
        System.out.println("Min : " + descriptiveStatistics.getMin());
        System.out.println("Max : " + descriptiveStatistics.getMax());
        System.out.println("Mean : " + descriptiveStatistics.getMean());
        System.out.println("Median : " + descriptiveStatistics.getPercentile(50.0D));
        System.out.println("Standard deviation : " + descriptiveStatistics.getStandardDeviation());
    }
}
