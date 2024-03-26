package com.greatlearning.notecount.main;

import java.util.Scanner;

import com.greatlearning.notecount.service.MergeSortImpl;
import com.greatlearning.notecount.service.NotesCount;

public class NoteCountDriver{

	public static void main(String[] args) {

		MergeSortImpl mergeSortImplementation = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
		sc.close();
	}
}