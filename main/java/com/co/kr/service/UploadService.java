package com.co.kr.service;


import java.util.List;
import java.util.HashMap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.co.kr.domain.BoardListDomain;
import com.co.kr.domain.BoardFileDomain;
import com.co.kr.vo.FileListVO;

public interface UploadService {
	
	public List<BoardListDomain> boardList();
	
	public int fileProcess(FileListVO fileListVO, MultipartHttpServletRequest request,
			HttpServlet httpReq);
	
	public void bdContentRemove(HashMap<String, Object> map);
	
	public void bdFileRemove(BoardFileDomain boardFileDomain);
	
    public BoardListDomain boardSelectOne(HashMap<String, Object> map);
    
    public List<BoardFileDomain> boardSelectOneFile(HashMap<String, Object> map);
}