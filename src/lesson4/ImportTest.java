package lesson4;

import lesson4.sample.Imported;
import lesson4.StaticinnerClass.Class2.Class2Class1;


public class ImportTest {
    static public void main(String[] arg){
        System.out.println(lesson4.sample.Imported.getText());
        System.out.println(Imported.getText());
        StaticinnerClass.Class2 c =  new StaticinnerClass.Class2();
        Class2Class1 c2 = new Class2Class1();
    }
}
