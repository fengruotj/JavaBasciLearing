package com.basic.java;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 */
public class BytesOfChar {
    public static byte[] getBytesUTF8 (char  c ) {
        Charset cs = Charset.forName("utf-8");
        CharBuffer cb = CharBuffer.allocate (1);
        cb.put (c);
        cb.flip ();
        ByteBuffer bb = cs.encode (cb);
        return bb.array();
    }
    public static byte[] getBytesGBK (char c) {
        Charset cs = Charset.forName("GBK");
        CharBuffer cb = CharBuffer.allocate (1);
        cb.put(c);
        cb.flip ();
        ByteBuffer bb = cs.encode (cb);
        return bb.array();
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        char c='a';
        char cc='中';
        String str="a";
        String strr="中";
        String s="ａ";
        System.out.println("编码为UTF8:");
        System.out.println("char值为英文字符所占字节长度:"+getBytesUTF8(c).length);
        System.out.println("char值为中文字符所占字节长度:"+getBytesUTF8(cc).length);
        System.out.println("编码为GBK(默认编码):");
        System.out.println("char值为英文字符所占字节长度:"+getBytesGBK(c).length);
        System.out.println("char值为中文字符所占字节长度:"+getBytesGBK(cc).length);
        System.out.println("-------------------------------");
        System.out.println("编码为UTF8");
        System.out.println("String为英文字母所占字节长度:"+str.getBytes("utf-8").length);
        System.out.println("String为中文字母所占字节长度:"+strr.getBytes("utf-8").length);
        System.out.println("编码为GBK:");
        System.out.println("String为英文字母所占字节长度:"+str.getBytes("GBK").length);
        System.out.println("String为中文字母所占字节长度:"+strr.getBytes("GBK").length);
        System.out.println("String为英文字母（全角）所占字节长度:"+s.getBytes("GBK").length);

    }
}
