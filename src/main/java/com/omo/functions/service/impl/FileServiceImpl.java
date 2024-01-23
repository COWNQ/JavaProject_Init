package com.omo.functions.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.omo.functions.domain.File;
import com.omo.functions.service.FileService;
import com.omo.functions.mapper.FileMapper;
import org.springframework.stereotype.Service;

/**
* @author COWN-Q
* @description 针对表【file】的数据库操作Service实现
* @createDate 2024-01-23 11:07:57
*/
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File>
    implements FileService{

}




