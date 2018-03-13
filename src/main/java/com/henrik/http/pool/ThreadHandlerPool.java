package com.henrik.http.pool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadHandlerPool {
	private final static ThreadPoolExecutor executor = new ThreadPoolExecutor(6, 80, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

	public static void addTask(Runnable runnable){
		executor.submit(runnable);
	}
}
