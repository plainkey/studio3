/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.webserver.core;

import java.util.EventObject;

/**
 * @author Max Stepanov
 *
 */
public final class ServerConfigurationChangeEvent extends EventObject {

	public enum Kind {
		ADDED,
		REMOVED,
		UPDATED
	}
	
	private static final long serialVersionUID = 1L;

	private Kind kind;

	/**
	 * 
	 */
	public ServerConfigurationChangeEvent(Kind kind, AbstractWebServerConfiguration configuration) {
		super(configuration);
		this.kind = kind;
	}

	/**
	 * @return the kind
	 */
	public Kind getKind() {
		return kind;
	}

	/**
	 * @return the serverConfiguration
	 */
	public AbstractWebServerConfiguration getServerConfiguration() {
		return (AbstractWebServerConfiguration) getSource();
	}

}
