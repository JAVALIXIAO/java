# java
java课程作业项目仓库

# 阅读程序

##实验目的 
用类描述计算机中CPU的速度和硬盘的容量

##实验过程
CPU.java
package baoyi;

public class CPU {
	int speed;
	void setSpeed(int m) {
		speed=m;
	}
	int getSpeed() {
		return speed;
	}

}

PC.java
package baoyi;

public class CPU {
	int speed;
	void setSpeed(int m) {
		speed=m;
	}
	int getSpeed() {
		return speed;
	}

}

HardDisk.java
package baoyi;

public class HardDisk {
	int amount;
	void setAmount(int m){
		amount=m;
	}
	int getAmount() {
		return amount;
	}

}

Test.java
package baoyi;

public class Test {

	public static void main(String[] args) {
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
		
		// TODO Auto-generated method stub

	}

}

##核心方法
1.setSpeed(int)
2.getSpeed()
3.setCPU(CPU)
4.setHardDisk(HardDisk)
5.show()
6.setAmount(int)
7.getAmount()
8.main(String[])

##实验结果
cpu的速度2200
硬盘的容量200

##实验感想
通过本次实验我学会了调用函数的使用，学会了创建类、定义方法、构造方法、创建对象、明白了类与对象的区别。了解了主类与其他的区别。
