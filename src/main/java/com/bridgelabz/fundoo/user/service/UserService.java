package com.bridgelabz.fundoo.user.service;

import com.bridgelabz.fundoo.exception.UserDoesNotExistException;
import com.bridgelabz.fundoo.exception.VerificationFailedException;
import com.bridgelabz.fundoo.utility.Response;
import com.bridgelabz.fundoo.user.dto.ForgetPasswordDTO;
import com.bridgelabz.fundoo.user.dto.LoginDTO;
import com.bridgelabz.fundoo.user.dto.UserDTO;

public interface UserService {

public Response register(UserDTO userDto);
public Response login(LoginDTO loginDTO) throws UserDoesNotExistException ;
public Response forgetPassword(ForgetPasswordDTO forgetPassword) throws UserDoesNotExistException;
public String updateUser(LoginDTO loginDTO);
public Response verifyUser(String token) throws VerificationFailedException;
public Response verifyMail(String token,ForgetPasswordDTO forgetPasswordDTO) throws VerificationFailedException;
	
}
