package com.lb.ssm.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.lb.ssm.vo.Subdistrict;

public interface SubService {
	
	List<Subdistrict> getSubdistrictList(String limit,String offset);
	
	void addSubWithFileUpload(Subdistrict subdistrict,MultipartFile[] myfiles) throws Exception;
	
	Subdistrict getSubdistById(Integer subId);
	
	void updateSubdistrict(Subdistrict subdistrict);

	List<Subdistrict> getSubdistrictListByName(String name, String limit, String offset);
	
	List<Subdistrict> getAllSubdist();
}
