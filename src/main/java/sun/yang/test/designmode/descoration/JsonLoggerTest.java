package sun.yang.test.designmode.descoration;

import org.slf4j.Logger;

public class JsonLoggerTest {
    private static final Logger logger = JsonLogger.JsonLoggerFactory.getLogger(JsonLoggerTest.class);
    public static void main(String[] args) {
        logger.error("string");
    }
}
