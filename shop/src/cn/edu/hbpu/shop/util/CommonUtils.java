
package cn.edu.hbpu.shop.util;

import java.io.File;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import cn.edu.hbpu.shop.pojo.Product;

public class CommonUtils {

	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String path="E:\\dev\\upload\\";
	
	public static void uploadFiles(Product product,MultipartFile[] files){
		String picNames="";
		for (int i = 0; i < files.length; i++) {
			if (files[i]!=null) {
				String picName=getUUID();
				String filename=files[i].getOriginalFilename();
				String extname=filename.substring(filename.indexOf("."));
				
				try {
					files[i].transferTo(new File(path+picName+extname));
				} catch (Exception e) {
					e.printStackTrace();
				}
				picNames+=picName+extname+",";
			}
		}
		product.setImage(picNames.substring(0,picNames.length()-1));

	}
}

