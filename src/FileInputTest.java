import java.io.*;

/**
 * Java输出输入流
 * 2018/7/18 0018
 */


public class FileInputTest {
    public static void main(String[] args) throws Exception{
        OutputStream fos = new FileOutputStream("a1.txt");
        String str = "abcdefg";
        byte[] words = str.getBytes();
        fos.write(words,0,words.length);
        InputStream fis = new FileInputStream("a1.txt");
        int size;
        size = fis.available();
        System.out.println("size="+size);
        char[] text = new char[20];
        for(int i=0; i<size; i++){
            text[i] = (char)fis.read();
            System.out.println(text[i]);
        }
        fos.close();
        fis.close();
    }
}
