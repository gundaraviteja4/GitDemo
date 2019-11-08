package pack1;


import org.apache.logging.log4j.*;

public class Test1 {

	private static Logger log=LogManager.getLogger(Test1.class.getName());
	public static void main(String[] args) {

log.debug("button is clicked");
log.error("button is not displayed");
log.info("button is displayed");
	}

}
