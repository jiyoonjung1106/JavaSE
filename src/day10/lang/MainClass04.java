package day10.lang;
/*
 * [[ String Class ]]
 * 문자열을 다루는 클래스
 * 불변(immutable)의 객체
 * 
 * 1. 메모리절약
 * 2. Security  UP
 * 3. Thread Safe
 * 
 */
public class MainClass04 {

	public static void main(String[] args) {
		String str1 = "abc";		//불변
		String str2 = "abc";		//불변
		String str3 = new String("abc");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		// 문자열 길이 length
		String txt ="ABCDEFGHIJK";
		System.out.println("length : "+ txt.length());
		
		//문자열이 지정한 문자로 시작하는지 판단
		String str4 = "apple";
		boolean startWith  = str4.startsWith("a");
		System.out.println("startWith : " +startWith );
		
		//문자열 마지막에 지정한 문자가 있는지 판단
		String str5 = "text";
		boolean endWith = str5.endsWith("t");
		System.out.println("endWith:" +endWith);
		
		//문자 인덱스 번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf : " + indexOf);
		
		//문자열에 지정한 문자가 마지막 몇번째에 있는지 int를 반환한다.,
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf : "+ lastIndexOf);
		
		//문자 치환
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace : "+ replace);
		
		//문자열 나누기(배열로 반환)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		for(int i =0; i<split.length; i++) {
			System.out.println("split["+i+"] : " + split[i]);
			
			//문자열 절삭
			String str10 = "ABCDEF";
			String substring = str10.substring(0,2);
			System.out.println("substring" + substring);
			
			//소문자 변환
			String str11 = "abcDEF";
			String toLowerCase = str11.toLowerCase();
			System.out.println("toLowerCase: "+ toLowerCase);
			
			//대문자 변환
			String str12 = "abcDEF";
			String toUpperCase = str11.toUpperCase();
			System.out.println("toUpperCase : "+ toUpperCase);
			
			// 공백제거
			String s = "         java java jva           ";
			String v = s.trim();
			System.out.println("trim :" +v);
			
			//문자비교
			String str13 = "A";
			String str14 ="B";
			int compareTo = str13.compareTo(str14);
			System.out.println("compareTo: "+ compareTo);
			if(compareTo>0) {
				System.out.println(str13+">"+ str14);
			}else if (compareTo==0) {
				System.out.println(str13+"="+ str14);
			}else {
				System.out.println(str13+"<"+ str14);
			}
			
			//문자 포함여부
			String str15 = "abcd";
			String str16 = "c";
			boolean contains = str15.contains(str16);
			System.out.println("contains: "+ contains);
			
			//문자열추가변경할 때 주로 사용하는 자료형
			//Thread safe (더 많이 사용함)
			StringBuffer sb = new StringBuffer();
			//문자열 추가
			sb.append("abc");
			System.out.println(System.identityHashCode(sb));
			sb.append("def");
			System.out.println(sb);
			System.out.println(System.identityHashCode(sb));
			
			//Thread safe 아니다
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("abc");
			sBuilder.append("def");
			
		}
		
		

	}

}
