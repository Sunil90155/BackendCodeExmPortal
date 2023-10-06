package com.exam.helper;

public class UserFoundException extends Exception{

	public UserFoundException() 
	{
        super("User with this username not found in database !! try with  another one");
    }

    public UserFoundException(String msg) 
    {
        super(msg);
    }
	
}
