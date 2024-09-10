package com.user.api.service;

import java.util.List;

import com.user.api.binding.CitizenApp;

public interface AppRegService {
	
	public String createCitizenApp(CitizenApp app);
	
	public List<CitizenApp> getApplication (Integer userID, String userType);

}
