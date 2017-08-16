package com.wox.simulation.exception;

/**
 * 
 * 描述：组合异常
 * @author wuhaixu
 * @created 2017年8月16日 下午2:03:08
 * @since
 */
public class CombinationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CombinationException() {
		super();
	}

	public CombinationException(String message) {
		super(message);
	}

	public CombinationException(Throwable cause) {
		super(cause);
	}

	public CombinationException(String message, Throwable cause) {
		super(message, cause);
	}
}
