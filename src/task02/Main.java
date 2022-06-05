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
            System.out.println("������� �������� ���������� ��������� ������� ������������:  ");
            int n = in.nextInt();

            in.close();
            if (n <= 0) {
                System.out.println("n ������ ������ ����!");
            } else {
                int t = (n * (n + 1)) / 2;
                System.out.println("���������� ��������� � ������������ = " + t);
            }

        } catch (Exception e) {
           System.out.println("������� ������ �����!");
        }
    }

    public static void logy(){
        Logger logger = Logger.getLogger("log.txt");

        try{
            FileHandler qw = new FileHandler("log.txt",true);
            logger.addHandler(qw);
            SimpleFormatter formatter = new SimpleFormatter();
            qw.setFormatter(formatter);
            logger.info("�������� ����!� ��������� , ���������!");
            qw.close();
        }catch(Exception e){e.printStackTrace();}
    }
        public static void main (String[] args){
            triangle();
            logy();

        }
    }
