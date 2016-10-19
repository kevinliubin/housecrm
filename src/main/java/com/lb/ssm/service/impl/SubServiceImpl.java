package com.lb.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.lb.ssm.common.FtpUtil;
import com.lb.ssm.common.IDUtils;
import com.lb.ssm.mapper.SubdistrictMapper;
import com.lb.ssm.service.SubService;
import com.lb.ssm.vo.Subdistrict;
import com.lb.ssm.vo.SubdistrictExample;
import com.lb.ssm.vo.SubdistrictExample.Criteria;
/**
 * 房屋service
 * @author liubin
 *
 */
@Service
public class SubServiceImpl implements SubService{
	
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	
	//注入小区Mapper
	@Autowired
	private SubdistrictMapper subdistrictMapper;
	
	
	@Override
	public List<Subdistrict> getSubdistrictList(String limit,String offset) {
		//实例化查询
		SubdistrictExample example = new SubdistrictExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		List<Subdistrict> list = subdistrictMapper.selectByExample(example);
		return list;
	}


	@Override
	public void addSubWithFileUpload(Subdistrict subdistrict, MultipartFile[] myfiles) throws Exception {
		Subdistrict subdistrictInsert = null;
		//先插入对象，然后更新图片信息
		int suId = IDUtils.setUserId();
		subdistrict.setSubdistrictid(suId);
		int insertOrNot = subdistrictMapper.insertSelective(subdistrict);
		if (insertOrNot != 0) {
			subdistrictInsert = subdistrictMapper.selectByPrimaryKey(suId);
		}
		//定义一个次序
		int index = 0;
		for (MultipartFile uplodefile : myfiles) {
			//在服务器上存储的路径类似于http://192.168.209.129/images/2016-03-18/1458285042604847.jpg
			String oldName = uplodefile.getOriginalFilename();
			String newName = IDUtils.setUserId()+"";
			newName = newName +oldName.substring(oldName.lastIndexOf("."));
			//文件在服务器的存放路径 ，应该使用日起分隔的目录结构
			DateTime datetime = new DateTime();
			String filePath = datetime.toString("yyyy-MM-dd");
			
			FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, filePath, newName, uplodefile.getInputStream());
			index++;
			String url = IMAGE_BASE_URL+"/"+filePath+"/"+newName;
			if (index == 1) {
				subdistrictInsert.setSubdistrictpic(url);
			}else if (index == 2) {
				subdistrictInsert.setSubdistrictpic2(url);
			}else if (index == 3) {
				subdistrictInsert.setSubdistrictpic3(url);
			}
		}
		//更新subdistrictInsert
		subdistrictMapper.updateByPrimaryKeySelective(subdistrictInsert);
	}


	@Override
	public Subdistrict getSubdistById(Integer subId) {
		
		return subdistrictMapper.selectByPrimaryKey(subId);
	}


	@Override
	public void updateSubdistrict(Subdistrict subdistrict) {
		subdistrictMapper.updateByPrimaryKeySelective(subdistrict);
	}


	@Override
	public List<Subdistrict> getSubdistrictListByName(String name, String limit, String offset) {
		//实例化查询
		SubdistrictExample example = new SubdistrictExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		Criteria criteria = example.createCriteria();
		criteria.andSubdistrictnameLike(name);
		List<Subdistrict> list = subdistrictMapper.selectByExample(example);
		return list;
	}


	@Override
	public List<Subdistrict> getAllSubdist() {
		SubdistrictExample example = new  SubdistrictExample();
		//查询所有的小区信息，然后遍历，重新放进一个集合返回
		List<Subdistrict> list = subdistrictMapper.selectByExample(example);
		//定义一个新的集合
		List<Subdistrict> newList = new ArrayList<>();
		for (Subdistrict subdistrict : list) {
			//定义个新的对象
			Subdistrict subdistrict2 = new Subdistrict();
			subdistrict2.setSubdistrictid(subdistrict.getSubdistrictid());
			subdistrict2.setSubdistrictaddr(subdistrict.getSubdistrictaddr());
			subdistrict2.setSubdistrictbelong(subdistrict.getSubdistrictbelong());
			subdistrict2.setSubdistrictdiscribe(subdistrict.getSubdistrictdiscribe());
			subdistrict2.setSubdistrictname(subdistrict.getSubdistrictname());
			newList.add(subdistrict2);
		}
		return newList;
	}
	
}
