/**
 * foreknow
 * Java面向对象的语言
 * Java能够做什么：Web网站 手机端(Android  ios)
 * Java的程序：1.Java源文件 xxx.java   2.字节码文件 xxx.class
 * Java中的变量以及数据类型
 * Java中的数据类型8种
 * 1.基本类型 整型(byte short int long)   浮点型（float double）   布尔型(boolean)  字符型(char)
 * 2.引用类型(基本类型以外的类型都是引用类型)
 * 数据类型的转换
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("abc" + " def");
        //基本数据类型8种
        //byte b = 1222222;
        //short s = 14;
        int age = 13;
        //long l = 231231231;
        // System.out.println(b);
        //System.out.println(s);
        System.out.println("你的年龄是：" + age);
        //System.out.println(l);

        float f = 3.14F;
        System.out.println(f);

        //double双精度浮点型（更加精确）
        double d = 3.123;
        System.out.println(d);

        //布尔类型不是true就是false
        boolean isRight = false;
        System.out.println(isRight);

        //字符型
        char c = 'A';
        System.out.println(c);


        //数据类型的转换
        double dd = 34;//自动类型转换
        System.out.println(dd);//结果为：34.0

        //浮点数的默认类型是double类型，因为double类型比float的类型位数要大，所以报错
        //的原因是不能将double类型转换为float类型
        //byte  short   int   long  float   double
        //将小类型赋值给大类型----自动类型转换
        //将大类型赋值给小类型-----强制类型转换
        //3.14默认为double类型
        float ff = (float) 3.14;
        double ddd = 13;

        int aaa = (int) 3.14;
        System.out.println(aaa);

        double money = 34.56;
        int ages = 23;
        //char ccc = 'M';
        boolean is = true;
        double dddd = money + ages;
        System.out.println(dddd);
        //furscience.com

        System.out.println("-----------------------------");
        //Java中的运算符+ - * / % ++ -- 算术运算符
        int k = 5;
        int j = 2;
        //System.out.println(k+j);
        //System.out.println(k-j);
        //System.out.println(k*j);
        //System.out.println(k/j);
        //System.out.println(k++);
        //System.out.println(j--);
        System.out.println(k % j);//k除以j所得到的余数
        int y = 1;
        int s = ++y;//先将y加一 ,然后再赋值给s变量
        System.out.println(s);//2
        //赋值运算符

    }
}
