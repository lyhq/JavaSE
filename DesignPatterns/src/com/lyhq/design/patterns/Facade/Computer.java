package com.lyhq.design.patterns.Facade;

/**
 * Computer, Facade类
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Computer {

	private CPU cpu;

	private Memory memory;

	private Disk disk;

	public Computer(CPU cpu, Memory memory, Disk disk) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}

	public void startUp() {
		System.out.println("computer start begin...");
		this.cpu.startUp();
		this.memory.startUp();
		this.disk.startUp();
		System.out.println("computer start end...");
	}

	public void shutdown() {
		System.out.println("computer shutdown begin...");
		this.cpu.shutdown();
		this.memory.shutdown();
		this.disk.shutdown();
		System.out.println("computer shutdown end...");
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Disk getDisk() {
		return disk;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
	}

}
