import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Createfile {

	void Create(String filepath) {
		File file = new File("E:\\mine.txt");
		FileWriter fw = null;
		try {
			file.createNewFile();
			fw = new FileWriter(file);
			fw.write("i m not your boss");
		} catch (IOException e) {
			System.out.println("file not created");
		} finally {
			System.out.println("file closed....");
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}

public class FileCreation {

	public static void main(String[] args) {

		Createfile createfile = new Createfile();
		String a = "E:\\mine.txt";
		createfile.Create(a);
	}

}
