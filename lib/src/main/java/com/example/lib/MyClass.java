package com.example.lib;



public class MyClass {
    private static final String TAG = "MAIN_FUNCTION";

   public static void main(String[] args) {
      System.out.println("Test Started");
      playWithMagnetic_Clip();
   }

   private static void playWithMagnetic_Clip() {
      Magnetic_Clip magnetic_clip1 = Magnetic_Clip.create();
      String msg = String.valueOf(magnetic_clip1.getIsCircle());
      System.out.println(msg + " has circle");
      Magnetic_Clip magnetic_clip2 = Magnetic_Clip.create();
      msg = String.valueOf(magnetic_clip1.getIsCircle());
      System.out.println(msg + " has circle");
      magnetic_clip2.setIsCircle(3);
      msg = String.valueOf(magnetic_clip1.getIsCircle());
      System.out.println(" is changed value. should be 3");
      System.out.println(magnetic_clip1 == magnetic_clip2);
      System.out.println(Magnetic_Clip.isCircle);
   }

   public static final class Magnetic_Clip {
      static int isCircle = 0;

      public int getIsCircle() {
         return isCircle;
      }

      public void setIsCircle(int isCircle) {
         this.isCircle = isCircle;
      }

      public static Magnetic_Clip create() {
         return  InstanceHolder.INSTANCE;
      }

      private static class InstanceHolder {
         private static final Magnetic_Clip INSTANCE = new Magnetic_Clip();

      }
   }

}