
public class Box {
  double l;
  double b;
  double w;

  Box(){
    this.l=-1;
    this.b=-1;
    this.w=-1;
  }


  Box(double l,double b,double w){
    this.l=l;
    this.b=b;
    this.w=w;
  }
  Box(Box old){
    this.l=old.l;
    this.b=old.b;
    this.w=old.w;
  }
  
}
