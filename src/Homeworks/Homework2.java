package Homeworks;

public class Homework2 {
    public static void main(String [] args){
        byte byteBin = 0B1100;
        byte byteOct = 014;
        byte byteDec = 12;
        byte byteHex = 0xC;

        System.out.println(byteBin);
        System.out.println(byteOct);
        System.out.println(byteDec);
        System.out.println(byteHex);

        short shortBin = 0B10100010100;
        short shortOct = 02424;
        short shortDec = 1300;
        short shortHex = 0x514;

        System.out.println(shortBin);
        System.out.println(shortOct);
        System.out.println(shortDec);
        System.out.println(shortHex);

        int intBin = 0B0;
        int intOct = 00;
        int intDec = 0;
        int intHex = 0x0;

        System.out.println(intBin);
        System.out.println(intOct);
        System.out.println(intDec);
        System.out.println(intHex);

        long longBin = 0B111010110111100110100010101;
        long longOct = 0726746425;
        long longDec = 123456789;
        long longHex = 0x75BCD15;

        System.out.println(longBin);
        System.out.println(longOct);
        System.out.println(longDec);
        System.out.println(longHex);

        float firstFloat = 3.14F;
        double firstDouble = 3.25D;
        boolean notTrue = false;

        char strange = '1';
        char secondStrangeChar = '\u0400';

        System.out.println(firstFloat);
        System.out.println(firstDouble);
        System.out.println(notTrue);
        System.out.println(strange);
        System.out.println(secondStrangeChar);


    }

}
