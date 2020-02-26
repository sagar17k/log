package beta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class demo2 {
	
	private static Logger logger = LogManager.getLogger(demo2.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.debug("debug");
		logger.error("error");
		logger.fatal("fatal");
		logger.trace("trace");

	}

}
