package com.wse.eventbus;

import org.vertx.java.core.Vertx;
import org.vertx.java.core.eventbus.EventBus;

public interface EventBusWrapperFactory {

  EventBus getEventBus(Vertx vertx);

}

