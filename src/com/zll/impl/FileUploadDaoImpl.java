package com.zll.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.zll.dao.FileUploadDao;

public class FileUploadDaoImpl implements FileUploadDao {

	public void doUpload(File file, String address) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream(address);
			FileInputStream fis = new FileInputStream(file);
			byte[] b=new byte[1000];
			int i;
			try {
				while((i=fis.read(b))!=-1){
					fos.write(b, 0, i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
