package mymodappdemo;

import binaryfuncs.BinFuncProvider;
import mysupport.Support;

import java.util.ServiceLoader;

import static simplefuncs.SimpleFuncs.*;

public class MyModAppDemo {
    public static void main(String[] args) {
        if(Support.isFactor(2, 10)){
            System.out.println("2 делитель 10");
        }

        System.out.println("Наименьший общий делитель для 35 и 105 равен " + lcf(35, 105));
        System.out.println("Наибольшей общий делитель для 35 и 105 равен " + gcf(35, 105));

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        for (BinFuncProvider bfp : ldr){
            System.out.println(bfp.get().func(-8, 11));
        }
    }
}
