package org.mockk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DDT2 {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\ELCOT\\Desktop\\nnaa//Nada.xlsx");
	FileInputStream fin = new FileInputStream(f);
	WorkBook w= new XSSFWorkBook(fin);
}
}
