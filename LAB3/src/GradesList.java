import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
//Chance Gordon 300248015
//COSC 121-L03
public class GradesList {
	public static void main (String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		int choice = 0;

		while (choice != 3) {
			System.out.println("Main menu" + "\n\n\nSelect one of the following options" + "\n1. Add a student" + "\n2. Edit student grades" + "\n3. Exit");

			choice = readInt(sc);
			switch (choice) {

			case 1:
				System.out.println("Enter the students name: ");
				String n = sc.nextLine();
				Student s1 = new Student();
				s1.setName(n);
				System.out.println("Enter a grade for " + n);
				int g = readInt(sc);
				s1.setGrade(g);
				list.add(s1);
				break;

			case 2:
				System.out.println("What student would you like to enter a grade for?");
				System.out.println(showStudents(list));
				int i = sc.nextInt();
				Student sg = readOut(list, i);
				if (sg != null) {
					System.out.println("Enter a grade for " + sg + ":");
					int a = readInt(sc);
					sg.setGrade(a); }
				break; }}

		System.out.println("Thank you, Goodbye!"); }

	public static String showStudents(ArrayList<Student> list) {
		String temp = "";
		for (int i = 0; i < list.size(); i++) {
			temp += (1+i) + ") " + list.get(i).toString() + "\n"; }
		return temp; }

	public static int readInt (Scanner sc) {
		int i = -1;
		do {
			try {
				i = sc.nextInt(); }
			catch (InputMismatchException e) {
				System.out.println("InputMismatch exception \nReturning to main menu\n"); }
			finally {
				sc.nextLine(); }}
		while (i == -1);
		return i; }

	public static Student readOut(ArrayList<Student> list, int i) {
		Student s = null;
		try {
			s = list.get(i-1); }
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds exception \nReturning to main menu\n"); }
		return s; }}

class Student {
	private String name = "";
	private int grade = 0;

	public void setName(String n) {
		name = n; }

	public void setGrade(int g) {
		grade = g; }

	public String getName() {
		return name; }

	public int getGrade() {
		return grade; }

	public String toString() {
		return name + " - " + grade; }}


