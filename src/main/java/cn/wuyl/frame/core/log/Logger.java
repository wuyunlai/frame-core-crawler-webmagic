package cn.wuyl.frame.core.log;

import org.slf4j.LoggerFactory;

public class Logger implements ILogger{
    private String logType = "DEBUG";
    protected org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    public Logger(Class cls) {
		// TODO Auto-generated constructor stub
		logger = LoggerFactory.getLogger(cls);
	}

    public Logger(Class cls,String logType) {
		// TODO Auto-generated constructor stub
		logger = LoggerFactory.getLogger(cls);
		this.logType = logType;
	}

	public void log(String msg){
		log(msg,logType);
	}
	
	public void log(String msg,String logType){
		if(logType.equalsIgnoreCase("DEBUG")){
			logger.debug(msg);
		}else if(logType.equalsIgnoreCase("WARN")){
			logger.warn(msg);
		}else if(logType.equalsIgnoreCase("INFO")){
			logger.info(msg);
		}else if(logType.equalsIgnoreCase("ERROR")){
			logger.error(msg);
		}else{
			System.out.println(msg);
		}
	}

	public void debug(String msg){
		logger.debug(msg);
	}

	public void info(String msg){
		logger.info(msg);
	}

	public void warn(String msg){
		logger.warn(msg);
	}

	public void error(String msg){
		logger.error(msg);
	}

	public void console(String msg){
		System.out.println(msg);
	}

	
}
