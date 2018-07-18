import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * serializable
 * 2018/7/18 0018
 */


public class SerializableTest {
    public static void main(String[] args) throws Exception{
        User user = new User();
        user.setName("hollis");
        user.setGender("male");
        user.setAge(23);
        user.setBirthday(new Date());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.txt"));
        oos.writeObject(user);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tempFile.txt"));
        User user1 = (User) ois.readObject();
        System.out.println(user1);

        ois.close();
        oos.close();

    }
}
