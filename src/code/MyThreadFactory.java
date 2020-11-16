package code;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory{
	
	private int count = 0;
	private final String baseName;
	
	public MyThreadFactory(String baseName) {
		this.baseName = baseName;
	}

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r, baseName + "-" + count++);
		return thread;
	}

}
