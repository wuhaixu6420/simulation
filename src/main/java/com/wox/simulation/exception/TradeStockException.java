package com.wox.simulation.exception;

/**
 * 
 * 描述：组合异常
 * @author wuhaixu
 * @created 2017年8月16日 下午2:03:08
 * @since
 */
public class TradeStockException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TradeStockException() {
		super();
	}

	public TradeStockException(String message) {
		super(message);
	}

	public TradeStockException(Throwable cause) {
		super(cause);
	}

	public TradeStockException(String message, Throwable cause) {
		super(message, cause);
	}
}
