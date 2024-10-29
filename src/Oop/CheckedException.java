package Oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException { 
    FileInputStream f=new  FileInputStream("e://Bxlsxook.");
    System.out.println("started");
    Thread.sleep(50000);
    System.out.println("stopped");
	}

}
