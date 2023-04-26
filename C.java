class C {
  int n32;
  int n4;
  int n1;
  int n19;
  int n3;
  long n20;
  long n16;
  long n34;
  int[] n24 = {1, -1, 3, -3, -3};
  int[] n6 = {3, 0, 0, -1, 3};
  int[] n11 = {-2, 2, 1, -3, -2};
  static int n38;
  static int n30;
  static int n7;
  static int n12;
  static int n21;
  public C() {
    n32 = 4;
    n4 = 1;
    n1 = 8;
    n19 = 4;
    n3 = 0;
    n20 = 6L;
    n16 = 4L;
    n34 = 0L;
  }
  public void n18() {
    System.out.println("метод n18 в классе C");
    System.out.println((int)n20);
  }
  public void n29() {
    System.out.println("метод n29 в классе C");
    System.out.println(n24[1]);
  }
  public void n40() {
    System.out.println("метод n40 в классе C");
    System.out.println(n11[1]);
  }
  public void n28() {
    System.out.println("метод n28 в классе C");
    System.out.println(n4 >> 2);
  }
  public void n37() {
    System.out.println("метод n37 в классе C");
    System.out.println(n4 + 5);
  }
  public void n33() {
    System.out.println("метод n33 в классе C");
    System.out.println(n3 >> 2);
  }
  public static void n26() {
    System.out.println("метод n26 в классе C");
    System.out.println(n12);
  }
  public static void n27() {
    System.out.println("метод n27 в классе C");
    System.out.println((n12 - 5));
  }
  public static void n35() {
    System.out.println("метод n35 в классе C");
    System.out.println(n21);
  }
  public static void n22() {
    System.out.println("метод n22 в классе C");
    System.out.println((n21 + 4));
  }
  public void n39(C r) {
    r.n18();
  }
  public void n39(A r) {
    r.n29();
  }
}
