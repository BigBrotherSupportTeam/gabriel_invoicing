package com.brother.support.mapper;

import java.util.List;

import com.brother.support.domain.OperationLogRecord;
import com.brother.support.domain.OperationLogRecordExample;
import org.apache.ibatis.annotations.Param;

public interface OperationLogRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    long countByExample(OperationLogRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int deleteByExample(OperationLogRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int deleteByPrimaryKey(Integer operationLogRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int insert(OperationLogRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int insertSelective(OperationLogRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    List<OperationLogRecord> selectByExample(OperationLogRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    OperationLogRecord selectByPrimaryKey(Integer operationLogRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") OperationLogRecord record, @Param("example") OperationLogRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int updateByExample(@Param("record") OperationLogRecord record, @Param("example") OperationLogRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int updateByPrimaryKeySelective(OperationLogRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log_record
     *
     * @mbg.generated Wed Jul 08 09:34:38 CST 2020
     */
    int updateByPrimaryKey(OperationLogRecord record);
}