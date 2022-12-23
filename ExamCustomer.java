import java.util.*;

// 고객 클래스(class Customer)가 있다.
// 고객은 이름, 고객번호(int>0), 아이디, 구분번호로 나뉘어진다.

// 1. 고객 클래스를 생성
// 2. 고객 리스트를 생성
// 3. 고객 리스트를 고객 번호를 기준으로 오름차순으로 정렬하세요
// 4. 고객 리스트에서 고객 번호로 검색하는 기능을 만들어보세요.
// 5. VIP고객인 경우 고객번호 기준으로 정렬 시 가장 앞쪽에 위치하게 정렬하세요.

//1. 고객 클래스를 생성

class Customer<T>
{
	private T name;	// 이름
	private T num;		// 고객번호(int>0)
	private T id;		// 아이디
	private T sort;		// 고객구분(일반 : 0, VIP : 1)
	
	public Customer()
	{
		
	}
	public Customer(T name, T num, T id, T sort)
	{
		this.name = name;
		this.num = num;
		this.id = id;
		this.sort = sort;
	}
	
	public void setCustomer(T name, T num, T id, T sort)
	{
		this.name = name;
		this.num = num;
		this.id = id;
		this.sort = sort;
	}
	
	public String toString()
	{
		return "name : " + name +
			   ", num : " + num +
			   ", id : " + id +
			   ", sort : " + sort;
	}
}

public class ExamCustomer {

	public static void main(String[] args) {
		List<Customer> num = new ArrayList<>();
		
		// 2. 고객 리스트 생성
		num.add(new Customer("홍길동", 1111, "hong", 0));
		num.add(new Customer("임꺽정", 2222, "im", 1));
		num.add(new Customer("세종대왕", 3333, "se", 1));
		num.add(new Customer("광개토대왕", 4444, "gwang", 0));
		num.add(new Customer("연개소문", 5555, "yeon", 0));
		
		for(Customer s : num)
		{
			System.out.println(s);
		}
		
	}

}
