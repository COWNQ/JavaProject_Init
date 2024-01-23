package com.omo.functions.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.omo.functions.domain.File;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author COWN-Q
 * @description 针对表【file】的数据库操作Mapper
 * @createDate 2024-01-23 11:07:57
 * @Entity com.omo.functions.domain.File
 */
@Mapper
public interface FileMapper extends BaseMapper<File> {

}




