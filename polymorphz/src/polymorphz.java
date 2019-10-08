/**
 * @(#)polymorphz.java
 *
 * polymorphz application
 *
 * @author
 * @version 1.00 2019/10/7
 */

class polymorphz extends last{

    public static void main(String[] args) {
    	reg();
    	jann("grgr");

    	// TODO, add your application code
    	System.out.println("Hello World!");

    	maria.inti();
    }
}
class maria extends last{
	public static void inti(){
		int a=100000;
		System.out.println(a);
	}

}
class last{
	public static void reg(){
		System.out.println("150");
	}
	public static int jann(String v){
		System.out.println(v);
		return 100;
	}
}
