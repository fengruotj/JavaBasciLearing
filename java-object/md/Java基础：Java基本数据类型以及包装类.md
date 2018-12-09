# 1. 前言
最近在研究Java 基础知识，作为Java最重要的数据类型。Java有八大基本数据类型，相对应的有八种包装类。我们需要对这些基本数据类型进行理解和掌握。
# 2.Java基本数据类型
Java基本类型共有八种，基本类型可以分为三类，字符类型char，布尔类型boolean以及数值类型byte、short、int、long、float、double。数值类型又可以分为整数类型byte、short、int、long和浮点数类型float、double。JAVA中的数值类型不存在无符号的，它们的取值范围是固定的，不会随着机器硬件环境或者操作系统的改变而改变。实际上，JAVA中还存在另外一种基本类型void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。8 中类型表示范围如下：

* byte：8位，最大存储数据量是255，存放的数据范围是-128~127之间。
* short：16位，最大数据存储量是65536，数据范围是-32768~32767之间。
* int：32位，最大数据存储容量是2的32次方减1，数据范围是负的2的31次方到正的2的31次方减1。
* long：64位，最大数据存储容量是2的64次方减1，数据范围为负的2的63次方到正的2的63次方减1。
* float：32位，数据范围在3.4e-45~1.4e38，直接赋值时必须在数字后加上f或F。
* double：64位，数据范围在4.9e-324~1.8e308，赋值时可以加d或D也可以不加。
* boolean：只有true和false两个取值。
* char：16位，存储Unicode码，用单引号赋值。

# 3. Java包装类
Java决定了每种简单类型的大小。这些大小并不随着机器结构的变化而变化。这种大小的不可更改正是Java程序具有很强移植能力的原因之一。下表列出了Java中定义的简单类型、占用二进制位数及对应的封装器类。

| 简单类型 | boolean | byte | char | short | Int | long | float | double | void|
| ----- | ----- | ----- | ----- | ----- | ----- |----- | ----- |----- | ----- |
| 二进制位数 | 1 | 8 | 16 | 16 | 32 | 64 | 32 | 64 | -- |
| 封装类 | Boolean | Byte | Character | Short | Integer | Long | Float | Double | Void |

对于数值类型的基本类型的取值范围，我们无需强制去记忆，因为它们的值都已经以常量的形式定义在对应的包装类中了。如：
* 基本类型byte 二进制位数：Byte.SIZE最小值：Byte.MIN_VALUE最大值：Byte.MAX_VALUE
* 基本类型short二进制位数：Short.SIZE最小值：Short.MIN_VALUE最大值：Short.MAX_VALUE
* 基本类型char二进制位数：Character.SIZE最小值：Character.MIN_VALUE最大值：Character.MAX_VALUE
* 基本类型double 二进制位数：Double.SIZE最小值：Double.MIN_VALUE最大值：Double.MAX_VALUE

基本类型的优势：数据存储相对简单，运算效率比较高

包装类的优势：有的容易，比如集合的元素必须是对象类型，满足了java一切皆是对象的思想

# 4. 数据类型之间的转换
## 4.1 简单类型数据间的转换
简单类型数据间的转换,有两种方式:自动转换和强制转换,通常发生在表达式中或方法的参数传递时。

### 自动转换
具体地讲,当一个较"小"数据与一个较"大"的数据一起运算时,系统将自动将"小"数据转换成"大"数据,再进行运算。而在方法调用时,实际参数较"小",而被调用的方法的形式参数数据又较"大"时(若有匹配的,当然会直接调用匹配的方法),系统也将自动将"小"数据转换成"大"数据,再进行方法的调用,自然,对于多个同名的重载方法,会转换成最"接近"的"大"数据并进行调用。这些类型由"小"到"大"分别为 (byte，short，char)--int--long--float—double。这里我们所说的"大"与"小",并不是指占用字节的多少,而是指表示值的范围的大小。
### 强制转换
将"大"数据转换为"小"数据时，你可以使用强制类型转换。即你必须采用下面这种语句格式： int n=(int)3.14159/2;可以想象，这种转换肯定可能会导致溢出或精度的下降。

