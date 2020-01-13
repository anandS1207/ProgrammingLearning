package geeksforgeeks.arrayProgram.practice;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesList {
	public static List<String> allPaths = new ArrayList<>();

	public static void main(String srgs[]) {
		getAllFiles("C:\\Users\\sahukari.ananda.rao\\Desktop\\DB Migration");
		for (String str : allPaths) {
			System.out.println(str);
		}
	}

	public static void getAllFiles(String path) {
	File folder = new File(path);
	File[] listOfFiles = folder.listFiles();

	for( int i = 0;i<listOfFiles.length;i++)
	{
		if (listOfFiles[i].isFile()) {
			System.out.println("File " + listOfFiles[i].getName());
		} else if (listOfFiles[i].isDirectory()) {
			System.out.println("Directory " + listOfFiles[i].getName());
		}
	}
//		File f = new File(path);
//		for (String str : f.list()) {
//			File f2 = new File(str);
//			if ((str.contains(".") && !str.substring(str.lastIndexOf(".")).contains("\\")) || !str.contains(".")) {
//				getAllFiles(str);
//			} else
//				allPaths.add(str);
//		}
//	}
}
