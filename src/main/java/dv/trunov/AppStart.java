package dv.trunov;

import dv.trunov.annotation_based.AnnotationApplication;
import dv.trunov.java_based.JavaApplication;
import dv.trunov.xml_based.XmlApplication;

public class AppStart {

    public static void main(String[] args) {
        startXmlApplication();
        startAnnotationApplication();
        startJavaApplication();

    }

    public static void startXmlApplication() {
        XmlApplication.main(new String[0]);
        System.out.println();
    }

    public static void startAnnotationApplication() {
        AnnotationApplication.main(new String[0]);
        System.out.println();
    }

    public static void startJavaApplication() {
        JavaApplication.main(new String[0]);
    }
}
