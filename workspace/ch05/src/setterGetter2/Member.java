package setterGetter2;

import java.util.regex.Pattern;

public class Member {
	//필드(private)
	private String name, gender;
	private int age;
	
	//생성자(default)
	Member(){}
	Member(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		/* 영어로만 >>> charAt()으로 글자를 하나씩 뽑아와서 -> ASCII코드로 검사
		 * 문자열만 검사(String)
		 * ^ : 시작
		 * $ : ~종료
		 * [] : 한글자
		 * [abc] : abc중 한글자
		 * ? : 없음 또는 한글자
		 * * : 없음 또는 여러글자
		 * Pattern클래스의 matches라는 static메소드가 맞는지 검증
		 */
		if(Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name)) {
			this.name = name;
		}
		else {
			System.out.println("이름은 한글로만 등록가능 합니다.");
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0)
			this.age = age;
		else
			System.out.println("잘못된 입력입니다.");
	}
	public void info() {
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s\n",name,age,gender);
	}
}
