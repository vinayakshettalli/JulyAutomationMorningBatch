package com.sgtesting.refelection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

		public static void main(String[] args) {

			FileInputStream fin=null;
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			try
			{
				fin=new FileInputStream("C:\\Users\\vinay\\Downloads\\Reflection.xlsx");
				wb=new XSSFWorkbook(fin);
				int sc=wb.getNumberOfSheets();
				
				for(int s=0; s<sc;s++)
				{
					String sname=wb.getSheetName(s);
					System.out.println(sname);
					sh=wb.getSheet(sname);
					
					int rc=sh.getPhysicalNumberOfRows();
					
					
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String MethodName=cell.getStringCellValue();
						cell=row.getCell(1);
						String PackageClsName=cell.getStringCellValue();
						
						System.out.println(MethodName+ "  ---->  "+PackageClsName);
						
						Class cls=Class.forName(PackageClsName);
						Object obj=cls.newInstance();
						
						Method method=obj.getClass().getMethod(MethodName, null);
						method.invoke(obj, null);
					}



				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fin.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

		}

	}
