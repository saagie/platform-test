package io.saagie.javastatistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.Random;

public class RunMe {
    private static DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            descriptiveStatistics.addValue(random.nextDouble());
        }

        System.out.println("Version 1");
        System.out.println("Sum : " + descriptiveStatistics.getSum());
    }
}
