package com.test;

public class this_prgm1 {
int a,b;
this_prgm1 (int a,int b)
{
	this.a=++a;
	this.b=++b;
	this.yy();
}

void gj(this_prgm1 o) {
	System.out.println("Values:\n"+o.a+"\n"+o.b);
}
void b() {
	gj(this);
}
this_prgm1 ty() {
	return this;
}
void yy() {
	System.out.println("HEllo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		this_prgm1 o1=new this_prgm1(10,20);
		o1.b();
		o1.ty().yy();
	}
	

}
