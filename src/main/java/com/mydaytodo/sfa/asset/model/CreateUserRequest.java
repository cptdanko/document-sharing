package com.mydaytodo.sfa.asset.model;

import com.amazonaws.util.StringUtils;
import lombok.*;
import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@Builder
public class CreateUserRequest {
    private String role;
    private String name;
    private String userId;
    private String username;
    private Date dateJoined;
    private List<String> assetsUploaded;
    private String password;
    private String department;
    public static AssetUser convertRequest(CreateUserRequest request) {
        return AssetUser.builder()
                .role(request.getRole())
                .name(request.getName())
                .assetsUploaded(request.getAssetsUploaded())
                .userid(StringUtils.isNullOrEmpty(request.getUserId()) ? "": request.getUserId())
                .department(request.getDepartment())
                .dateJoined(request.getDateJoined())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
    }

}
