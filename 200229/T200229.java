public class T200229 {

	public static void main7(String[] args) {
		//String 强制转换 int
		String str = "100";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	public static void main6(String[] args) {
		//int 强制转换 String
		int num = 10;
		String str = String.valueOf(num);
		System.out.println(str);
	}

	public static void main5(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);//小于四个字节的类型运算时会提升为int计算，所以需要类型转换
		System.out.println(c);
	} 

	public static void main4(String[] args) {
		int a = 10; 
        long b = 20; 
        //int c = a + b;
        // 编译出错, 提示将 long 转成 int 会丢失精度
        long d = a + b;
		System.out.println(d);//22
        //int会提升为long类型，若强制显示int,需进行类型转换
	}

	public static void main3(String[] args) {
		//byte，short 和 char 不管大小，都要进行强制类型转换
		//char 只能表示正数
		byte a = 10;
		char b = '高';
        b = (char) a;
        //a = (byte)b;
		System.out.println(b);//无结果
		//System.out.println(a);//-40
	}

	public static void main2(String[] args) {
        int a = 10;
		long b = 20L;
		b = a;
		System.out.println(b);
	}
	public static void main1(String[] args) {
		//强制类型转换
		int a = 10;
		long b = 20L;
		a = (int)b;
        System.out.println(a);
	}
}