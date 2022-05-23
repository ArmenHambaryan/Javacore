package Homework.lesson10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            if (i==10)break;    // выйти из цикла, если значение
                                //переменной i равно 10
            System.out.println("i:"+i);
        }
        System.out.println("Цикл завершен.");
    }

}
