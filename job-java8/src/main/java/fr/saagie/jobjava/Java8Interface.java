package fr.saagie.jobjava;

import java.util.Arrays;

public interface Java8Interface {
    default long thisFunctionWorksOnlyInJava8() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().count();
    }
}
