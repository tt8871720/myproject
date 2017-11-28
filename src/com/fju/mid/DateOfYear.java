package com.fju.mid;

public class DateOfYear {

	public static void main(String[] args) {
		int n[] =new int[12];
		n[0] = 31;
		n[1] = 28;
		n[3] = 31;
		n[4] = 30;
		n[5] = 31;
		n[6] = 30;
		n[7] = 31;
		n[8] = 31;
		n[9] = 30;
		n[10] =31; 
		n[11] =30; 
		int d =100;
		for (int i = 0; i < n.length; i++) {
			if(d<=n[i]){
		System.out.print(i+1 + "月" + d +"日 ");
		break;
		}else{
		 d = d - n[i];
			
		}
	}

}}
