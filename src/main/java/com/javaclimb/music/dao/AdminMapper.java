package com.javaclimb.music.dao;

/**
 * 管理员dao
 */
public interface AdminMapper {

    /**
     * 验证密码是否正确
     */
    public int verifyPassword(String username, String password);
}
