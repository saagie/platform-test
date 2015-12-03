package fr.saagie.jobjava;

public class RunMe {

    public static final String JOB_JAVA8 = "Job-Java";
    static Java8Class java8Class = new Java8Class();

    public static void main(String[] args) {
        long eight = java8Class.thisFunctionWorksOnlyInJava8();
        System.out.print(JOB_JAVA8 + eight + "-out");
        System.err.print(JOB_JAVA8 + eight + "-err");
    }
}
