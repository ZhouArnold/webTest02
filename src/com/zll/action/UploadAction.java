package com.zll.action;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zll.dao.FileUploadDao;
import com.zll.impl.FileUploadDaoImpl;

public class UploadAction extends ActionSupport {
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String uploadfile(){
		//String address = getSavePath()+"\\"+getUploadFileName();
		
		String address ="d:\\images\\"+getUploadFileName();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FileUploadDao FileUpload = (FileUploadDao)ctx.getBean("fileupload",FileUploadDaoImpl.class);
		FileUpload.doUpload(getUpload(), address);
		return SUCCESS;
	}
}
