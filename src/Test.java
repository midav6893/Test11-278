import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws Exception { 
		try(BufferedReader bf = Files.newBufferedReader(Paths.get("input.txt"))) {
			String s = bf.readLine();
			if (s.equals("")) System.out.println("YES");
			else {
				String t = bf.readLine();
				char[] c = s.toCharArray();
				int ind_temp = t.indexOf(c[0]);
				for (int i = 0; i < c.length; i++) {
					if (ind_temp <= t.indexOf(c[i],ind_temp)) {
						ind_temp = t.indexOf(c[i],ind_temp)+1;
					}
					else {
						System.out.println("NO");
						break;
					}
					if (i == c.length -1) System.out.println("YES");
				}
			}
		}
	} 
}
