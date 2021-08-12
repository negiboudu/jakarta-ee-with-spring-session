/*
 * Copyright (c) 2014, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.tutorial.hello1;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Index {

	@Inject
	private BackingBean backingBean;

	public Index() {
	}

	public BackingBean getBackingBean() {
		return backingBean;
	}

	public void setBackingBean(BackingBean backingBean) {
		this.backingBean = backingBean;
	}

	public void prerenderview() {
		System.out.println("prerenderview");
	}

	public String event01() {
		return "fumi";
	}

//		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//		externalContext.redirect("http://127.0.0.1:8080/hello1/response.xhtml");
//	}

}
