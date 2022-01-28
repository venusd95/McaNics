package com.mcanics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.mcanics.model.User;
import com.mcanics.payloads.request.UserRequest;
import com.mcanics.payloads.response.MessageResponse;


@Component
public interface UserService {
	MessageResponse createUser(UserRequest userRequest);
	Optional<User>updateUser(Integer userId,UserRequest userRequest);
     void deleteUser(Integer userId);
    User getASingleUser(Integer userId);
    List<User>getAllUser();
}
