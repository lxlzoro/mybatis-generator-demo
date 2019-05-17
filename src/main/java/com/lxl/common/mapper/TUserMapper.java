package com.lxl.common.mapper;

import com.lxl.common.entity.TUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_user (user_id, user_name, ",
        "user_password, user_email, ",
        "flag)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=CHAR}, ",
        "#{userPassword,jdbcType=CHAR}, #{userEmail,jdbcType=CHAR}, ",
        "#{flag,jdbcType=INTEGER})"
    })
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @InsertProvider(type=TUserSqlProvider.class, method="insertSelective")
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "user_id, user_name, user_password, user_email, flag",
        "from t_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.CHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.CHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.CHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER)
    })
    TUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Update({
        "update t_user",
        "set user_name = #{userName,jdbcType=CHAR},",
          "user_password = #{userPassword,jdbcType=CHAR},",
          "user_email = #{userEmail,jdbcType=CHAR},",
          "flag = #{flag,jdbcType=INTEGER}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TUser record);
}