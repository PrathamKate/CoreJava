package com.tns.Buffer;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) throws IOException {
		{
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(r);
			System.out.println("Enter your Name: ");
			String name = br.readLine();
			System.out.println("Welcome "+name);
		}

	}

}
