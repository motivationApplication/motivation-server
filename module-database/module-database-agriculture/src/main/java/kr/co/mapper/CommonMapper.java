package kr.co.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper {
    String selectUUID();
}