public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int log;

    LogLevel(int log) {
        this.log = log;
    }

    public int getLog() {
        return this.log;
    }

    public static LogLevel fromCode(String code) {
        return switch (code) {
            case "TRC" -> TRACE;
            case "DBG" -> DEBUG;
            case "INF" -> INFO;
            case "WRN" -> WARNING;
            case "ERR" -> ERROR;
            case "FTL" -> FATAL;
            default -> UNKNOWN;
        };
    }
}
