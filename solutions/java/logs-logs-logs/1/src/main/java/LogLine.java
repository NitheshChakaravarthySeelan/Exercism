public class LogLine {
    private final LogLevel log;
    private final String message; 
    
    public LogLine(String logLine) {
        int end = logLine.indexOf(']');
        String level = logLine.substring(1, end);
        
        this.log = LogLevel.fromCode(level);
        this.message = logLine.substring(end + 2).trim();
    }

    public LogLevel getLogLevel() {
        return this.log;
    }

    public String getOutputForShortLog() {
        return this.log.getLog() + ":" + this.message;
    }
}
