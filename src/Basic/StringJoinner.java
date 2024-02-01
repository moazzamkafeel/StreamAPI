package Basic;

import java.util.StringJoiner;

public class StringJoinner {
public static void main(String[] args) {
	String s1="Mr java";
	String s2="Java";
	String s3="Subscribe";
	
StringJoiner sj = new 
//        delimiter,prefix,suffix
StringJoiner("-delimiter->,-","@-prefix-","$-suffix");
	sj.add(s1);
	sj.add(s2);
	sj.add(s3);

	
	System.out.println(sj);
	
	
	
	
	
	
	
	
	
	
}
}
