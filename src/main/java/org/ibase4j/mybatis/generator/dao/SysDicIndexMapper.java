package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.SysDicIndex;

public interface SysDicIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int insert(SysDicIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    SysDicIndex selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    List<SysDicIndex> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysDicIndex record);
}