import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * bufferedReader
 * 2018/7/18 0018
 */


public class BufferedReaderTest {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
        bw.write("aaaaaa");
        bw.close();
        BufferedReader bf = new BufferedReader(new FileReader("a1.txt"));
        String line = bf.readLine();
        while (line!=null){
            System.out.println(line);
            line = bf.readLine();
        }

        bf.close();

    }
}
