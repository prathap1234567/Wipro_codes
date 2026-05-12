package com.wipro.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("d://filedemo");
		String line="my file demo";
		try {
			Files.writeString(path,line);
			System.out.println(Files.readString(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
