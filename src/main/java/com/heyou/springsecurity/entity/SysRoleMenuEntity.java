package com.heyou.springsecurity.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * @Description 角色与权限关系实体
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Data
public class SysRoleMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 角色ID
	 */
	private Long roleId;
	/**
	 * 权限ID
	 */
	private Long menuId;
}
