package main;

import java.util.SplittableRandom;
import java.util.concurrent.Callable;

public class Cricketball {

    int speed;
    int weight;
    int size;
    String name;
    String color;

 public void ballName(){
     System.out.println("name of the ball is"+name);
 }

 public void ballColor(){
     System.out.println("color of the ball is"+color);
 }

 public void ballWeight(){
     System.out.println("the weight of the ball is"+weight);
 }

 public void ballSize(){
     System.out.println("the size of the ball is"+size);
 }

 public void ballSpeed(){
     System.out.println("the speed of the ball is"+speed);
 }

public static void main(String[]args){
     Cricketball balla=new Cricketball();
     balla.name="ca";
     balla.color="red";
     balla.weight=10;
     balla.size=1;
     balla.speed=70;

     Cricketball ballb= new Cricketball();
     ballb.name="willson";
     ballb.color="green";
     ballb.weight=8;
     ballb.size=1;
     ballb.speed=50;

     Cricketball ballc=new Cricketball();
     ballc.name="penn";
     ballc.color="green";
     ballc.weight=8;
     ballc.size=1;
     ballc.speed=50;

     Cricketball balld=new Cricketball();
     balld.name="bd";
     balld.color="white";
     balld.weight=10;
     balld.size=2;
     balld.speed=100;

     Cricketball balle=new Cricketball();
     balle.name="sa";
     balle.color="pink";
     balle.weight=12;
     balle.size=3;
     balle.speed=120;

     balla.ballName();
     balla.ballColor();
     balla.ballWeight();
     balla.ballSize();
     balla.ballSpeed();

     ballb.ballName();
     ballb.ballColor();
     ballb.ballWeight();
     ballb.ballSize();
     ballb.ballSpeed();

     ballc.ballName();
     ballc.ballColor();
     ballc.ballWeight();
     ballc.ballSize();
     ballc.ballSpeed();

     balld.ballName();
     balld.ballColor();
     balld.ballWeight();
     balld.ballSize();
     balld.ballSpeed();

     balle.ballName();
     balle.ballColor();
     balle.ballWeight();
     balle.ballSize();
     balle.ballSpeed();






}









}
