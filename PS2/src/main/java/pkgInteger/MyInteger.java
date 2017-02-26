package pkgInteger;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		if(iValue % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if(iValue % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		for(int i = 2; i < getiValue(); i++){
			if(getiValue() % i ==0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int number) {
		if(number % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++){
			if(number % i ==0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger num) {
		if(num.getiValue() % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(MyInteger num) {
		if(num.getiValue() % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(MyInteger num) {
		for(int i = 2; i < num.getiValue(); i++){
			if(num.getiValue() % i ==0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int value) {
		if(value == iValue) {
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger integer) {
		if(this.getiValue() == integer.getiValue()){
			return true;
		}
		return false;
	}
}
