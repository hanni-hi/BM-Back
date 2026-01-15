package com.study.baemin.api.v1.user;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.service.UserService;
import com.study.baemin.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation (summary="All User API", description="전체 유저 목록")
    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<User>>> getAllUser(){
        return ResponseEntity.ok(ApiResponse.ok(userService.getAllUser()));
    }

    @Tag(name="Get User Target", description="타겟 유저 가져오기")
    @GetMapping("/target")
    public ResponseEntity<ApiResponse<User>> getUserTarget(@Parameter(description = "회원 ID", example = "sujin" , required = true) String id) {

        return ResponseEntity.ok(ApiResponse.ok(userService.getUserTarget(id)));
    }

    @Tag(name="Get User By Name", description="이름으로 유저 검색")
    @GetMapping("/findName")
    public ResponseEntity<ApiResponse<User>> getUserByName(String name) {

        return ResponseEntity.ok(ApiResponse.ok(userService.getUserTarget(name)));
    }

    @PostMapping("/create")
    public ResponseEntity<ApiResponse<String>> createUser(@RequestBody UserCreateRequestDto userCreateRequestDto){
        return ResponseEntity.ok(ApiResponse.ok(userService.createUser(userCreateRequestDto)));
    }
}
