package com.jk.role.service;

import com.jk.role.model.PowerInfo;
import com.jk.role.model.Role;

import java.util.List;

/**
 * @ClassName RoleService
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/4 19:05
 * @Version V1.0
 **/
public interface RoleService {
    List<Role> queryRole();

    void saveRolePower(Integer roleId, Integer[] powerIds);

    List<PowerInfo> queryPowerInfo(Integer powerId);
}
