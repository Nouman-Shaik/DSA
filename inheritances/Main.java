

public class Main {
  public static void main(String[] args) {
    System.out.println("hello main");
    Box b1 =new Box();
    System.out.println(b1.l);
    Box b2 = new Box(2.5,3.4,1.2);
    System.out.println(b2.b+" "+b2.l+" "+b2.w);
    Box b3 = new Box(b1);
    System.out.println(b3.b+" "+b3.l+" "+b3.w);

    Boxweight box = new Boxweight();
    System.out.println(box.b+" "+box.weigth);

    Boxweight box1 = new Boxweight(2.3,3,4.5,5.5);
    System.out.println(box1.b+" "+box1.l+" "+box1.weigth);
  }
  
}