# 5. 自动拆箱和自动装箱
## 自动装箱
在Java SE5之前，如果要生成一个数值为10的Integer对象，必须这样进行：
``` java
Integer i = new Integer(10);
```
但是在Java SE5之后，开始提供了自动装箱的功能，如果要生成一个数值为10的Integer对象，只需要这样就可以了：
``` java
Integer i = 10;
```
## 自动拆箱
顾名思义，跟装箱对应，就是自动将包装器类型转换为基本数据类型：
``` java
Integer i = 10;  //装箱
int n = i;   //拆箱
```
简单一点说，装箱就是  自动将基本数据类型转换为包装器类型；拆箱就是  自动将包装器类型转换为基本数据类型。

下面我们来看这样一个代码：
``` java
public class JVM {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;

        Long g = 3L;

        out.println(c == d);
        out.println(e == f);
        out.println(c == (a+b));
        out.println(c.equals(a+b));
        out.println(g == (a+b));
        out.println(g.equals(a+b));
    }
}
```
执行结果：
```
true
false
true
true
true
false
```
首先我们知道包装类的数据：
> 包装类数据，如Integer, String, Double，Long等将相应的基本数据类型包装起来的类。这些类数据全部存在于堆中。

下面我再分析一下Long包装类的源码：
``` java
private static class LongCache {
    private LongCache(){}

    static final Long cache[] = new Long[-(-128) + 127 + 1];

    static {
        for(int i = 0; i < cache.length; i++)
        cache[i] = new Long(i - 128);
    }
}
```
从源码中我们可以看出Long包装类从类被加载的时候开始，就已经把-128到127之间的Long数据缓存到一个Long[]数组中去了，从JVM内存模型的角度来看。Long包装类已经把-128到127之间的Long数据生成得到java堆中。

**总结：**
> 1. 包装类的“==”运算在不遇到算术运算的情况下不会自动拆箱，equals()方法不处理数据转型的关系。
> 2. 在自动装箱时，把int变成Integer的时候，是有规则的，当你的int的值在-128-IntegerCache.high(127) 时，返回的不是一个新new出来的Integer对象，而是一个已经缓存在堆中的Integer对象，（我们可以这样理解，系统已经把-128到127之 间的Integer缓存到一个Integer数组中去了，如果你要把一个int变成一个Integer对象，首先去缓存中找，找到的话直接返回引用给你就 行了，不必再新new一个），如果不在-128-IntegerCache.high(127) 时会返回一个新new出来的Integer对象。

所以在e==f时，由于321没有在堆中缓存。所以堆中会创建两个Integer对象，并且这两个对象的值都是321。然后由e和f两个引用指向这两个对象。所以e==f返回false（因为它们两个引用指向的是两个对象）。c==d是因为在堆中已经缓存了-128L到127L的值的Long对象，所以c和d两个引用指向的是同一个对象。c==(a+b)：由于a+b是一个操作运算，所以包装类会执行自动拆箱成两个基本数据类型进行运算，返回3.然后c==3 "=="运算遇到算式运算时会进行自动拆箱，c自动拆箱成基本数据类型进行比较，返回true。

最后我来解释一下最后两个的运行结果为什么是true与false，先来看一下后两句话在进行编译之后在.class文件中的样子吧：
```
System.out.println(g.longValue() == (long)(a.intValue() + b.intValue()));
System.out.println(g.equals(Integer.valueOf(a.intValue() + b.intValue())));
```

我们可以看到编译器对out.println(g == (a+b));进行编译的时候，进行了拆箱与向上转型的操作，所以此时比较的仅仅是两个变量的字面值，与基本数据类型的比较是一样的，所以是true，而最后仍然比较的是对象中的数据并且对a没有进行向上转型，Long中存在的数据肯定就和Integer中存在的数据不等了，所以为false。

重要：我们能将字面值直接赋给Integer类是因为Java语法的存在，实际上Integer a = 1在经过编译之后是这样的：Integer a = new Integer(1)，语法糖帮助我们简化了语法。