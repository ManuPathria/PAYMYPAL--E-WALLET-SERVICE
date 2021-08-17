package com.gfg.jbdl12majorproject.userservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SignUpRequest {
    private String username;
    private String password;
    private String email;
}
