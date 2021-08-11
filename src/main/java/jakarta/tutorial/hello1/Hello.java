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
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {

    private String name;
    private BackingBean backingBean = new BackingBean();
    
    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }

	public BackingBean getBackingBean() {
		return backingBean;
	}

	public void setBackingBean(BackingBean backingBean) {
		this.backingBean = backingBean;
	}
	
	public void prerenderview() {
		UIViewRoot uiviewroot = FacesContext.getCurrentInstance().getViewRoot();
//		Jedis jedis = new Jedis("localhost",6379);
//		Map<String,String> hgetallresult = jedis.hgetAll("spring:session:sessions:c03fa5ad-2077-4f8d-bed5-b89976a14eff");
//		jedis.close();
	}
	
	public String event01() {
		UIViewRoot uiviewroot = FacesContext.getCurrentInstance().getViewRoot();
		return "";
	}
}

