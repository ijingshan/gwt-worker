package com.github.gwt.worker.shared.shared;

import com.github.gwt.worker.shared.AbstractWorkerScope;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * SharedWorkerGlobalScope
 *
 */
public interface SharedWorkerScope extends AbstractWorkerScope {

	String getName();
	
	Object getApplicationCache();
	
	HandlerRegistration addConnectHandler(Object handler);
}
