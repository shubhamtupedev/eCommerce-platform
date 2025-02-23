package com.ecommerce.userservice.service.impl;

import com.ecommerce.commonlib.dto.ResponseDto;
import com.ecommerce.commonlib.dto.UserRequestDto;
import com.ecommerce.commonlib.exception.AppServiceException;
import com.ecommerce.userservice.repository.UserRepository;
import com.ecommerce.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<ResponseDto<?>> register(UserRequestDto userRequestDto) throws AppServiceException {

        userRepository.save();
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto<?>> fetchUser() throws AppServiceException {
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto<?>> fetchUsers() throws AppServiceException {
        return userRepository.finda;
    }

    @Override
    public ResponseEntity<ResponseDto<?>> update(String username, UserRequestDto userRequestDto) throws AppServiceException {
        return null;
    }

    @Override
    public ResponseEntity<ResponseEntity<?>> delete(String username) throws AppServiceException {
        return null;
    }
}
