class A extends C {
  public A() {
    n32 = 9;
    n1 = 6;
    n3 = 0;
    n34 = 7L;
  }
  public void n37() {
    System.out.println("метод n37 в классе A");
    System.out.println(n32 + 5);
  }
  public static void n26() {
    System.out.println("метод n26 в классе A");
    System.out.println((n38 - 1));
  }
  public static void n27() {
    System.out.println("метод n27 в классе A");
    System.out.println(n38);
  }
  public static void n35() {
    System.out.println("метод n35 в классе A");
    System.out.println((n38 + 4));
  }
  public static void n22() {
    System.out.println("метод n22 в классе A");
    System.out.println(--n38);
  }
  public void n39(C r) {
    r.n40();
  }
  public void n39(A r) {
    r.n28();
  }
}
