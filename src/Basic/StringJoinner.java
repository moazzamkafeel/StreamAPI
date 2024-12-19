package Basic;

import java.util.StringJoiner;

public class StringJoinner {
	
	public static void main(String[] args) {
		
		String s1 = "Mohammad";
		String s2 = "Moazzam";
		String s3 = "Kafeel";

		StringJoiner sj = new
//        delimiter,prefix,suffix
		StringJoiner("--delimiter--", "prefix", "suffix");
		sj.add(s1);
		sj.add(s2);
		sj.add(s3);
		System.out.println(sj);

	}
}
