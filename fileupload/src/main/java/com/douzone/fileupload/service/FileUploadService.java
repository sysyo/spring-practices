package com.douzone.fileupload.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static String SAVE_PATH = "/upload-images";
	// resources mapping
	private static String URL_BASE = "/images"; 

	public static String restore(MultipartFile multipartFile) {
		String url = null;
		try {

			if (multipartFile.isEmpty()) {
				return url;
			}

			String originFilename = multipartFile.getOriginalFilename();
			String extName = originFilename.substring(originFilename.lastIndexOf('.') + 1);
			// substring -> originFilename.lastIndexOf('.')+1 자리부터 끝까지 문자열 자르기
			String saveFilename = generateSaveFilename(extName);
			long fileSize = multipartFile.getSize();

			System.out.println("##########" + originFilename);
			System.out.println("##########" + fileSize);
			System.out.println("##########" + saveFilename);

			byte[] data = multipartFile.getBytes();
			OutputStream os = new FileOutputStream(SAVE_PATH + "/" + saveFilename);
			// FileOutputStream : 데이터를 파일에 바이트 스트림으로 저장하기 위해 사용
			
			os.write(data);
			os.close();
			
			url = URL_BASE + "/" + saveFilename;
			
		} catch (IOException ex) {
			throw new RuntimeException("file upload error : " + ex);
		}
		return url;
	}

	private static String generateSaveFilename(String extName) {
		String filename = "";

		Calendar calendar = Calendar.getInstance();

		filename += calendar.get(Calendar.YEAR);
		filename += calendar.get(Calendar.MONTH);
		filename += calendar.get(Calendar.DATE);
		filename += calendar.get(Calendar.HOUR);
		filename += calendar.get(Calendar.MINUTE);
		filename += calendar.get(Calendar.SECOND);
		filename += calendar.get(Calendar.MILLISECOND);
		filename += ("." + extName);
		return filename;
	}

}
