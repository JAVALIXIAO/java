package baoyi;

public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD=h;
	}
	void show(){
		System.out.println("cpu���ٶ�"+cpu.getSpeed());
		System.out.println("Ӳ�̵�����"+HD.getAmount());
	}
	
	}



