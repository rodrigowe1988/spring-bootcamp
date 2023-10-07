package com.backend.Catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInsertDTO extends UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String password;
}
