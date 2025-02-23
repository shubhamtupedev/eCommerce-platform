package com.ecommerce.userservice.service;

import com.ecommerce.commonlib.dto.ResponseDto;
import com.ecommerce.commonlib.dto.UserRequestDto;
import com.ecommerce.commonlib.exception.AppServiceException;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<ResponseDto<?>> register(UserRequestDto userRequestDto) throws AppServiceException;

    public ResponseEntity<ResponseDto<?>> fetchUser() throws AppServiceException;

    public ResponseEntity<ResponseDto<?>> fetchUsers() throws AppServiceException;

    public ResponseEntity<ResponseDto<?>> update(String username, UserRequestDto userRequestDto) throws AppServiceException;

    public ResponseEntity<ResponseEntity<?>> delete(String username) throws AppServiceException;
}
