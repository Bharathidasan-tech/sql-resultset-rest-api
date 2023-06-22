package com.sql.api.common.exception;

/**
 * @author Bharathidasan
 * @version 1.0
 * @see NotFoundException
 */
public class NotFoundException extends RuntimeException
{


	private static final long serialVersionUID = 1L;


    public NotFoundException()
    {
    }

    
    public NotFoundException(String message)
    {
        super(message);
    }

   
    public NotFoundException(Throwable cause)
    {
        super(cause);
    }

  
    public NotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    
    public NotFoundException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
