package com.study.baemin.api.v1.user;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.entity.UserDetail;
import com.study.baemin.api.domain.user.service.UserService;
import com.study.baemin.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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

    @Operation (summary="All User Detail API", description="전체 유저 목록 상세")
    @GetMapping("/allDetail")
    public ResponseEntity<ApiResponse<List<UserDetail>>> getAllUserDetail(){
        return ResponseEntity.ok(ApiResponse.ok(userService.getAllUserDetail()));
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

    @Tag(name="유저 등록", description="유저 정보를 등록합니다.")
    @PostMapping("/insertUser")
    public ResponseEntity<ApiResponse<String>> insertUser
            (@RequestBody UserCreateRequestDto userCreateRequestDto){
        return ResponseEntity.ok(ApiResponse.ok(userService.insertUser(userCreateRequestDto)));
    }

    @Tag(name="유저 수정", description="유저 정보를 수정합니다.")
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<ApiResponse<String>> updateUserData
            (@Valid @PathVariable int id, @RequestBody UserCreateRequestDto userCreateRequestDto) {

        return ResponseEntity.ok(ApiResponse.ok(userService.updateUserData(id, userCreateRequestDto)));
    }

    @Tag(name="유저 삭제", description="유저 정보를 삭제합니다.")
    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<ApiResponse<String>> deleteUserByName(@Valid @PathVariable int id)
    {

        return ResponseEntity.ok(ApiResponse.ok(userService.deleteUserData(id)));
    }
}
