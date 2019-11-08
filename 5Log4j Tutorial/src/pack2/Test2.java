package pack2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test2 {

	private static Logger log=LogManager.getLogger(Test2.class.getName());
	public static void main(String[] args) {

log.debug("Is this debugged2");
log.error("error message2");
log.info("object is present2");
	}

}
