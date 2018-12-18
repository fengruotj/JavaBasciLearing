//: io/GZIPcompress.java
package com.basic.java; /* Added by Eclipse.py */
// {Args: GZIPcompress.java}

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPcompress {
  public static void main(String[] args)
          throws IOException {
    BufferedReader in = new BufferedReader(new FileReader("java-io/data/a.text"));
    BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("java-io/data/test.gz")));
    System.out.println("Writing file");
    int c;
    while((c = in.read()) != -1)
      out.write(c);
    in.close();
    out.close();
    System.out.println("Reading file");
    BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("java-io/data/test.gz"))));
    String s;
    while((s = in2.readLine()) != null)
      System.out.println(s);
  }
} /* (Execute to see output) *///:~
