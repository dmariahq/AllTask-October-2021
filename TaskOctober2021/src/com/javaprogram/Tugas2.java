package com.javaprogram;

public class Tugas2 {
		public static void main(String args[]){
     
			int a, b, c, d, e, f;
			char g, h;
	        
			a = 8 + 4;
			b = 9 - 2;
			c = 2 * 3;
			d = 15/3;
			e = ( ( 10 + 4) -7) * 2;
			f = 45/0;
			
			
  
			System.out.println("Hasil variabel a: " + a); 
			System.out.println("Hasil variabel b: " + b); 
			System.out.println("Hasil variabel c: " + c); 
			System.out.println("Hasil variabel d: " + d); 
			System.out.println("Hasil variabel e: " + e); 
			System.out.println("Hasil variabel f: " + f); 
     
			try{
	            
	           int angka = f;
	           int hasil = angka/0;
	           System.out.println(hasil);
	        }catch(ArithmeticException ex){
	        	ex.printStackTrace();
	            System.out.println("Tidak Bisa Menggunakan Pembagian dengan 0 (nol)");
  }}
			
}