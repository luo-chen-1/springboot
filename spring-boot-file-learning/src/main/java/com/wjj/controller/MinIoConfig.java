package com.wjj.controller;

import io.minio.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;

/**
 * @author :wjj
 * @date : 2023/4/10
 * @Description :
 */
@Configuration
public class MinIoConfig {


    @Value("${minio.endPoint}")
    private String endpoint;

    @Value("${minio.accessKey}")
    private String accessKey;

    @Value("${minio.secretKey}")
    private String secretKey;


    // minio提供的接口
    private MinioClient instance;

    @PostConstruct
    public void init(){
        instance = MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey,secretKey)
                .build();
    }

    /**
     * 判断 bucket 是否存在
     * @param bucketName bucket名称
     * @return boolean
     */

    public boolean bucketExists(String bucketName)throws Exception{
        return instance.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }

    /**
     * 创建 bucket
     * @param bucketName
     */

    public void makeBucket(String bucketName)throws Exception{
        boolean flag = bucketExists(bucketName);
        if(!flag){
            instance.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
    }

    /**
     *  文件上传
     * @param bucketName 存储桶名称
     * @param objectName    文件名称，对象名称
     * @param filePath  文件路径
     * @return  响应解构
     * @throws Exception Exception
     */

    public ObjectWriteResponse uploadObject(String bucketName,String objectName,String filePath) throws Exception{
        return instance.uploadObject(UploadObjectArgs.builder().bucket(bucketName).object(objectName).filename(filePath).build());
    }

    public ObjectWriteResponse putObject(String bucketName, String objectName, InputStream inputStream)throws  Exception{
        return instance.putObject(PutObjectArgs.builder().bucket(bucketName).object(objectName).stream(inputStream,-1,10485760).build());
    }

    public void removeObject(String bucketName,String objectName)throws Exception{
        instance.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
    }





}
