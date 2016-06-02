package cn.wuyl.frame.core.log;

public interface ILogger {
    public void log(String msg);
    public void log(String msg,String logType);
    public void debug(String msg);
    public void info(String msg);
    public void warn(String msg);
    public void error(String msg);
    public void console(String msg);
}
