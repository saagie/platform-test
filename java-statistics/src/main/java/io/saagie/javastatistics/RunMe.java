package io.saagie.javastatistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.Random;

public class RunMe {
    private static DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            descriptiveStatistics.addValue(random.nextDouble() * 100);
        }

        System.out.println("Version 4");
        System.out.println("Sum : " + descriptiveStatistics.getSum());
        System.out.println("Min : " + descriptiveStatistics.getMin());
        System.out.println("Max : " + descriptiveStatistics.getMax());
        System.out.println("Mean : " + descriptiveStatistics.getMean());
        System.out.println("Median : " + descriptiveStatistics.getPercentile(50.0D));
    }
}
