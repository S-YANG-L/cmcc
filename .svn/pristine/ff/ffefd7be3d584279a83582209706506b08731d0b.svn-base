package com.htyw.app.community.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.community.pojo.CommunityNews;
import com.htyw.app.community.pojo.CommunityYpages;
import com.htyw.app.community.pojo.CommunityNote;
import com.htyw.app.community.service.CommunityNewsService;
import com.htyw.app.community.service.CommunityNoteService;
import com.htyw.app.community.service.CommunityYpagesService;
import com.htyw.app.utils.DocumentUtils;

@RestController
@RequestMapping(value = "community")
public class CommunityController {

	@Autowired
	private CommunityNewsService communityNewsService;
	
	@Autowired
	private CommunityYpagesService communityYpagesService;
	
	@Autowired
	private CommunityNoteService communityNoteService;
	
	private DocumentUtils documentUtils;
    /**
     * 获取社区信息列表
     * @param community_id：社区ID
     * @param type：消息类型
     * @return	List<CommunityNews>：信息列表
     */
	@RequestMapping(value = "getCommunityBulletin",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityBulletin(CommunityNews communityNews, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();			
		try {
			List<CommunityNews> list = communityNewsService.getCommunityBulletin(communityNews);
			for (CommunityNews communityNews2 : list) {
				String photo = communityNewsService.getPhoto(communityNews2.getImage());
				communityNews2.setImgUrl(photo);
			}
			result.put("list",list);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "failed");
			}
		return result;
	}
	
	  /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNews：详情信息
     */
	@RequestMapping(value = "getCommunityDetail",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityDetail(HttpServletRequest request, HttpServletResponse response){
		Long id = Long.parseLong(request.getParameter("id"));
		Map<String, Object> result = new HashMap<String, Object>();
		CommunityNews CommunityNews = communityNewsService.getCommunityDetail(id);
		if(CommunityNews != null || !"".equals(CommunityNews)){
			//String image = CommunityNews.getImage();
		//	if(image != null){
			//	image = documentUtils.httpRespString(image);
			//	CommunityNews.setImage(image);
			//}
			result.put("list",CommunityNews);
			result.put("code", "200");
			result.put("message", "success");
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		return result;
	}
	
	  /**
     * 获取社区黄页信息列表
     * @param community_id：社区ID
     * @return	List<CommunityYpages>：社区黄页信息列表
     */
	@RequestMapping(value = "getCommunityYpages",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityYpages(CommunityYpages communityYpages, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<CommunityYpages> list = communityYpagesService.getCommunityYpages(communityYpages);			
			for (CommunityYpages communityYpages2 : list) {
				String photo = communityYpagesService.getPhoto(communityYpages2.getImage());
				communityYpages2.setImgUrl(photo);
			}
			result.put("list", list);
			result.put("code", 200);
			result.put("message", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
	}
	
	  /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNews：详情信息
     */
	@RequestMapping(value = "getCommunityYpagesDetail",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityYpagesDetail(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		long pId = Long.parseLong(id);
		Map<String, Object> result = new HashMap<String, Object>();
		CommunityYpages communityYpages= communityYpagesService.selectByPrimaryKey(pId);
		if(communityYpages != null || !"".equals(communityYpages)){
			//String image = communityYpages.getImage();
			//if(image != null){
			//	image = documentUtils.httpRespString(image);
			//	communityYpages.setImage(image);
			//}
			result.put("communityYpages",communityYpages);
			result.put("code", "200");
			result.put("message", "success");
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		return result;
	}
	
	  /**
     * 获取社区信息列表
     * @return	社区信息列表
     */
	@RequestMapping(value = "getCommunityNote",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityNote(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		Long id = Long.valueOf(request.getParameter("userId"));
		String stype = request.getParameter("stype");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		Date dstart = null;
		Date dend = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		int size = Integer.valueOf(request.getParameter("size"));
		List<Map> list = new ArrayList<Map>();
		if(start.length() > 0){
			start = start.replaceAll("/", "-");
			try {
				dstart = sdf.parse(start);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(end.length() > 0){
			end = end.replaceAll("/", "-");
			try {
				dend = sdf.parse(end);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		try {
			list = communityNoteService.getNoteList(id, stype, dstart, dend);
			if(list.size() > 0){
				for(int i = 0; i < list.size(); i++){
					Map map = list.get(i);
					String ss = map.get("id")+"";
					map.put("sid",ss);
					//String url = (String) map.get("image");
				//if(url != null){
				//	String image = documentUtils.httpRespString(url);
				//	map.put("image", image);
				//}
				}
				result.put("list", list);
				result.put("code", "200");
				result.put("message", "success");
				
			}else{
				result.put("code", "201");
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
		
	}
	
	  /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNote：详情信息
     */
	@RequestMapping(value = "getCommunityNoteDetail",  method = RequestMethod.POST)
	public Map<String, Object> getCommunityNoteDetail(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		long pId = Long.parseLong(id);
		Map<String, Object> result = new HashMap<String, Object>();
		CommunityNote communityNote= communityNoteService.getCommunityDetail(pId);
		if(communityNote != null || !"".equals(communityNote)){
			//String image = communityNote.getImage();
			//if(image != null){
			//	image = documentUtils.httpRespString(image);
			//	communityNote.setImage(image);
			//}
			result.put("list",communityNote);
			result.put("code", "200");
			result.put("message", "success");
			System.out.println("result====="+result);
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		return result;
	}
	
	/**
	 * 根据ID修改未读状态
	 * @param state
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "updateState",  method = RequestMethod.POST)
	public Map<String, Object> updateState(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		Long id = Long.valueOf(request.getParameter("id"));
		String state = request.getParameter("state");
		try {
			int i = communityNoteService.updateState(state, id);
			if(1 == i){
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "201");
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 根据ID获取未读消息数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "getNum",  method = RequestMethod.POST)
	public Map<String, Object> getNum(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		Long id = Long.valueOf(request.getParameter("userId"));
		String stype = request.getParameter("stype");
//		int size = Integer.valueOf(request.getParameter("size"));
		try {
			int i = communityNoteService.getNum(id, stype);
			result.put("list", i);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
		
	}
	
	
}
