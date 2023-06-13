package com.wjj.controller;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author :wjj
 * @date : 2023/4/10
 * @Description :
 */

//@RestController
//public class FileUploadController {
//
//// 注入文件的目录
//    @Value("${web.upload-path")
//    private String uploadPath;
//
//    DateFormat df = new SimpleDateFormat("yyyyMMdd");
//
////    虚拟路径的设置
//    @PostMapping("/upload")
//    public String upload(MultipartFile file, HttpServletRequest request)throws IOException {
//
//        //创建子目录，实现了在uploadPath 目录中通过日期对上传的文件归类保存
////        创建子目录
//        String format = df.format(new Date());
////        与父文件 + 子文件 拼接地址
//        File folder = new File(uploadPath + format);
////        判断 是否为正确目录地址 （指目录写法）
//        if(!folder.isDirectory()){
//            folder.mkdirs();
//        }
//
//        //对上传文件重命名，避免冲突
//        String oldName = file.getOriginalFilename();
//        String newName = null;
//        if(oldName != null){
//            newName = UUID.randomUUID()+oldName.substring(oldName.lastIndexOf("."));
//        }
//
//        System.out.println(folder);
//        // 上传，文件赋值搬运
//        file.transferTo(new File(folder,newName));
//
////        拼接返回上传后的访问路径
////        http://localhost:8080/
//        String filePath = request.getScheme()+"://" + request.getServerName() + ":" + request.getServerPort()+"/"+format + newName;
//        return filePath;
//
//    }

//
//}

    @RestController
public class FileUploadController {
    /**
     * 读取在yaml中自定义的目录
     *
     */
    @Value("${web.upload-path}")
    private  String uploadPath;


    DateFormat df=new SimpleDateFormat("yyyyMMdd");



    @PostMapping("upload")
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException {
        /**
         * 创建子目录
         */
        String format=df.format(new Date());
        File folder = new File(uploadPath + format);
        System.out.println(folder.toString());
        /**
         * 实现了在upload目录中通过日期对上传的文件归类保护
         */
        if (!folder.isDirectory()) {
            /**
             * 创建文件
             */
            boolean mkdirs = folder.mkdirs();
        }
        /**
         * 对上传文件重命名，避免冲突
         */
        String oldname = file.getOriginalFilename();
        String newname=null;
        if (oldname!=null) {
            newname= UUID.randomUUID()+oldname.substring(oldname.lastIndexOf("."));
        }
        /**
         * 上传，文件复制搬运
         */
        file.transferTo(new File(folder,newname));
        /**
         * 拼接返回上传后的访问路径
         * + request.getContextPath()
         */

        String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" + format + newname ;
        System.out.println(filePath);
        return filePath;
    }





}
