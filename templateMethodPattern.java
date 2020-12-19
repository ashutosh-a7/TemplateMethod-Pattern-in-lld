import java.io.*;
import java.util.*;
import java.util.Scanner;

abstract class myBeverage{
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water..");
    }

    void pourInCup(){
        System.out.println("Pouring in Cup..");
    }

    final void prepareBeverage(){          // Here algorithm resides
        System.out.println("Preparing your beverage... \n");
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        System.out.println("\nYour beverage is Ready!!! \n");
    }
}

//they just provide implmentation of some methods according their own requirements
class coffee extends myBeverage{        
      void brew(){
        System.out.println("Dripping Coffee through filter..");
      }
      void addCondiments(){
        System.out.println("Adding Sugar and Milk.. ");
      }
}

class tea extends myBeverage{
      void brew(){
        System.out.println("Steeping the Tea..");
      }
       void addCondiments(){
        System.out.println("Adding Lemon.. ");
      }
}

public class templateMethodPattern {
    public static void main(String[] args)
    {
       System.out.println("\nThis is Template Method Pattern \n");
       tea myTea = new tea();
       myTea.prepareBeverage();       
    }
}
