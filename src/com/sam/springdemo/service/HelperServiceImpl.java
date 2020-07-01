package com.sam.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.springdemo.dao.HelperDAO;

@Service
public class HelperServiceImpl implements HelperService {

	@Autowired
	private HelperDAO helperDAO;
	@Override
	@Transactional
	public void insert(int oid, int cid) {
		// TODO Auto-generated method stub
		helperDAO.insert(oid,cid);
	}

}
