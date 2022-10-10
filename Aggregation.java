package com;
//Area of the circle pi*r*r
//Aggregation HAS-A relationship
//we have created the reference entity of aggregation

public class Aggregation { //class 1
	   int   squre (int r) {
		      return r*r;
	   }

}
class circle { private static char[] result;
//class2
	  Aggregation ag; //obj (entity ref)
	  double pi =3.14;
	  double area (int radius) {
		  ag = new Aggregation();
		  int psqure = ag.squre(radius);
		return psqure;
	  }
	  public static void main(String args[]) {
		  circle c = new circle(); //5*5*3.14
		  System.out.println(result);
		  
	  }
}
