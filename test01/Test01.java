package com.test01;
/*
 * 1.创建People（人）的抽象类，包含：

        a）成员属性：姓名（name），String类型。

                国籍（country），String类型。

        b）有参无返回值的抽象方法：void speak(String str)。

2.创建Movement（运动）接口，包含：

        a）无参无返回值的抽象方法：void exercise()。

3.创建Man（男人）类，要求：

    a）.继承People（人）类，实现speak方法，在方法内打印“姓名为X的Y人在说着 Z”，其中X为男人的名字，Y为男人的国籍，Z为当前方法的参数

    b）.完成满参构造

    c）.实现Movement接口，实现exercise方法，在方法内打印：“X正在锻炼中！”其中，X为男人的名字。

    d）.创建成员方法：life()，在方法内依次调用speak(String str)方法和exercise()方法。其中speak方法的参数自行创建。

4.创建测试类，在测试类的main方法中完成：

    a).创建一个Man对象 Kk，属性赋值：姓名为“蔡徐坤”国籍为“火星”。

    b).调用这个对象的life()方法。

程序运行后的打印示例如图：

示例：


 */
public class Test01{
	public static void main(String[] args) {
		Man kk=new Man();
		kk.setName("蔡徐坤");
		kk.setCountry("火星");
		kk.life("中国话");
	}
}
