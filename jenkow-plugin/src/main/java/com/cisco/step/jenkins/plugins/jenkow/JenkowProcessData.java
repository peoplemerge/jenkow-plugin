/*
 * The MIT License
 * 
 * Copyright (c) 2012, Cisco Systems, Inc., Max Spring
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.cisco.step.jenkins.plugins.jenkow;

import java.io.Serializable;
import java.util.Map;

public class JenkowProcessData implements Serializable{
	private static final String JENKOW_DATA_NAME = "jenkow_data";
	private String parentJobName;
	private Integer buildNumber;
	
	// TODO 9: make JobMD part of this hierarchy
	
	public String getParentJobName() {
    	return parentJobName;
    }
	public void setParentJobName(String parentJobName) {
    	this.parentJobName = parentJobName;
    }
	public Integer getBuildNumber() {
    	return buildNumber;
    }
	public void setBuildNumber(Integer buildNumber) {
    	this.buildNumber = buildNumber;
    }
	
	static void saveTo(Map<String,Object> varMap, JenkowProcessData jpd){
		varMap.put(JENKOW_DATA_NAME,jpd);
	}
}
