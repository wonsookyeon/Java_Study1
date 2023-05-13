package ex10;

class Parent {
   int x = 100;

   public Parent() { // public은 생략가능  // 3.
      this(200);                        // 3.  // 5.
      System.out.println("Parent()");  // 5.
   }

   Parent(int x) { // public은 생략가능        // 4.
      System.out.println("Parent(int x)");  // 4.
      this.x = x; 
   }

   int getX() {  return x;    } //
}

class Child extends Parent {
   int x = 3000;

   Child() {         // 2.   // 6.
      this(1000);    // 2.   // 6.   // 8.
      System.out.println("Child");   // 8.
   }

   Child(int x) {     // 7.
      this.x = x;     // 7.
      System.out.println("Child(int x)");  // 7.
   }
}

class Exam01 {
   public static void main(String[] args) {
      Child c = new Child(); // 1.
      System.out.println("x=" + c.getX());
   }
}