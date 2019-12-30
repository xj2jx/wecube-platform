package com.webank.wecube.platform.core.service.user;

import com.webank.wecube.platform.core.dto.CommonResponseDto;
import com.webank.wecube.platform.core.dto.user.RoleDto;
import com.webank.wecube.platform.core.dto.user.RoleMenuDto;
import com.webank.wecube.platform.core.dto.workflow.ProcDefInfoDto;
import com.webank.wecube.platform.core.dto.workflow.ProcRoleDto;

import java.util.List;
import java.util.Map;

/**
 * @author howechen
 */
public interface UserManagementService {
    CommonResponseDto createUser(String token, Map<String, Object> jsonObject);

    CommonResponseDto retrieveUser(String token);

    CommonResponseDto deleteUser(String token, Long id);

    CommonResponseDto createRole(String token, Map<String, Object> requestBody);

    CommonResponseDto retrieveRole(String token);

    CommonResponseDto deleteRole(String token, String id);

    CommonResponseDto getRolesByUserName(String token, String username);

    CommonResponseDto getUsersByRoleId(String token, String roleId);

    CommonResponseDto grantRoleToUsers(String token, String roleId, List<Object> userIdList);

    CommonResponseDto revokeRoleFromUsers(String token, String roleId, List<Object> jsonObject);

    RoleDto createRole(RoleDto roleDto);

    List<RoleDto> retrieveRole();

    List<RoleMenuDto> getMenusByUserName(String token, String username);

    List<String> getRoleIdListByUsername();
}
