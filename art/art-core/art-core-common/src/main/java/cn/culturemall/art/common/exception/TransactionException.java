package cn.culturemall.art.common.exception;

import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public class TransactionException extends RuntimeException {

	private static final long serialVersionUID = 5457041352665513217L;

	private ReturnData<VOID> returnData;
	
	public TransactionException() {
		
	}
	
	public TransactionException(int returnCode) {
		returnData = new ReturnData<VOID>();
		returnData.setReturnCode(returnCode);
	}
	
	public TransactionException(int returnCode, String message) {
		super(message);
		returnData = new ReturnData<VOID>();
		returnData.setReturnCode(returnCode);
    }

    public TransactionException(int returnCode, String message, Throwable cause) {
        super(message, cause);
        returnData = new ReturnData<VOID>();
		returnData.setReturnCode(returnCode);
    }

    public TransactionException(int returnCode, Throwable cause) {
        super(cause);
        returnData = new ReturnData<VOID>();
		returnData.setReturnCode(returnCode);
    }
	
	public ReturnData<VOID> getReturnData() {
		return returnData;
	}
	
}
