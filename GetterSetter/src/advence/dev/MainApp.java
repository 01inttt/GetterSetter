package advence.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Person[] person = new Person[3];
		input(person);
		print(person);
		
	}
	private static void print(Person[] person) {
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].toString());
		}
		
	}

	public static void input(Person[] person) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < person.length; i++) {
			System.out.format("Person a[%d]", i + 1);
			System.out.println();
			System.out.println("nhap ten");
			String ten = sc.next();
			System.out.println("nhap tuoi");
			int tuoi = sc.nextInt();
			System.out.println("nhap dia chi");
			String diaChi = sc.next();
			System.out.println("nhap so dien thoai");
			String sDT = sc.next();
			System.out.println("nhap diem trung binh");
			double diemTrungBinh = sc.nextDouble();
			person[i] = new Person(ten, tuoi, diaChi, sDT, i);
		}
		
	}

}
