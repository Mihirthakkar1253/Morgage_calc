package com.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class Morgagecalc {
    public static void main(String[] args) {

        final Byte monthsInYear=12;
        final Byte percent=100;
        System.out.println("principal:");
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        System.out.println("Annual Intrest Rate:");
        double Rate=sc.nextDouble();
        double monthly=Rate/percent/monthsInYear;
        double percentage=Rate*percent;
        System.out.println("period of years:");
        float year=sc.nextFloat();
        float numberOfPayment=year*monthsInYear;

        double morGage=principal*monthly*(Math.pow((1+monthly),numberOfPayment))/(Math.pow((1+monthly),numberOfPayment)-1);
        System.out.println("morGage:"+NumberFormat.getCurrencyInstance().format(morGage));




    }

}
