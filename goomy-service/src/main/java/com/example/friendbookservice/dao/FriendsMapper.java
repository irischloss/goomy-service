package com.example.friendbookservice.dao;

import com.example.friendbookservice.dto.Friends;
import com.example.friendbookservice.dto.FriendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    long countByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int deleteByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int insert(Friends row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int insertSelective(Friends row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    List<Friends> selectByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    Friends selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int updateByExampleSelective(@Param("row") Friends row, @Param("example") FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int updateByExample(@Param("row") Friends row, @Param("example") FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int updateByPrimaryKeySelective(Friends row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    int updateByPrimaryKey(Friends row);
}