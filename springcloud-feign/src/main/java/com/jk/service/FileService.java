package com.jk.service;

import java.util.List;

import com.jk.model.FileEntity;
import com.jk.model.FileEntity;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-provider-dhy")  //指定调用哪个服务
public interface FileService extends FileServiceApi{


}
