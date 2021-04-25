package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.dto.UserDto;
import com.bridgeit.model.Note;
import com.bridgeit.model.Team;
import com.bridgeit.model.User;
import com.bridgeit.model.UserOtp;



public interface UserDAO {
	
	/*public void addTeam(Team team);
	public void updateTeam(Team team);
	public Team getTeam(int id);
	public void deleteTeam(int id);
	public List<Team> getTeams();
	*/
	public void addUser(User user);
	public List<User> getUsers();
	public void updateUser(User user ,Integer id,User userCon);
	public User getUser(Integer id);
	public boolean sendOtp(User user);
	public boolean verifyOtp(UserOtp otp);
	public void deleteUser(Integer id);
	public UserDto logIn(User user);
	public boolean checkEmail(User user);
	public void verifyToken(String token);
	public void resetPassword(User tempUser);
	public List<UserOtp> getOtp();
	public boolean resetOtp(User user,String otp);
	public boolean active(int id);

}
