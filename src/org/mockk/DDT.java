package org.mockk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DDT {
public static void main(String[] args) throws IOException
{
//location of my excel
	File f= new File("C:\\Users\\ELCOT\\Desktop\\nnaa\\Nada.xlsx");
//to Read the file
	FileInputStream fi= new FileInputStream(f);
	Workbook w= new XSSFWorkbook(fi);
}
}