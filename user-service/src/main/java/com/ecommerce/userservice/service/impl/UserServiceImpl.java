package com.ecommerce.userservice.service.impl;

import com.ecommerce.commonlib.dto.ResponseDto;
import com.ecommerce.commonlib.dto.UserRequestDto;
import com.ecommerce.commonlib.exception.AppServiceException;
import com.ecommerce.commonlib.exception.AppValidationException;
import com.ecommerce.userservice.entity.Users;
import com.ecommerce.userservice.repository.UserRepository;
import com.ecommerce.userservice.service.UserService;
import org.hibernate.service.spi.ServiceException;
import org.modelmapper.ModelMapper;
import org.modelmapper.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<ResponseDto<?>> register(UserRequestDto userRequestDto) throws AppServiceException {
        try {
            Optional<Users> users = userRepository.findByUsernameAndEmail(userRequestDto.getUsername(), userRequestDto.getEmail());
            if (users.isPresent()){
                throw new AppValidationException()
            }

            userRepository.save();
        } catch (Exception exception) {
            throwAppServiceException(exception);
        }
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

    private void throwAppServiceException(Exception e) {
        throw new AppServiceException(e.getMessage());
    }
}
