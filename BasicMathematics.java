package com.basicmathematics;

import java.util.Scanner;

public class BasicMathematics {
    public static void main(String[] args) {
        BasicMathematics bm = new BasicMathematics();
        bm.Volumes();
    }
    public void Volumes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter \n 1. for Cube \n 2. for Cuboid \n 3. for Sphere \n 4. for Cylinder" +
                "\n 5. for Cone \n 6. for frustum of a cone. \n 7. for Hemi Sphere.");
        int n = input.nextInt();
        double volume;
        if (n==1){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the length of side of the cube.");
            long l = in.nextLong();
            volume=l*l*l;
            System.out.println("The volume of the given cube is: "+volume);
        }
        else if (n==2){
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter length of the cuboid.");
            long l = ip.nextLong();
            Scanner iu = new Scanner(System.in);
            System.out.println("Enter breadth of the cuboid.");
            long b = iu.nextLong();
            Scanner iy = new Scanner(System.in);
            System.out.println("Enter height of the cuboid.");
            long h = iy.nextLong();
            volume= l*b*h;
            System.out.println("The volume of the cuboid is: "+volume);
        }
        else if (n==3){
            Scanner as = new Scanner(System.in);
            System.out.println("Enter the radius of the sphere");
            long r = as.nextLong();
            volume = 4.0/3*(3.14*r*r*r);
            System.out.println("The volume of the given sphere is: "+volume);
        }
        else if (n==4){
            Scanner as = new Scanner(System.in);
            System.out.println("Enter the radius of the cylinder");
            long r = as.nextLong();
            Scanner az = new Scanner(System.in);
            System.out.println("Enter the height of the cylinder");
            long h = az.nextLong();
            volume = 3.14*r*r*h;
            System.out.println("The volume of the given cylinder is: "+volume);
        }
        else if (n==5){
            Scanner as = new Scanner(System.in);
            System.out.println("Enter the radius of the cone");
            long r = as.nextLong();
            Scanner aw = new Scanner(System.in);
            System.out.println("Enter the height of the cone");
            long h = aw.nextLong();
            volume = 1.0/3*3.14*r*r*h;
            System.out.println("The volume of the given cone is: "+volume);
        }
        else if (n==6){
            Scanner as = new Scanner(System.in);
            System.out.println("Enter the first radius of the frustum of the cone: ");
            long r1 = as.nextLong();
            Scanner aq = new Scanner(System.in);
            System.out.println("Enter the second radius of the frustum of the cone: ");
            long r2 = aq.nextLong();
            Scanner ar = new Scanner(System.in);
            System.out.println("Enter the radius of the frustum of the cone");
            long h = ar.nextLong();
            volume = 1.0/3*3.14*h*(r1*r1+r2*r2+r1*r2);
            System.out.println("The volume of the given frustum of the cone is: "+volume);
        }
        else if (n==7){
            Scanner as = new Scanner(System.in);
            System.out.println("Enter the radius of the hemi sphere");
            long r = as.nextLong();
            volume = 2.0/3*(3.14*r*r*r);
            System.out.println("The volume of the given hemi sphere is: "+volume);
        }
    }
    public void surfaceAreas(){
        
    }
}
