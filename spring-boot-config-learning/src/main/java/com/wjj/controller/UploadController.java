package com.wjj.controller;

import com.wjj.service.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * @ClassName: UploadController
 * @Author: lsc
 * @Date: 2023/03/16/16:18
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UploadController {
    private  final UploadService uploadService;
    @PostMapping("/upload")
    public String uploadFile(MultipartFile file){
        return uploadService.ossUpload(file);
    }
}
