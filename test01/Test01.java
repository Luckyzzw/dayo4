package com.test01;
/*
 * 1.����People���ˣ��ĳ����࣬������

        a����Ա���ԣ�������name����String���͡�

                ������country����String���͡�

        b���в��޷���ֵ�ĳ��󷽷���void speak(String str)��

2.����Movement���˶����ӿڣ�������

        a���޲��޷���ֵ�ĳ��󷽷���void exercise()��

3.����Man�����ˣ��࣬Ҫ��

    a��.�̳�People���ˣ��࣬ʵ��speak�������ڷ����ڴ�ӡ������ΪX��Y����˵�� Z��������XΪ���˵����֣�YΪ���˵Ĺ�����ZΪ��ǰ�����Ĳ���

    b��.������ι���

    c��.ʵ��Movement�ӿڣ�ʵ��exercise�������ڷ����ڴ�ӡ����X���ڶ����У������У�XΪ���˵����֡�

    d��.������Ա������life()���ڷ��������ε���speak(String str)������exercise()����������speak�����Ĳ������д�����

4.���������࣬�ڲ������main��������ɣ�

    a).����һ��Man���� Kk�����Ը�ֵ������Ϊ��������������Ϊ�����ǡ���

    b).������������life()������

�������к�Ĵ�ӡʾ����ͼ��

ʾ����


 */
public class Test01{
	public static void main(String[] args) {
		Man kk=new Man();
		kk.setName("������");
		kk.setCountry("����");
		kk.life("�й���");
	}
}
