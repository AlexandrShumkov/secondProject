package task02;


import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Main {
    static Scanner in;

    public static void triangle() {
        try {
            in = new Scanner(System.in);
            System.out.println("Введите желаемое количество элементов стороны треугольника:  ");
            int n = in.nextInt();

            in.close();
            if (n <= 0) {
                System.out.println("n только больше нуля!");
            } else {
                int t = (n * (n + 1)) / 2;
                System.out.println("Количество элементов в треугольнике = " + t);
            }

        } catch (Exception e) {
           System.out.println("Вводить только цифры!");
        }
    }

    public static void logy(){
        Logger logger = Logger.getLogger("log.txt");

        try{
            FileHandler qw = new FileHandler("log.txt",true);
            logger.addHandler(qw);
            SimpleFormatter formatter = new SimpleFormatter();
            qw.setFormatter(formatter);
            logger.info("Берегите себя!С уважением , Александр!");
            qw.close();
        }catch(Exception e){e.printStackTrace();}
    }
        public static void main (String[] args){
            triangle();
            logy();

        }
    }
