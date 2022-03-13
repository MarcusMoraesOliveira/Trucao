package com.Trucao.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    protected void logIncomingCall(String source){
        LOGGER.info("Chama api de:" + source);
    }
}
